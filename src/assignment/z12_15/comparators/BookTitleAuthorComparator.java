package assignment.z12_15.comparators;

import java.util.Comparator;

import assignment.z12_15.Book;

public class BookTitleAuthorComparator implements Comparator<Book> {
    @Override
    public int compare(Book book1, Book book2) {
        int titleCompare = book1.getTitle().compareTo(book2.getTitle());
        if (titleCompare != 0)
            return titleCompare;

        return book1.getAuthor().compareTo(book2.getAuthor());
    }
}
