import java.util.ArrayList;
import java.util.List;

public class Library {
    private static int totalBooks = 0; // статическая переменная
    private List<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        totalBooks++;
    }

    public Book findBookByTitle(String title) {
        for (Book b : books) {
            if (b.getTitle().equalsIgnoreCase(title)) {
                return b;
            }
        }
        return null;
    }

    public void displayBooks() {
        System.out.println("Books in library:");
        for (Book b : books) {
            System.out.println(b);
        }
    }

    public static int getTotalBooks() {
        return totalBooks;
    }
}
