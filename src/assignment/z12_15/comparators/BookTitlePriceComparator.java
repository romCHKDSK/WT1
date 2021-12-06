package assignment.z12_15.comparators;

import java.util.Comparator;

import assignment.z12_15.Book;

public class BookTitlePriceComparator implements Comparator<Book> {
    @Override
    public int compare(Book book1, Book book2) {
        int compareResult = book1.getTitle().compareTo(book2.getTitle());
        if (compareResult != 0)
            return compareResult;

        return Integer.compare(book1.getPrice(), book2.getPrice());
    }
}
