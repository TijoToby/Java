import java.util.Scanner;
class Books {
    String title;
    String author;
    double price;
    Books(String t, String a, double p) {
         title= t;
        author= a;
        price = p;
    }

    void displayInfo() {
        System.out.println("Title : " + title);
        System.out.println("Author: " + author);
        System.out.println("Price : ₹" + price);
        System.out.println("------------------------");
    }
}

public class BookDemo {
    public static void main(String[] args) {
 Books book1 = new Books("The Alchemist", "Paulo Coelho", 399.00);
        Books book2 = new Books("Atomic Habits", "James Clear", 499.00);

        // Display their details
        System.out.println("Book 1 Details:");
        book1.displayInfo();

        System.out.println("Book 2 Details:");
        book2.displayInfo();
    }
}