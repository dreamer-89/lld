package model;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person {
    int graduationYear;
    LibraryCard studentCard;

    boolean requestLibraryCard() {
        /*
        Step 1. Student submits a form with all valid documentations
        Step 2. Student submits the form along with card fee.
         */
        return true;
    }

    // Search a book based on search criteria & return list of books passing criteria.
    List<Book> searchBook(String searchCriteria) {
        /*
        Step 1. Filter all books based on search criteria.
        Step 2. Check if books are available in library
        Step 3. Return list of all books.
         */
        return new ArrayList<Book>();
    }

    boolean checkoutBook(BookItem bookItem) {
        /*
        Step 1. Student selects a specific book & scans the barcode of the book.
        Step 2. Student selects number of days for which it want to borrow the book.
         */
        return true;
    }

    boolean renew(BookItem bookItem) {
        /*

         */
        return true;
    }

    boolean returnBook(BookItem bookItem) {
        /*
        Step 1. Student scans the barcode in return section
        Step 2. Student pays the fine if applicable. If fine is not paid, library card is marked red.
         */
        return true;
    }
}
