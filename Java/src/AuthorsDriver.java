import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.io.IOException;
import java.util.ArrayList;
import com.mysql.jdbc.Statement;

public class AuthorsDriver 
{
	private static ArrayList<Author> authors = new ArrayList<Author>();
	private int currentIndex;
	
	public AuthorsDriver()
	{
		InitializeAuthors();
		currentIndex = 0;
	}

    public static void main(String[] args) 
	{
	
	}

    private void InitializeAuthors()
    {
    	//Connecting to the database
		try 
		{
       		Class.forName("com.mysql.jdbc.Driver");
       		Connection con = DriverManager
       				.getConnection("jdbc:mysql://localhost/projectstep3?user=root&password=ics311");
       		//System.out.println("Connection Object Created : " + con);
    
       		Statement st = (Statement) con.createStatement();
       		ResultSet rs = st.executeQuery("SELECT * FROM projectstep3.author;");

       		while (rs.next()) 
       		{  
       			Author author = new Author(rs.getInt("auth_id"), rs.getString("fname"), rs.getString("lname"), rs.getString("bdate"));
       			authors.add(author);
       		}

       		st.close();
       		rs.close();
	       		
		} 
		catch (Exception ex) 
		{ 
			ex.printStackTrace();
		}
    }
    
    public ArrayList<Author> GetAuthors()
    {
    	return authors;
    }
    
    public Author GetFirstAuthor()
    {
    	currentIndex = 0;
    	return authors.get(0);
    }
    
    public Author GetLastAuthor()
    {
    	currentIndex = authors.size() - 1;
    	return authors.get(currentIndex);
    }
    
    public Author GetPrevAuthor()
    {
    	currentIndex--;
    	
    	if(currentIndex < 0)
    		currentIndex = 0;
    	
    	return authors.get(currentIndex);
    }
    
    public Author GetNextAuthor()
    {
    	currentIndex++;
    	
    	if(currentIndex > authors.size() - 1)
    		currentIndex = authors.size() - 1;
    	
    	return authors.get(currentIndex);
    }
}
