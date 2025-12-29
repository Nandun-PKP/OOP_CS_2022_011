package LW_03;
import java.util.*;
public class Q5 {
 abstract public static class BorrowableItems{
      abstract void displayInfo();
 }
 public static class Book extends BorrowableItems {
     private String title;
     private String author;
     private String ISBN;
     private boolean available;

     public Book(String title, String author, String ISBN, boolean available) {
         this.title = title;
         this.author = author;
         this.ISBN = ISBN;
         this.available = available;
     }

     public String getTitle() {
         return title;
     }

     public String getAuthor() {
         return author;
     }

     public String getISBN() {
         return ISBN;
     }

     public boolean isAvailable() {
         return available;
     }

     public void setTitle(String title) {
         this.title = title;
     }

     public void setAuthor(String author) {
         this.author = author;
     }

     public void setISBN(String ISBN) {
         this.ISBN = ISBN;
     }

     public void setAvailable(boolean available) {
         this.available = available;
     }
     @Override
     public void displayInfo(){
         System.out.println("   📚 Book Title: " + title);
         System.out.println("     Author: " + author);
         System.out.println("     ISBN: " + ISBN);
         System.out.println("     Status: " + (available ? "AVAILABLE" : "CHECKED OUT"));
     }
 }
 public static class Person{
     private  String name;

     public Person(String name) {
         this.name = name;
     }

     public String getName() {
         return name;
     }
 }
 public static class Student extends Person{
     public Student(String name) {
         super(name); // Call to the parent class constructor
     }
 }
 public static  class Library{
         // Using ArrayList to store BorrowableItems objects (Polymorphism)
         private List<BorrowableItems> borrowableItemsList;

         // Constructor
         public Library() {
             this.borrowableItemsList = new ArrayList<>();
         }

         // 1. Add library items to the collection
         public void addLibraryItem(BorrowableItems item) {
             this.borrowableItemsList.add(item);
             System.out.println("✅ Item added: " + ((Book)item).getTitle());
         }

         // 2. Check out library items (mark them as available or unavailable)
         public void checkoutItem(String title) {
             for (BorrowableItems item : borrowableItemsList) {
                 // Downcasting is needed to access Book-specific methods/properties
                 if (item instanceof Book) {
                     Book book = (Book) item;
                     if (book.getTitle().equalsIgnoreCase(title)) {
                         if (book.isAvailable()) {
                             book.setAvailable(false);
                             System.out.println("\nSuccessfully checked out: " + title);
                             return; // Exit after successful checkout
                         } else {
                             System.out.println("\nCheckout failed: " + title + " is already checked out.");
                             return;
                         }
                     }
                 }
             }
             System.out.println("\nCheckout failed: Book with title '" + title + "' not found.");
         }

         // 3. List all available library items
         public void listAvailableItems() {
             System.out.println("\n--- 📖 Available Library Items ---");
             int count = 0;
             for (BorrowableItems item : borrowableItemsList) {
                 // Polymorphism: all items are treated as BorrowableItems
                 if (item instanceof Book) {
                     Book book = (Book) item;
                     if (book.isAvailable()) {
                         book.displayInfo();
                         count++;
                     }
                 }
             }
             if (count == 0) {
                 System.out.println("No items are currently available.");
             }
             System.out.println("---------------------------------");
         }

         // 4. Display information about the library
         public void displayLibraryInfo() {
             System.out.println("\n=== 🏛️ Library Summary ===");
             int totalItems = borrowableItemsList.size();
             long availableItems = borrowableItemsList.stream()
                     .filter(item -> item instanceof Book)
                     .map(item -> (Book) item)
                     .filter(Book::isAvailable)
                     .count();

             System.out.println("Total number of items in the collection: " + totalItems);
             System.out.println("Total number of items currently available: " + availableItems);
             System.out.println("===========================");
         }
     }


    public static void main(String[] args) {

            // 1. Create instances of the Book class
            Book book1 = new Book("Seena Maragatham", "Sujatha Thilaka", "9789553023975", true);
            Book book2 = new Book("Nuramakadya Bauthika Nuladanayakshanamaala", "Seynamasasekaka", "9789553548721", true);
            Book book3 = new Book("Island of a Thousand Mirrors", "Nayomi Munaweera", "9781616953623", true);

            // Optional: Create a Student instance (Inheritance demonstration)
            Student student1 = new Student("Amara Perera");
            System.out.println("Student: " + student1.getName() + " created.");

            // 2. Create an instance of the Library class
            Library mainLibrary = new Library();

            // 3. Add the created books to the library's collection
            System.out.println("\nAdding books to the Library:");
            mainLibrary.addLibraryItem(book1);
            mainLibrary.addLibraryItem(book2);
            mainLibrary.addLibraryItem(book3);

            // 4. Display information about the library
            mainLibrary.displayLibraryInfo();

            // 5. List all available library items
            mainLibrary.listAvailableItems();

            // --- Demonstration of Checking Out ---

            // 6. Demonstrate checking out a library item
            String checkoutTitle = "Island of a Thousand Mirrors";
            mainLibrary.checkoutItem(checkoutTitle);

            // 7. List available items in the library again
            mainLibrary.listAvailableItems();

            // 8. Observe that the checked-out book is now marked as unavailable

            // Optional: Display library info again to see the count change
            mainLibrary.displayLibraryInfo();
        }
    }

