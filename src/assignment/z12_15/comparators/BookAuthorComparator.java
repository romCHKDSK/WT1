package assignment.z12_15.comparators;

import java.util.Comparator;

import assignment.z12_15.Book;

public class BookAuthorComparator implements Comparator<Book> {
    @Override
    public int compare(Book book1, Book book2) {
        return book1.getAuthor().compareTo(book2.getAuthor());
    }
}
