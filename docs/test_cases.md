# Library Management System - Test Cases

| Test ID | Test Scenario | Input | Expected Result | Status |
|---|---|---|---|---|
| TC01 | Add a new book | ISBN: 101 | Book added successfully | Pass |
| TC02 | Register a member | Member ID: M001 | Member registered successfully | Pass |
| TC03 | Display all books | Menu option 3 | Book details displayed | Pass |
| TC04 | Borrow a book | M001, ISBN 101 | Book borrowed successfully | Pass |
| TC05 | Display available books | Menu option 4 | Borrowed book not displayed | Pass |
| TC06 | Return a book | M001, ISBN 101 | Book returned successfully | Pass |
| TC07 | Search for a book | Java | Matching book displayed | Pass |
| TC08 | Add duplicate ISBN | ISBN: 101 | Duplicate book rejected | Pass |
| TC09 | Invalid menu choice | 9 | Invalid choice message displayed | Pass |
| TC10 | Exit application | Menu option 8 | Application exits successfully | Pass |

## Testing Summary

All the listed test scenarios were executed successfully. The application correctly handles book management, member registration, borrowing, returning, searching, and basic input validation.