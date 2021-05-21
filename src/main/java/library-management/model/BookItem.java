package model;

enum Status {
    ON_SHELF, RESERVED, ISSUED
}

enum BookType { E_BOOK, HARD_COPY, KINDLE_VERSION }

/*
BookItem represents the physical copy of Book. A book can have multiple copies (i.e. BookItem). Each BookItem has a
barCode and its availability status.
 */
class BookItem {
    Book book;
    String barCode;
    Status status;
    BookType bookType;
}
