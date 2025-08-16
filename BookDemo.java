
class Book {
     String title, author;
 Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
  void display() {
        System.out.println("Title: " + title + "\nAuthor: " + author);
    }
}
class Technical extends Book {
    String subject;
     Technical(String title, String author, String subject) {
        super(title, author);
        this.subject = subject;
    }
     void display() {
        super.display();
        System.out.println("Subject: " + subject);
    }
}
class Story extends Technical {
     String genre;
  Story(String title, String author, String subject, String genre) {
        super(title, author, subject);
        this.genre = genre;
    }
    void display() {             
        super.display();
        System.out.println("Genre: " + genre);
    }
}
public class BookDemo {
    public static void main(String[] args) {
        Book b1 = new Book("Generic Book", "Harvid Davison");
        Book b2 = new Technical("Java Essentials", "JamesGosling", "Computer Science");
        Book b3 = new Story("Fantasy Tales", "Richard James", "Literature", "Fantasy");

        b1.display();  System.out.println();
        b2.display();  System.out.println();
        b3.display();
    }
}
