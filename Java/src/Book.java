
public class Book
{
	private String Title;
	private String Genre;
	private String AuthorFName;
	private String AuthorLName;

	//Constructor
	public Book(String newTitle, String newGenre, String newAuthorFName, String newAuthorLName)
	{
		Title = newTitle;
		Genre = newGenre;
		AuthorFName = newAuthorFName;
		AuthorLName = newAuthorLName;
	}
	
	//Getters
	public String getTitle()
	{
		return Title;
	}
	
	public String getGenre()
	{
		return Genre;
	}
	public String getAuthorFName()
	{
		return AuthorFName;
	}
	
	public String getAuthorLName()
	{
		return AuthorLName;
	}
	
	
	//Setters
	public void setTitle(String newTitle)
	{
	    Title = newTitle;
	}
	
	public void setGenre(String newGenre)
	{
		Genre= newGenre;
	}
	
	public void setAuthorFName(String newAuthorFName)
	{
	    AuthorFName = newAuthorFName;
	}
	
	public void setAuthorLName(String newAuthorLName)
	{
	    AuthorLName = newAuthorLName;
	}
	
}


