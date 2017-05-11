import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import com.mysql.jdbc.Statement;

public class ISBNDriver 
{
	//Constructor
	public ISBNDriver()
	{
		
	}

    public static void main(String[] args) 
	{
	
	}

    public Book GetBookByISBN(String isbn)
    {
    	Book book = new Book("No Results", "", "","");
    	//Connecting to the database
		try 
		{
       		Class.forName("com.mysql.jdbc.Driver");
       		Connection con = DriverManager
       				.getConnection("jdbc:mysql://localhost/projectstep3?user=root&password=ics311");
       		//System.out.println("Connection Object Created : " + con);
    
       		Statement st = (Statement) con.createStatement();
       		ResultSet rs = st.executeQuery("select b.title, a.fname, a.lname from projectstep3.book b join bookauthor ba on b.isbn= ba.isbn join author a on ba.auth_id= a.auth_id where b.isbn = "+ isbn + ";");

       		if(rs.first())
       		{
       			book = new Book(rs.getString("title"), "", rs.getString("fname"), rs.getString("lname"));
       		}

       		st.close();
       		rs.close();
	       		
		} 
		catch (Exception ex) 
		{ 
			ex.printStackTrace();
		}
		return book;
    }
   
}