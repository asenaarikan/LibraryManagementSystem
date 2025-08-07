import java.util.ArrayList;
import java.util.Scanner;

public class Library_Management_System {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        My_Library myLibrary= new My_Library();

        // Ana uygulama

        int choice;

        do {
            showMenu();
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    myLibrary.addBook();
                    break;
                case 2:
                    myLibrary.listBooks();
                    break;
                case 3:
                    myLibrary.searchBook();
                    break;
                case 4:
                    myLibrary.deleteBook();
                    break;
                case 5:
                    myLibrary.updateBook();
                    break;
                case 6:
                    myLibrary.checkOutBook();
                    break;
                case 7:
                    myLibrary.returnBook();
                    break;
                case 0:
                    System.out.println(" Exiting the program...");
                    break;
                default:
                    System.out.println(" Invalid choice!");
            }
        } while (choice != 0);

    }

    // Menü
    public static void showMenu() {
        System.out.println("\n===== WELCOME TO LIBRARY MANAGEMENT SYSTEM =====");
        System.out.println("1 - Add a new book");
        System.out.println("2 - Display all books");
        System.out.println("3 - Search for a book by title");
        System.out.println("4 - Delete book");
        System.out.println("5 - Update book");
        System.out.println("6 - Check out a book");
        System.out.println("7 - Return a book");
        System.out.println("0 - Exit");
        System.out.print("Please make your choice: ");
    }

}
