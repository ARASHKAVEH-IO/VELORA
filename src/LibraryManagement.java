import java.util.ArrayList;
import java.util.Scanner;

class Book {
    private String title;
    private boolean isBorrowed;

    public Book(String title) {
        this.title = title;
        this.isBorrowed = false;
    }

    public String getTitle() {
        return title;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void borrow() {
        if (!isBorrowed) {
            isBorrowed = true;
            System.out.println(title + " HAS BEEN BORROWED.");
        } else {
            System.out.println(title + " IS ALREADY BORROWED.");
        }
    }

    public void returnBook() {
        if (isBorrowed) {
            isBorrowed = false;
            System.out.println(title + " HAS BEEN RETURNED.");
        } else {
            System.out.println(title + " WAS NOT RETURNED.");
        }
    }
}

public class LibraryManagement {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("CHEGOONE ZAN RA BEFAHMIM"));
        books.add(new Book("AMOOZESH ASHPAZI BARAY AGHAYAN"));
        books.add(new Book("LOOK MOTHER , NOW I CAN FLY"));

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. VIEW BOOKS\n2. BORROW BOOK\n3. RETURN BOOK\n4. EXIT");
            System.out.print("CHOOSE OPTION: ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            if (choice == 1) {
                System.out.println("\nAVAILABLE BOOKS:");
                for (int i = 0; i < books.size(); i++) {
                    Book b = books.get(i);
                    System.out.println(i + ". " + b.getTitle() + (b.isBorrowed() ? " (BORROWED)" : " (AVAILABLE)"));
                }
            } else if (choice == 2) {
                System.out.print("ENTER BOOK INDEX TO BORROW: ");
                int index = sc.nextInt();
                if (index >= 0 && index < books.size()) {
                    books.get(index).borrow();
                } else {
                    System.out.println("INVALID INDEX.");
                }
            } else if (choice == 3) {
                System.out.print("ENTER BOOK INDEX TO RETURN: ");
                int index = sc.nextInt();
                if (index >= 0 && index < books.size()) {
                    books.get(index).returnBook();
                } else {
                    System.out.println("INVALID INDEX.");
                }
            } else if (choice == 4) {
                System.out.println("SHABBEKHEIR.");
                break;
            } else {
                System.out.println("INVALID OPTION.");
            }
        }
        sc.close();
    }
}