package Items_sub.Office_supplies_sub;

import Items_sub.Office_supplies;

import java.util.LinkedList;

public class Book extends Office_supplies {
    public static LinkedList<Book> bookLinkedList = new LinkedList<>();
    private static int nextStock = 1;
    private Integer stock;
    private String publisher;
    private String author;
    private int pages;

    public Book(double price, String release_date, String cover_title,
                String publisher,String author, int pages) {
        super(price, release_date, cover_title);
        this.stock = nextStock++;
        this.publisher = publisher;
        this.author = author;
        this.pages = pages;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
    public void displayData() {
        System.out.println("ID: " + getId());
        System.out.println("Price: " + getPrice());
        System.out.println("Stock: " + getStock());
        System.out.println("Release Date: " + getRelease_date());
        System.out.println("Cover Title: " + getCover_title());
        System.out.println("Publiseher: " + getPublisher());
        System.out.println("Author: " + getAuthor());
        System.out.println("Pages: " + getPages());

    }
    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }
}
