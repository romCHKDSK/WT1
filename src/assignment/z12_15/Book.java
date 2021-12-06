package assignment.z12_15;

public class Book implements Comparable<Book> { 
    private String isbn;
    private String title;
    private String author;
    private int price;
    private static int edition;

    protected Book() {}

    public Book(String isbn, String title, String author, int price, int edition) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.price = price;
        Book.edition = edition;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public int getPrice() {
        return this.price;
    }

    public int getEdition() {
        return Book.edition;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        final Book other = (Book) obj;
        if (this.isbn != other.isbn ||
            this.title != other.title   ||
            this.author != other.author ||
            this.price != other.price) {
            
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        return
            this.isbn.hashCode() ^
            this.title.hashCode() ^
            this.author.hashCode() ^
            price ^ edition;
    }

    @Override
    public String toString() {
        return
            String.format("[%s] %s, %d edition by %s (%d$)",
            this.isbn, this.title, Book.edition, this.author, this.price);
    }

    @Override
    public Object clone() {
        return new Book(this.isbn, this.title, this.author, this.price, Book.edition);
    }

    @Override
    public int compareTo(Book obj) {
        return this.isbn.compareToIgnoreCase(obj.isbn);
    }
}