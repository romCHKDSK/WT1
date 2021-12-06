package assignment.z12_15.comparators;

import java.util.Comparator;

import assignment.z12_15.Book;

public class BookAuthorTitleComparator implements Comparator<Book> {
    @Override
    public int compare(Book book1, Book book2) {
        int titleCompare = book1.getAuthor().compareTo(book2.getAuthor());
        if (titleCompare != 0)
            return titleCompare;

        return book1.getTitle().compareTo(book2.getTitle());
    }
}
