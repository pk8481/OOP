class Book {
    int bookID;
    String title;
    String author;
    double price;

    static int totalBooks = 0;

    Book(int bookID, String title, String author, double price) {
        this.bookID = bookID;
        this.title = title;
        this.author = author;
        this.price = price;
        totalBooks++;
    }

    void display() {
        System.out.println("Book ID: " + bookID);
        System.out.println("Title : " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: Rs. " + price);
       
    }

    void search(int id) {
        if (bookID == id) {
            System.out.println("Book found by id:");
            display();
        }
    }

    void search(String title) {
        if (this.title.equalsIgnoreCase(title)) {
            System.out.println("Book found by title:");
            display();
        }
    }

    Book costlierBook(Book b) {
        if (this.price > b.price) {
            return this;
        } else {
            return b;
        }
    }

    static void displayTotalBooks() {
        System.out.println("Total books created: " + totalBooks);
    }
}

class Main {
    public static void main(String[] args) {
        Book b1 = new Book(123, "Java ",
                          "pranav", 170.00);

        Book b2 = new Book(111, "Python ",
                          "ppk", 450.00);

        Book b3 = new Book(456, "Data Structures",
                          "sham", 650.00);

        System.out.println("book details:");
        b1.display();
        b2.display();
        b3.display();

        System.out.println("\n search book by id");
        b1.search(123);
        b2.search(111);
        b3.search(456);

        System.out.println("\n by title");
        b1.search("Python Basics");
        b2.search("Python Basics");
        b3.search("Python Basics");

        System.out.println("\n costlier book");
        Book costlier = b1.costlierBook(b3);
        costlier.display();

        Book.displayTotalBooks();
    }
}
