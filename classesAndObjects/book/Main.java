package classesAndObjects.book;
import java.util.*;
class Book {
    String title;
    String author;
    String isbn;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    void dsplayInfo() {
        System.out.println("Title - " + title);
        System.out.println("Author - " + author);
        System.out.println("ISBN - " + isbn);

    }
}
    class Library {
        ArrayList<Book> books = new ArrayList<>();

        void addBook(Book book) {
            books.add(book);
            System.out.println("Book added : " + "Title-"+book.title+" Author-"+ book.author+" ISBN-"+book.isbn);
        }


        void removeBook(String title) {
            for (int i = 0; i < books.size(); i++) {
                if (books.get(i).title.equals(title)) books.remove(i);
            }
            System.out.println("The book " + title + " is remove");
        }

        void display() {
            for (Book book : books) {
                book.dsplayInfo();
                System.out.println();

            }

        }
    }




public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("The man who knew infinity","Dr. Ram anujan","123ABC");
        Book book2 = new Book("Atomic Habits","Jorge hellam","456EFG");
        Book book3 = new Book("Human pyschology","Dr.Arpana","789HIJ");
        Library library = new Library();
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        System.out.println("\nAll books in the Library ar as follows :");
        library.display();
        library.removeBook("Human pyschology");
        System.out.println("\nBooks after removal");
        library.display();

    }
}
