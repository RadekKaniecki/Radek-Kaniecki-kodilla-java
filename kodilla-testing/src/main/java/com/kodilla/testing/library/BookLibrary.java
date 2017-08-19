package com.kodilla.testing.library;

import java.util.ArrayList;
import java.util.List;

public class BookLibrary {
    LibraryDatabase libraryDatabase;

    public BookLibrary(LibraryDatabase libraryDatabase) {
        this.libraryDatabase = libraryDatabase;
    }

    public List<Book> listBooksWithCondition(String titleFragment) {
        //creating empty list of books
        List<Book> bookList = new ArrayList<Book>();

        //first condition - if title fragment passed into method is shorter than 3 - return empty list
        if (titleFragment.length() < 3){
            return bookList;
        }

        //creating list of books with actual records from database
        List<Book> resultList = libraryDatabase.listBooksWithCondition(titleFragment);

        //second condition - if there will be more than 20 results from database providing title fragment
        //method will return empty list
        if (resultList.size() > 20) {
            return bookList;
        }

        //else empty list created in a first place will be pointing to result list from database
        //and method will finally return this list
        bookList = resultList;
        return bookList;
    }

    public List<Book> listBooksInHandsOf(LibraryUser libraryUser) {
        if(libraryUser != null) {
            List<Book> userBookList = libraryDatabase.listBooksInHandsOf(libraryUser);
            return userBookList;
        }
        return null;
    }

}
