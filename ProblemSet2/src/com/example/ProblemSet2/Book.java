package com.example.ProblemSet2;

public class Book {
    private String title;
    private float price;
    private String ISBN;
    private int pages;

    public void setTitle(String title)
    {
        this.title = title;
    }//End of setTitle

    public String getTitle()
    {
        return title;
    }//End of getTitle

    public void setPrice(float price)
    {
        this.price = price;
    }//End of setPrice

    public float getPrice()
    {
        return price;
    }//End of getPrice

    public void setISBN(String ISBN)
    {
        this.ISBN = ISBN;
    }//End of setISBN

    public String getISBN()
    {
        return ISBN;
    }//End of getISBN

    public void setPages(int pages)
    {
        this.pages = pages;
    }//End of setPages

    public int getPages()
    {
        return pages;
    }//End of getPages

    public Book()
    {
        /*title = "No Title";
        price = 0.00f;
        ISBN = "No ISBN";
        pages = 0;*/
        this("No Title", 0.00f, "No ISBN", 0);
    }//End of Book

    public Book(String title, float price, String ISBN, int pages)
    {
        setTitle(title);
        setPrice(price);
        setISBN(ISBN);
        setPages(pages);
    }//End of second Book

    public String toString()
    {
        return String.format("Title %-20s Price %-5.2f ISBN %-13s Pages %-5d", title, price, ISBN, pages);
    }

}//End of class
