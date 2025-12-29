package LW_05;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Seena Maragathan","Sujatha Thilaka", "4645465489",true);
        Book book2 = new Book("Aeena Maragathan","Lujatha Thilaka", "4645465480",true);
        Book book3 = new Book("Beena Maragathan","Kujatha Thilaka", "4645465488",true);

        Library FCTLibrary = new Library();
        FCTLibrary.addLibraryItem(book1);
        FCTLibrary.addLibraryItem(book2);
        FCTLibrary.addLibraryItem(book3);

        FCTLibrary.displayLibraryInfo();
        FCTLibrary.listAvailableItems();
        FCTLibrary.checkoutBorrowableItem("imkltddf");
        FCTLibrary.listAvailableItems();
    }
}
