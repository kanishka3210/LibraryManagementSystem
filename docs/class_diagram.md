# Library Management System - Class Diagram

```mermaid
classDiagram
    class Book {
        -String isbn
        -String title
        -String author
        -String genre
        -boolean available
        +Book(isbn, title, author, genre)
        +getIsbn() String
        +getTitle() String
        +getAuthor() String
        +getGenre() String
        +isAvailable() boolean
        +setAvailable(boolean)
        +displayInfo()
    }

    class Member {
        -String memberId
        -String name
        -String contact
        -ArrayList~Book~ borrowedBooks
        +Member(memberId, name, contact)
        +borrowBook(Book) boolean
        +returnBook(Book) boolean
        +displayInfo()
    }

    class Library {
        -ArrayList~Book~ books
        -ArrayList~Member~ members
        +addBook(Book) boolean
        +addMember(Member) boolean
        +searchBooks(String) ArrayList
        +borrowBook(memberId, isbn) boolean
        +returnBook(memberId, isbn) boolean
        +displayAllBooks()
        +displayAvailableBooks()
    }

    class LibrarySystem {
        +main(String[] args)
    }

    Library "1" o-- "*" Book : manages
    Library "1" o-- "*" Member : registers
    Member "*" --> "*" Book : borrows
    LibrarySystem ..> Library : uses
```
