/*
  BookTest.java
  This is my Assignment 1 program to do tests and git functions
  @author Bilqees Saban (219090866)
 */

package za.ac.cput_adp3;

public class Book
{
    private String BookTitle;
    private String BookAuthor;

    public Book()
    {
    }

    public Book(String BookTitle, String BookAuthor)
    {
        this.BookTitle = BookTitle;
        this.BookAuthor = BookAuthor;
    }

    public String getBookTitle()
    {
        return this.BookTitle;
    }

    public String getBookAuthor()
    {
        return this.BookAuthor;
    }

    public void setBookTitle(String BookTitle)
    {
        this.BookTitle = BookTitle;
    }

    public void setBookAuthor(String BookAuthor)
    {
        this.BookAuthor = BookAuthor;
    }

    public String toString()
    {
        return "Title: "+ BookTitle + "\n" + "Author: " + BookAuthor+ "\n";
    }
}
