package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class AverageAdapterTestSuite {
    @Test
    public void publicationYearAverate() {
        //Given
        Book book1 = new Book("Author1", "Title1", 1990, "Signature1");
        Book book2 = new Book("Author2", "Title2", 1995, "Signature2");
        Book book3 = new Book("Author3", "Title3", 2000, "Signature3");
        Book book4 = new Book("Author4", "Title4", 2005, "Signature4");

        Set<Book> libraryaBookSet = new HashSet<>();
        libraryaBookSet.add(book1);
        libraryaBookSet.add(book2);
        libraryaBookSet.add(book3);
        libraryaBookSet.add(book4);

        MedianAdapter medianAdapter = new MedianAdapter();

        //When
        int averageLibraryaBooksYear = medianAdapter.publicationYearAverage(libraryaBookSet);

        //Then
        assertEquals(1997, averageLibraryaBooksYear);
    }

    @Test
    public void publicationYearMedian() {
        //Given
        Book book1 = new Book("Author1", "Title1", 1990, "Signature1");
        Book book2 = new Book("Author2", "Title2", 1995, "Signature2");
        Book book3 = new Book("Author3", "Title3", 2000, "Signature3");
        Book book4 = new Book("Author4", "Title4", 2005, "Signature4");

        Set<Book> libraryaBookSet = new HashSet<>();
        libraryaBookSet.add(book1);
        libraryaBookSet.add(book2);
        libraryaBookSet.add(book3);
        libraryaBookSet.add(book4);

        MedianAdapter medianAdapter = new MedianAdapter();

        //When
        int medianLibraryaBooksYear = medianAdapter.publicationYearMedian(libraryaBookSet);

        //Then
        assertEquals(2000, medianLibraryaBooksYear);
    }
}
