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
    private String pages;
    private String refNumber;
     int borrowed; 
    public boolean courseText;


    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, String bookPages,boolean isCourseText)

    {
        author = bookAuthor;
        title = bookTitle;
        refNumber = "";
        pages = bookPages;
        borrowed = 0;
        courseText = isCourseText;


       
        
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
    System.out.println("Book Title:" + title);
}
public String getPages()
    {
        return pages;
    }
public void printPages()
{
    System.out.println("Pages:" + pages);
}

public void printDetails()
{
    System.out.println("Author:" + author);
    System.out.println("Title:" + title);
    System.out.println("Pages:" + pages);
    if(refNumber.length() > 0) {
            System.out.println("Reference number: " + refNumber);
        }
        else {
            System.out.println("Reference number: ZZZ");
        }
        System.out.println("Borrowed: " + borrowed + " times");
    }


//**kind of works/kinda doesnt to get the refnumber
public void setRefNumber(String ref)
{
    if (ref.length() >=3) {
       refNumber = ref;
 
    }
    else{
        System.out.println("Error: the reference number must be at least "
                               + "three characters long.");

    }
    }
    
    public String getRefNumber()
    {
        return refNumber;

}
  public void borrow()
    {
        borrowed = borrowed + 1;

}
 public int getBorrowed()
    {
        return borrowed;
    }
 public boolean isCourseText()
    {
        return courseText;
    }


}