
import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books;
    private ArrayList<Member> members;

    // Constructor
    public Library() {
        books = new ArrayList<>();
        members = new ArrayList<>();
    }
  
    // Add a new book
    public boolean addBook(Book book) {

        if (book == null || findBookByIsbn(book.getIsbn()) != null) {
            return false;
        }

        books.add(book);
        return true;
    }

    // Register a new member
    public boolean addMember(Member member) {

        if (member == null || findMemberById(member.getMemberId()) != null) {
            return false;
        }

        members.add(member);
        return true;
    }
  
    // Find book using ISBN
    public Book findBookByIsbn(String isbn) {

        for (Book book : books) {
            if (book.getIsbn().equalsIgnoreCase(isbn)) {
                return book;
            }
        }

        return null;
    }

    // Find member using ID
    public Member findMemberById(String memberId) {

        for (Member member : members) {
            if (member.getMemberId().equalsIgnoreCase(memberId)) {
                return member;
            }
        }

        return null;
    }
  
    // Search books by title or author
    public ArrayList<Book> searchBooks(String keyword) {

        ArrayList<Book> results = new ArrayList<>();

        for (Book book : books) {

            if (book.getTitle().toLowerCase().contains(keyword.toLowerCase())
                || book.getAuthor().toLowerCase().contains(keyword.toLowerCase())
                || book.getGenre().toLowerCase().contains(keyword.toLowerCase())) {

                results.add(book);
            }
        }

        return results;
    }
 
    // Borrow a book
    public boolean borrowBook(String memberId, String isbn) {

        Member member = findMemberById(memberId);
        Book book = findBookByIsbn(isbn);

        if (member == null || book == null) {
            return false;
        }

        return member.borrowBook(book);
    }

    // Return a book
    public boolean returnBook(String memberId, String isbn) {

        Member member = findMemberById(memberId);
        Book book = findBookByIsbn(isbn);

        if (member == null || book == null) {
            return false;
        }

        return member.returnBook(book);
    }
  
    // Display all books
    public void displayAllBooks() {

        System.out.println("\n=== ALL BOOKS ===");

        if (books.isEmpty()) {
            System.out.println("No books found!");
            return;
        }

        for (Book book : books) {
            book.displayInfo();
        }
    }
  
    // Display available books
    public void displayAvailableBooks() {

        System.out.println("\n=== AVAILABLE BOOKS ===");

        boolean found = false;

        for (Book book : books) {

            if (book.isAvailable()) {
                book.displayInfo();
                found = true;
            }
        }

        if (!found) {
            System.out.println("No books available!");
        }
    }

}
