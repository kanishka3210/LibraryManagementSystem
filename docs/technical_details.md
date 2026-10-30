# Technical Details

## 1. Project Information
**Project Name:** Library Management System  
**Language:** Java  
**Application Type:** Console-Based Application  
**IDE:** Visual Studio Code  

## 2. Class Descriptions

### Book.java
- Stores book information such as ISBN, title, author, and genre.
- Maintains the availability status of each book.
- Provides getter and setter methods.
- Displays book details.

### Member.java
- Stores member ID, name, and contact information.
- Maintains a list of borrowed books.
- Supports borrowing and returning books.

### Library.java
- Manages books and registered members.
- Prevents duplicate ISBNs and member IDs.
- Searches books by title, author, or genre.
- Handles borrowing and returning operations.
- Displays all books and available books.

### LibrarySystem.java
- Contains the main method.
- Provides a menu-driven console interface.
- Accepts user input using the Scanner class.
- Connects user choices with library operations.

## 3. Data Structures
The application uses Java ArrayList to store:
- Book objects.
- Member objects.
- Books borrowed by each member.

## 4. Object-Oriented Programming Concepts
- Encapsulation
- Classes and Objects
- Constructors
- Methods
- Object Relationships

## 5. Validation
- Duplicate book ISBN validation.
- Duplicate member ID validation.
- Book availability validation.
- Member and book identification during borrowing and returning.
- Invalid menu choice handling.

## 6. Limitations
- Data is stored in memory and is not permanently saved.
- Records are cleared when the application terminates.
- The application uses a console-based interface.
- Due dates and fine calculations are not included.

## 7. Future Enhancements
- Database integration.
- Permanent storage of book and member records.
- Graphical user interface.
- Due-date and fine management.
