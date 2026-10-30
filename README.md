# Library Management System

## Project Overview
The Library Management System is a console-based Java application developed using Object-Oriented Programming (OOP) concepts. It helps manage books and library members while supporting book borrowing, returning, and searching operations.

## Features
- Add new books to the library.
- Register new library members.
- Display all books.
- Display available books.
- Search books by title, author, or genre.
- Borrow available books.
- Return borrowed books.
- Prevent duplicate book ISBNs and member IDs.
- Validate menu choices and book availability.

## Technologies Used
- Programming Language: Java
- IDE: Visual Studio Code
- Java Collections: ArrayList
- User Interface: Console-based menu

## Project Structure
```text
LibraryManagementSystem/
│
├── src/
│   ├── Book.java
│   ├── Member.java
│   ├── Library.java
│   └── LibrarySystem.java
│
└── README.md
```

## How to Run the Project

### 1. Compile the Java files
Open the terminal in the project directory and execute:

```bash
javac -d bin src\Book.java src\Member.java src\Library.java src\LibrarySystem.java
```

### 2. Run the application

```bash
java -cp bin LibrarySystem
```

### 3. Use the menu
Enter the corresponding menu number to perform an operation. Select option 8 to exit the application.

## OOP Concepts Implemented
- **Encapsulation:** Class fields are declared private and accessed through getter and setter methods.
- **Classes and Objects:** Book, Member, Library, and LibrarySystem represent different components of the application.
- **Constructors:** Constructors initialize book, member, and library objects.
- **Inheritance:** Not required in this project.
- **Relationships:** A library manages multiple books and members, while a member can borrow multiple books.

## Testing
The following operations were tested:
- Successful book addition.
- Successful member registration.
- Displaying books and checking availability.
- Successful book borrowing.
- Successful book returning.
- Searching for books.
- Duplicate ISBN validation.
- Invalid menu choice validation.
- Exiting the application.

## Conclusion
The project demonstrates the practical implementation of Java OOP concepts through a simple Library Management System. It provides basic book and member management functionality with borrowing and returning operations.