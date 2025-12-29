package LW_05;
import java.util.*;
public class Library {
    private ArrayList<Book> stringList = new ArrayList<>();
    //method to add new item to the library
    public void addLibraryItem(Book borrowableItems){
        stringList.add(borrowableItems);
    }

    //method to check out item from the list
    public void checkoutBorrowableItem(String title){
         for(Book book: stringList){
             if(book.getTitle().equals(title) && book.isAvailable()){
                 System.out.println("The book you searched is available.");
                 System.out.println("cheecking out: " + book.getTitle());
                 book.setAvailable(false);
             }
         }
    }
    public  void listAvailableItems(){
        System.out.println("Available Book:");
        for (Book book:stringList){
            if(book.isAvailable()){
                System.out.println(book.getTitle());
            }
        }
    }
    public  void displayLibraryInfo(){
        int bookCount = 0;
        for(Book book : stringList){
            if (book.isAvailable()){
                bookCount++;
            }
        }
        System.out.println("Number of book available: " + bookCount);
    }
}
