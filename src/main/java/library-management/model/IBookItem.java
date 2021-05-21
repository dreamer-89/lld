package model;

/*
Defines the checkout/checkin behavior for specific book item
 */
public interface IBookItem {
    boolean checkoutBookItem();
    boolean returnBookItem();
    boolean reserveBookItem();
    boolean renewBookItem();
}
