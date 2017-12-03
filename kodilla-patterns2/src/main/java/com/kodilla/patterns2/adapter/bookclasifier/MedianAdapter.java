package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Classifier;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.BookSignature;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MedianAdapter extends MedianAdaptee implements Classifier {

    public int publicationYearAverage(Set<Book> bookSet) {
        Map<BookSignature, com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book> books = new HashMap<>();
        Book[] libraryaBookArray = bookSet.toArray(new Book[bookSet.size()]);
        for(int i=0; i< libraryaBookArray.length; i++) {
            Book tempLibraryaBook = libraryaBookArray[i];
            books.put(new BookSignature(tempLibraryaBook.getSignature()),
                        new com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book(
                                tempLibraryaBook.getAuthor(),
                                tempLibraryaBook.getTitle(),
                                tempLibraryaBook.getPublicationYear()
                        ));
        }
        return averagePublicationYear(books);
    }

    @Override
    public int publicationYearMedian(Set<Book> bookSet) {
        Map<BookSignature, com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book> books = new HashMap<>();
        Book[] libraryaBookArray = bookSet.toArray(new Book[bookSet.size()]);
        for(int i=0; i < libraryaBookArray.length; i++) {
            Book tempLibraryaBook = libraryaBookArray[i];
            books.put(new BookSignature(tempLibraryaBook.getSignature()),
                        new com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book(
                                tempLibraryaBook.getAuthor(),
                                tempLibraryaBook.getTitle(),
                                tempLibraryaBook.getPublicationYear()
                        ));
        }
        return medianPublicationYear(books);
    }
}

