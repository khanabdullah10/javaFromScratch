package classesAndObjects.library;

import java.util.ArrayList;

public class Library_11 {

    String book_name;

    String author;

    Double price;

    // Constructor with parameters

    public Library_11(String book_name, String author, Double price) {

        this.book_name = book_name;

        this.author = author;

        this.price = price;

    }

    public Library_11() {

    }

    // toString method to display book details

    public String toString() {

        return "Book Name: " + book_name + " | Author: " + author + " | Price: " + price;

    }

    class Books {

        ArrayList<Library_11> books = new ArrayList<>();

        void addBook(Library_11 lib) {

            books.add(lib);

        }

        void removeBook(String author) {

            books.removeIf(library11 -> library11.author.equals(author));

        }

        public void display() {

            for (Library_11 lib : books) {

                System.out.println(lib);

            }

        }

    }

    public static void main(String[] args) {

        Library_11 book1 = new Library_11("The Man Who Knew Infinity", "Dr. Ramanujan", 359.6);

        Library_11 book2 = new Library_11("Atomic Habits", "James Clear", 250.0);

        Library_11.Books library = new Library_11().new Books();

        library.addBook(book1);

        library.addBook(book2);

        // Display all books in the library

        library.display();

        // Remove a book by author

        library.removeBook("James Clear");

        // Display remaining books in the library
        System.out.println();

        library.display();

    }

}