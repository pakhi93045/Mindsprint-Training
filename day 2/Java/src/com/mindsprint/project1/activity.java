package com.mindsprint.project1;

import java.util.Scanner;

class Book {
    private int bookId;
    private String title;
    private String author;
    private double price;

    // Constructor
    public Book(int bookId, String title, String author, double price) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    // Method to display book details
    public void displayBook() {
        System.out.println("\nBook Details:");
        System.out.println("ID: " + bookId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + String.format("%.2f", price));
    }
}

class Library {
    private Book[] books;
    private int numBooks;

    // Constructor
    public Library(int size) {
        books = new Book[size];
        numBooks = 0;
    }

    // Method to add a book
    public void addBook(Book book) {
        if (numBooks < books.length) {
            books[numBooks] = book;
            numBooks++;
        } else {
            System.out.println("Library is full!");
        }
    }

    // Method to display all books
    public void displayAllBooks() {
        if (numBooks == 0) {
            System.out.println("No books in library!");
            return;
        }
        for (int i = 0; i < numBooks; i++) {
            books[i].displayBook();
        }
    }

    // Method to search book by title
    public void searchByTitle(String searchTitle) {
        boolean found = false;
        for (int i = 0; i < numBooks; i++) {
            if (books[i].getTitle().toLowerCase().contains(searchTitle.toLowerCase())) {
                books[i].displayBook();
                found = true;
            }
        }
        if (!found) {
            System.out.println("No books found with title: " + searchTitle);
        }
    }

    // Method to find most expensive book
    public void findMostExpensiveBook() {
        if (numBooks == 0) {
            System.out.println("No books in library!");
            return;
        }
        Book mostExpensive = books[0];
        for (int i = 1; i < numBooks; i++) {
            if (books[i].getPrice() > mostExpensive.getPrice()) {
                mostExpensive = books[i];
            }
        }
        System.out.println("\nMost expensive book:");
        mostExpensive.displayBook();
    }
}

public class activity {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library(5);

        // Input 5 books
        for (int i = 0; i < 5; i++) {
            System.out.println("\nEnter details for Book " + (i + 1));

            System.out.print("Enter Book ID: ");
            int id = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            System.out.print("Enter Title: ");
            String title = scanner.nextLine();

            System.out.print("Enter Author: ");
            String author = scanner.nextLine();

            System.out.print("Enter Price: $");
            double price = scanner.nextDouble();

            Book book = new Book(id, title, author, price);
            library.addBook(book);
        }

        // Display all books
        System.out.println("\nAll Books in Library:");
        library.displayAllBooks();

        // Search for a book
        System.out.print("\nEnter title to search: ");
        scanner.nextLine(); // Consume newline
        String searchTitle = scanner.nextLine();
        library.searchByTitle(searchTitle);

        // Find most expensive book
        library.findMostExpensiveBook();

        scanner.close();
    }
}


