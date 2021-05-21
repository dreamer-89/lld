package model;

public class Librarian extends Person {
    String libraryID;

    void addBook(Book book) {
        /*
        Step 1. Add new Book in data store
        Step 2. Add BookItems corresponding to number of copies available.
         */
    }

    void updateBookCopies(Book book) {

    }


    void removeBook(Book book) {
        /*
        Step 1. Remove book from data store.
        Step 2. Delete all book items corresponding to this book.
         */
    }

    void issueLibraryCard(Student student) {
        /*
        Step 1. Ensure student is not already issued a library card
        Step 2. Validate student identity & credentials
        Step 3. Generate a new library card and assign to student.
         */
    }
}
