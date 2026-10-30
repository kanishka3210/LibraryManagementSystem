
import java.util.Scanner;
import java.util.ArrayList;

public class LibrarySystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Library library = new Library();

        int choice;

        do {
            System.out.println("\n================================");
            System.out.println("    LIBRARY MANAGEMENT SYSTEM");
            System.out.println("================================");
            System.out.println("1. Add New Book");
            System.out.println("2. Register New Member");
            System.out.println("3. Display All Books");
            System.out.println("4. Display Available Books");
            System.out.println("5. Search Books");
            System.out.println("6. Borrow Book");
            System.out.println("7. Return Book");
            System.out.println("8. Exit");
            System.out.println("================================");

            System.out.print("Enter your choice: ");

            while (!sc.hasNextInt()) {
                System.out.println("Please enter a valid number.");
                sc.nextLine();
                System.out.print("Enter your choice: ");
            }

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.println("\n=== ADD NEW BOOK ===");

                    System.out.print("Enter ISBN: ");
                    String isbn = sc.nextLine();

                    System.out.print("Enter Title: ");
                    String title = sc.nextLine();

                    System.out.print("Enter Author: ");
                    String author = sc.nextLine();

                    System.out.print("Enter Genre: ");
                    String genre = sc.nextLine();

                    Book book = new Book(isbn, title, author, genre);

                    if (library.addBook(book)) {
                        System.out.println("Book added successfully!");
                    } else {
                        System.out.println("Book already exists or invalid!");
                    }
                    break;

                case 2:
                    System.out.println("\n=== REGISTER NEW MEMBER ===");

                    System.out.print("Enter Member ID: ");
                    String memberId = sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Contact: ");
                    String contact = sc.nextLine();

                    Member member = new Member(memberId, name, contact);

                    if (library.addMember(member)) {
                        System.out.println("Member registered successfully!");
                    } else {
                        System.out.println("Member already exists or invalid!");
                    }
                    break;

                case 3:
                    library.displayAllBooks();
                    break;

                case 4:
                    library.displayAvailableBooks();
                    break;

                case 5:
                    System.out.println("\n=== SEARCH BOOKS ===");

                    System.out.print("Enter title, author or genre: ");
                    String keyword = sc.nextLine();

                    ArrayList<Book> results = library.searchBooks(keyword);

                    if (results.isEmpty()) {
                        System.out.println("No matching books found!");
                    } else {
                        System.out.println("\n=== SEARCH RESULTS ===");

                        for (Book result : results) {
                            result.displayInfo();
                        }
                    }
                    break;

                case 6:
                    System.out.println("\n=== BORROW BOOK ===");

                    System.out.print("Enter Member ID: ");
                    String borrowMemberId = sc.nextLine();

                    System.out.print("Enter Book ISBN: ");
                    String borrowIsbn = sc.nextLine();

                    if (library.borrowBook(borrowMemberId, borrowIsbn)) {
                        System.out.println("Book borrowed successfully!");
                    } else {
                        System.out.println("Borrowing failed!");
                        System.out.println("Check Member ID, ISBN and book availability.");
                    }
                    break;

                case 7:
                    System.out.println("\n=== RETURN BOOK ===");

                    System.out.print("Enter Member ID: ");
                    String returnMemberId = sc.nextLine();

                    System.out.print("Enter Book ISBN: ");
                    String returnIsbn = sc.nextLine();

                    if (library.returnBook(returnMemberId, returnIsbn)) {
                        System.out.println("Book returned successfully!");
                    } else {
                        System.out.println("Return failed!");
                        System.out.println("Check Member ID and borrowed book details.");
                    }
                    break;

                case 8:
                    System.out.println("\nThank you for using Library Management System!");
                    break;

                default:
                    System.out.println("Invalid choice! Please select 1-8.");
            }

        } while (choice != 8);

        sc.close();
    }
}
