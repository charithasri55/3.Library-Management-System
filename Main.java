
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library l = new Library();

        boolean running = true;

        while (running) {
            System.out.println("====Library Menu====");
            System.out.println("1.Add Book");
            System.out.println("2.Add User");
            System.out.println("3.View Book");
            System.out.println("4.View User");
            System.out.println("5.Issue Book");
            System.out.println("6.Return Book");
            System.out.println("7.Exit");
            System.out.println("----------------------");

            System.out.print("\nEnter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("\nEnter Book ID: ");
                    int bookid = sc.nextInt();
                    sc.nextLine();

                    System.out.print("\nEnter Book Name: ");
                    String name = sc.nextLine();

                    System.out.print("\nEnter Author Name: ");
                    String author = sc.nextLine();

                    l.addBook(new Book(bookid, name, author));
                    break;

                case 2:
                    System.out.print("\nEnter User ID: ");
                    int userid = sc.nextInt();
                    sc.nextLine();

                    System.out.print("\nEnter user name: ");
                    String username = sc.nextLine();

                    l.addUser(new User(userid, username));
                    break;

                case 3:
                    l.viewBooks();
                    break;

                case 4:
                    l.viewUsers();
                    break;

                case 5:
                    System.out.print("\nEnter Book ID: ");
                    int bID = sc.nextInt();

                    System.out.print("\nEnter User Id: ");
                    int uID = sc.nextInt();

                    l.bookIssue(bID, uID);
                    break;

                case 6:
                    System.out.print("\nEnter Book ID: ");
                    int bid = sc.nextInt();

                    l.bookReturn(bid);
                    break;

                case 7:
                    running = false;
                    System.out.print("\nLibrary system closed. Thank you!");
                    break;

                default:
                    System.out.print("\nInvalid Choice, Please Try Again\n");
                    break;
            }
        }
        sc.close();
    }
}
