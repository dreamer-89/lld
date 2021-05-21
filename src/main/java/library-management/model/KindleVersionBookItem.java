package model;

public class KindleVersionBookItem extends BookItem implements IBookItem {
    @Override
    public boolean checkoutBookItem() {
        // Provide email ID of student & generate a workflow to send e-copy of the book.
        return false;
    }

    @Override
    public boolean returnBookItem() {
        throw new UnsupportedOperationException("Ebooks doesn't have return book functionality");
    }

    @Override
    public boolean reserveBookItem() {
        throw new UnsupportedOperationException("Ebooks doesn't have reserve book functionality");
    }

    @Override
    public boolean renewBookItem() {
        throw new UnsupportedOperationException("Ebooks doesn't have renew book functionality");
    }
}
