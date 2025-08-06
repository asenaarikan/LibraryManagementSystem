import java.util.ArrayList;
import java.util.Scanner;

public class My_Library {
    static ArrayList<Books> myBooks = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);


    // Kitap ekleme

    public static void addBook() {
        System.out.print("Book title: ");
        String title = scanner.nextLine();
        System.out.print("Author name: ");
        String author = scanner.nextLine();
        System.out.print(" Page count: ");
        int page = scanner.nextInt();
        scanner.nextLine();

        myBooks.add(new Books(title, author, page));
        System.out.println("Book added successfully! ");
    }


    // Kitapları listeleme

    public static void listBooks() {
        if (myBooks.isEmpty()) {
            System.out.println("No books have been added yet.");
        } else {
            System.out.println("\n--- Books in the Library  ---");
            for (Books book : myBooks) {
                System.out.println(book);
            }
        }
    }


    // Kitap arama

    public static void searchBook() {
        System.out.print("Enter the book title to search: ");
        String search = scanner.nextLine().toLowerCase();
        boolean found = false;

        for (Books book : myBooks) {
            if (book.title.toLowerCase().contains(search)) {
                System.out.println("Found: " + book);
                found = true;
            }
        }

        if (!found) {
            System.out.println(" The book you searched for was not found");
        }
    }




    // Kitap silme

    public static void deleteBook() {

        System.out.print("Enter the book title to delete: ");
        String search = scanner.nextLine().toLowerCase();
        boolean deleted = false;

        for (int i = 0; i < myBooks.size(); i++) {
            if (myBooks.get(i).title.toLowerCase().equals(search)) {
                myBooks.remove(i);
                deleted = true;
                System.out.println("Book deleted successfully.");
                break;
            }
        }

        if (!deleted) {
            System.out.println("Book not found.");
        }
    }


    // Kitap güncelleme

    public static void updateBook() {
        System.out.print("Enter the book title to update:");
        String search = scanner.nextLine().toLowerCase();
        boolean updated = false;

        for (Books book : myBooks) {
            if (book.title.toLowerCase().equals(search)) {
                System.out.print("New title: ");
                book.title = scanner.nextLine();
                System.out.print("New author: ");
                book.author = scanner.nextLine();
                System.out.print("New page count: ");
                book.pageCount = scanner.nextInt();
                scanner.nextLine();
                System.out.println("✏️ Book updated successfully.");
                updated = true;
                break;
            }
        }

        if (!updated) {
            System.out.println("Book not found.");
        }
    }
}
