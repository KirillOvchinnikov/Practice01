package ru.mirea.Practice01;

public class Book {
    private int NumberOfPages;
    private String TypeOfTheBook;

    public Book(int NumberOfPages, String TypeOfTheBook)
    {
        this.NumberOfPages = NumberOfPages;
        this.TypeOfTheBook = TypeOfTheBook;
    }

    public String toString()
    {
        return "Number of pages: "+NumberOfPages+";  "+"Type of the book: "+TypeOfTheBook;
    }

}
