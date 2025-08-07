# 📚 Library Management System

This is a **console-based Java application** that allows users to manage a simple library system. Users can add, list, search, delete, update, check out, and return books.

---

## 🚀 Features

- ➕ Add a new book
- 📋 List all books in the library
- 🔍 Search for a book by title
- ❌ Delete a book
- ✏️ Update a book's details
- 📦 Check out a book (mark as borrowed)
- ♻️ Return a book (mark as available)

---

## 🛠️ Technologies Used

- Java (JDK 8+)
- Scanner (for user input)
- ArrayList (for storing books in memory)
- Console-based user interface

---

## 📁 Project Structure

```
Library_Management_System/
│
├── Library_Management_System.java   # Main application with menu
├── My_Library.java                  # Operations like add, delete, search, update
└── Books.java                       # Book class (title, author, page count, status)
```

---

## 🧪 How to Run

1. Clone the repository or download the source files.
2. Compile the `.java` files:
   ```bash
   javac Library_Management_System.java My_Library.java Books.java
   ```
3. Run the application:
   ```bash
   java Library_Management_System
   ```

---

## 📸 Sample Output

```text
===== WELCOME TO LIBRARY MANAGEMENT SYSTEM =====
1 - Add a new book
2 - Display all books
3 - Search for a book by title
4 - Delete book
5 - Update book
6 - Check out a book
7 - Return a book
0 - Exit
Please make your choice:
```

---

## ✅ Example Book Format

```text
📖 The Alchemist - Paulo Coelho (197 pages) [✅ Available]
```

After check-out:

```text
📖 The Alchemist - Paulo Coelho (197 pages) [❌ Checked Out]
```

---

## 🧠 Author's Note

This project was created to practice object-oriented programming and console-based user interaction in Java. It can be extended by:
- Saving/loading books from a file
- Adding unique book IDs
- Creating a graphical user interface (GUI)

---

## 📄 License

This project is open source and free to use.