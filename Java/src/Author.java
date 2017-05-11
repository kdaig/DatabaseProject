
public class Author 
{
	private int AuthorID;
	private String FirstName;
	private String LastName;
	private String Birthday;

	//Constructor
	public Author(int newID, String newFirstName, String newLastName, String newBirthday)
	{
		AuthorID = newID;
		FirstName = newFirstName;
		LastName = newLastName;
		Birthday = newBirthday;
	}
	
	//Getters
	public int getAuthorID()
	{
		return AuthorID;
	}
	
	public String getFirstName()
	{
		return FirstName;
	}
	
	public String getLastName()
	{
		return LastName;
	}
	
	public String getBirthday()
	{
		return Birthday;
	}
	
	//Setters
	public void setAuthorID(int newID)
	{
	    AuthorID = newID;
	}
	
	public void setFirstName(String newFirstName)
	{
	    FirstName = newFirstName;
	}
	
	public void setLastName(String newLastName)
	{
	    LastName = newLastName;
	}
	
	public void setBirthday(String newBirthday)
	{
	    Birthday = newBirthday;
	}

	
}


