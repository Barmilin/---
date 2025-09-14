public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        library.addBook(new Book("Misery", "Stephen King", 1987));
        library.addBook(new Book("Dune", "Frank Herbert", 1965));

        User user1 = new User("John");
        Librarian librarian = new Librarian("Mr.White");

        library.displayBooks();
        System.out.println("Total books: " + Library.getTotalBooks());

        librarian.issueBook(user1, "Misery", library);
        librarian.issueBook(user1, "Dune", library);


        Book miseryBook = library.findBookByTitle("Misery");
        librarian.returnBook(user1, miseryBook);


        library.displayBooks();
    }
}


