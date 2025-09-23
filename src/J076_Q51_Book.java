public class J076_Q51_Book {
    static int totalNoOfBooks;
    String author;
    String title;
    String isbn;
    boolean isBorrowed;

    static {
        totalNoOfBooks = 0;
    }

    {
        totalNoOfBooks++; // Object Init
    }

    J076_Q51_Book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    J076_Q51_Book(String isbn) {
        this(isbn, "Unknown", "Unknown");
    }

    static int getTotalNoOfBooks() {
        return totalNoOfBooks;
    }

    void borrowBook() {
        if (isBorrowed) {
            System.out.println("Book is already borrowed");
        } else {
            this.isBorrowed = true;
            System.out.println("Enjoy " + this.title);
        }
    }

    void returnBook() {
        if (isBorrowed) {
            this.isBorrowed = false;
            System.out.println("Hope you enjoyed, Please leave a review");
        } else {
            System.out.println("This book is already in the Library");
        }
    }

    public static void main(String[] args) {
        J076_Q51_Book designOfThings = new J076_Q51_Book("1", "Design", "Author");
        J076_Q51_Book myBook = new J076_Q51_Book("2");
        System.out.println(J076_Q51_Book.getTotalNoOfBooks());
        designOfThings.borrowBook();
        myBook.borrowBook();
        designOfThings.borrowBook();
        designOfThings.returnBook();
        designOfThings.returnBook();
    }
}