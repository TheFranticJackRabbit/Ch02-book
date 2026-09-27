/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (Insert your name here.)
 * @version (Insert today's date here.)
 */
public class Book
{
    // The fields.
    private String author;
    private String title;
    private String page;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, String bookpage)
    {
        author = bookAuthor;
        title = bookTitle;
        page= bookpage;
       
        
    }

    
    /**
     * getAuthor
     * @return name of author
     */
    
    public String getAuthor()
    
    {
   
    return author;   
    
}
public void printAuthor()
{
    System.out.println("Author:" +author);
}


public String getBook()
{
    return title;
    
}
public void printTitle()
{
    System.out.println("Book Title" + title);
}
public String getPages()
{
    return page;
}
public void printPages()
{
    System.out.println("pages:" + page);
}
public void printDetails()
{
    System.out.println("Author:" + author);
    System.out.println("Title:" + title);
    System.out.println("Pages:" + page);
}
}
