import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.io.IOException;
import java.util.ArrayList;
import com.mysql.jdbc.Statement;

public class BookDriver 
 
{
	private static ArrayList<Book> Books = new ArrayList<Book>();
	private int currentIndex;
	
	public BookDriver()
	{
		InitializeBooks();
		currentIndex = 0;
	}

    public static void main(String[] args) 
	{
	
	}

    private void InitializeBooks()
    {
    	//Connecting to the database
		try 
		{
       		Class.forName("com.mysql.jdbc.Driver");
       		Connection con = DriverManager
       				.getConnection("jdbc:mysql://localhost/projectstep3?user=root&password=ics311");
       		//System.out.println("Connection Object Created : " + con);
    
       		Statement st = (Statement) con.createStatement();
       		ResultSet rs = st.executeQuery("select b.title, g.gen_name, a.fname, a.lname from projectstep3.book b join bookgenre bg on b.isbn= bg.isbn join genre g on bg.gen_id= g.gen_id join bookauthor ba on b.isbn= ba.isbn join author a on ba.auth_id= a.auth_id;;");

       		while (rs.next()) 
       		{  
       			Book book = new Book(rs.getString("title"), rs.getString("gen_name"), rs.getString("fname"), rs.getString("lname"));
       			Books.add(book);
       		}

       		st.close();
       		rs.close();
	       		
		} 
		catch (Exception ex) 
		{ 
			ex.printStackTrace();
		}
    }
    
    public ArrayList<Book> GetBooks()
    {
    	return Books;
    }
    
    public Book GetFirstBook()
    {
    	currentIndex = 0;
    	return Books.get(0);
    }
    
    public Book GetLastBook()
    {
    	currentIndex = Books.size() - 1;
    	return Books.get(currentIndex);
    }
    
    public Book GetPrevBook()
    {
    	currentIndex--;
    	
    	if(currentIndex < 0)
    		currentIndex = 0;
    	
    	return Books.get(currentIndex);
    }
    
    public Book GetNextBook()
    {
    	currentIndex++;
    	
    	if(currentIndex > Books.size() - 1)
    		currentIndex = Books.size() - 1;
    	
    	return Books.get(currentIndex);
    }
}

