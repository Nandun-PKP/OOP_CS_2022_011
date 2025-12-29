
import java.util.*;

// 1. BorrowableItems - මේක තමයි මව් පන්තිය (Abstract Class)
abstract class BorrowableItems {
    public abstract void displayInfo();
}

// 2. Book - BorrowableItems පන්තියෙන් උරුම වූ පන්තිය
class Book extends BorrowableItems {
    private String title;
    private String author;
    private String ISBN;
    private boolean available;

    // Constructor එක - පොතක් මුලින්ම හදද්දී විස්තර ඇතුළත් කිරීමට
    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.available = true; // මුලින්ම පොතක් තිබේ (true) ලෙස සකසයි
    }

    // Getters and Setters - දත්ත ලබාගැනීමට සහ වෙනස් කිරීමට
    public String getTitle() { return title; }
    public void setAvailable(boolean available) { this.available = available; }
    public boolean isAvailable() { return available; }

    // Abstract method එක ක්‍රියාත්මක කිරීම (Implementation)
    @Override
    public void displayInfo() {
        System.out.println("නම: " + title + " | කර්තෘ: " + author + " | ISBN: " + ISBN + " | තත්ත්වය: " + (available ? "තිබේ" : "නිකුත් කර ඇත"));
    }
}

// 3. Person සහ Student පන්ති (Inheritance පෙන්වීමට)
class Person {
    private String name;
    public Person(String name) { this.name = name; }
}

class Student extends Person {
    public Student(String name) { super(name); }
}

// 4. Library - මුළු පද්ධතියම කළමනාකරණය කරන පන්තිය
class Library {
    // ArrayList එකක් භාවිතා කර පොත් ගබඩා කිරීම
    private ArrayList<BorrowableItems> borrowableItemsList = new ArrayList<>();

    // පොත් එකතු කිරීමේ Method එක
    public void addLibraryItem(BorrowableItems item) {
        borrowableItemsList.add(item);
    }

    // පොතක් පිටතට දීම (Checkout)
    public void checkoutItem(String title) {
        for (BorrowableItems item : borrowableItemsList) {
            if (item instanceof Book) {
                Book book = (Book) item;
                if (book.getTitle().equalsIgnoreCase(title)) {
                    book.setAvailable(false);
                    System.out.println("\n>>> " + title + " පොත නිකුත් කරන ලදී.");
                }
            }
        }
    }

    // දැනට ඉතිරිව ඇති පොත් ලැයිස්තුව
    public void listAvailableItems() {
        System.out.println("\n--- දැනට පුස්තකාලයේ ඇති (Available) පොත් ---");
        for (BorrowableItems item : borrowableItemsList) {
            if (item instanceof Book && ((Book) item).isAvailable()) {
                item.displayInfo();
            }
        }
    }

    // පුස්තකාලයේ සම්පූර්ණ තොරතුරු පෙන්වීම
    public void displayLibraryInfo() {
        int total = borrowableItemsList.size();
        int availableCount = 0;
        for (BorrowableItems item : borrowableItemsList) {
            if (item instanceof Book && ((Book) item).isAvailable()) {
                availableCount++;
            }
        }
        System.out.println("\n==============================");
        System.out.println("පුස්තකාල තොරතුරු:");
        System.out.println("මුළු අයිතම ගණන: " + total);
        System.out.println("ලබාගත හැකි පොත් ගණන: " + availableCount);
        System.out.println("==============================");
    }
}

// 5. Main Class - වැඩසටහන ආරම්භ වන ස්ථානය
public class LibrarySystem {
    public static void main(String[] args) {
        Library myLibrary = new Library();
        Scanner scanner = new Scanner(System.in);

        // පොත් නිර්මාණය කිරීම
        Book b1 = new Book("Seena Maragatham", "Sujatha Thilaka", "9789553023975");
        Book b2 = new Book("Nuramakadya Bauthika Nuladanayakshanamaala", "Seynamasasekaka", "9789553548721");
        Book b3 = new Book("Island of a Thousand Mirrors", "Nayomi Munaweera", "9781616953623");

        // පොත් එකතු කිරීම
        myLibrary.addLibraryItem(b1);
        myLibrary.addLibraryItem(b2);
        myLibrary.addLibraryItem(b3);


        while(true) {
            System.out.println("1.Display Library Items");
            System.out.println("2.Add Library Item");
            System.out.println("3.Get Library Item");
            System.out.println("3.Remove Library Item");
            System.out.println("4.Exit the Library Item");
            System.out.print("Enter Number for your choice:");

            int x = scanner.nextInt();
            switch (x) {
                case 1:
                    myLibrary.displayLibraryInfo();
                    myLibrary.listAvailableItems();
                    break;
                case 2:
                    scanner.nextLine();
                    System.out.print("Enter book title:");
                    String title = scanner.nextLine();
                    System.out.print("Enter Author name:");
                    String Author = scanner.nextLine();
                    System.out.print("Enter ISBN code:");
                    String Isbn = scanner.nextLine();
                    Book y = new Book(title,Author,Isbn);
                    myLibrary.addLibraryItem(y);
                    System.out.println("Book added successfully!");
                    break;
                case 3:
                    System.out.print("Enter book name:");
                    String bname = scanner.next();
                    myLibrary.checkoutItem(bname);
                    break;
                case 4:
                    myLibrary.checkoutItem("Island of a Thousand Mirrors");
                    break;
                case 5:
                    System.out.println("Thank you");
                    System.exit(0);
                default:
                    System.out.println("Check you input and enter the correct inputs");
            }
        }

    }
}