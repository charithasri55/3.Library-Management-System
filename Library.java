
import java.util.ArrayList;

public class Library {

    private ArrayList<Book> b;
    private ArrayList<User> u;

    public Library() {
        b = new ArrayList<>();
        u = new ArrayList<>();
    }

    //Add Book
    public void addBook(Book book) {
        b.add(book);
        System.out.println("----Book Successfully Added----");
    }

    //Add User
    public void addUser(User user) {
        u.add(user);
        System.out.println("----User Successfully Added----");
    }

    //View Books
    public void viewBooks() {
        if (b.isEmpty()) {
            System.out.println("----No Books Available----");
            return;
        }
        System.out.println("\n====Books Details====");
        for (Book book : b) {
            book.displayBook();
        }

    }

    //View Users
    public void viewUsers() {
        if (u.isEmpty()) {
            System.out.println("----No Users Found----");
            return;
        }
        System.out.println("\n====User Details====");
        for (User user : u) {
            user.displayUser();
        }
    }

    //issue book
    public void bookIssue(int bookId, int userId) {
        Book selectedBook = null;
        User selectedUser = null;

        for (Book book : b) {
            if (book.getBookId() == bookId) {
                selectedBook = book;
                break;
            }
        }

        for (User user : u) {
            if (user.getUserId() == userId) {
                selectedUser = user;
                break;
            }
        }

        if (selectedBook == null) {
            System.out.println("----Book not found----");
            return;
        }

        if (selectedUser == null) {
            System.out.println("----User not found----");
            return;
        }
        if (selectedBook.isIssued()) {
            System.out.println("\nBook is already Issued");
            return;
        }

        selectedBook.issueBook();

        System.out.println("\nBook  \"" + selectedBook.getTitle() + "\" is issued to " + selectedUser.getUserName());

    }

    //return Book
    public void bookReturn(int bookId) {
        for (Book book : b) {
            if (book.getBookId() == bookId) {
                if (!book.isIssued()) {
                    System.out.println("Book is already Available");
                    return;
                }
                book.returnBook();

                System.out.println("Book \"" + book.getTitle() + "\"is returned sucessfully");
                return;
            }
        }
        System.out.println("Book not found");

    }

}
