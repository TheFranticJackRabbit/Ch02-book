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
    private String refNumber;


    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, String bookpage, String ref)
    {
        author = bookAuthor;
        title = bookTitle;
        page= bookpage;
        refNumber = ref;
       
        
    }

    //**get all info from author to title 
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
//**kind of works/kinda doesnt to get the refnumber
public String getref()
{
    refNumber = ""; 
    return refNumber;


}
public void setref(String ref)
{ 
    if(ref.length() >= 3){
     refNumber = ref;
    }
    
    else if (ref.length() != 3){
        System.out.println("Error: The Reference must be at least " + " Three charaters long");
}
 }

public void printref()
{
    if (refNumber.length() == 3){
        System.out.println ("Reference number:" + refNumber);
    }
    else{
        System.out.println("Reference number:" + refNumber);
    }
    }

}
