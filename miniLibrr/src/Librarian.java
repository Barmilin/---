public class Librarian {
    private String name;

    public Librarian(String name) {
        this.name = name;
    }

    public void issueBook(User user, Book book) {
        if (book.isAvailable()) {
            book.setAvailable(false);
            user.borrowBook(book);
            System.out.println(user.getName() + " borrowed the book: " + book.getTitle());
        } else {
            System.out.println("Book " + book.getTitle() + " is not available!");
        }
    }


    public void issueBook(User user, String title, Library library) {
        Book book = library.findBookByTitle(title);
        if (book != null) {
            issueBook(user, book);
        } else {
            System.out.println("Book with title '" + title + "' not found!");
        }
    }


    public void returnBook(User user, Book book) {
        if (user.getBorrowedBooks().contains(book)) {
            book.setAvailable(true);
            user.returnBook(book);
            System.out.println(user.getName() + " returned the book: " + book.getTitle());
        } else {
            System.out.println("User " + user.getName() + " doesn't have this book!");
        }
    }
}

