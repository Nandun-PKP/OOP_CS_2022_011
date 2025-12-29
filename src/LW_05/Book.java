package LW_05;

public class Book extends BorrowableItems{
    private  String title;
    private String author;
    private String ISBN;
    private boolean available;

    public Book(String title, String author, String ISBN, boolean available) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.available = available;
    }

    public String getAuthor() {return author;}
    public String getTitle() {return title;}
    public String getISBN() {return ISBN;}
    public boolean isAvailable() {return available;}

    public void setTitle(String title) {this.title = title;}
    public void setAuthor(String author) {this.author = author;}
    public void setISBN(String ISBN) {this.ISBN = ISBN;}
    public void setAvailable(boolean available) {this.available = available;}

    @Override
    public void displayInfo() {
        System.out.println("Title ");

    }
}
