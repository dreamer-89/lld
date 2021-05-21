package model;

public class HardCopyBookItem extends BookItem implements IBookItem {
    @Override
    public boolean checkoutBookItem() {
        // Scan the barCode
        return false;
    }

    @Override
    public boolean returnBookItem() {
        return false;
    }

    @Override
    public boolean reserveBookItem() {
        return false;
    }

    @Override
    public boolean renewBookItem() {
        return false;
    }
}
