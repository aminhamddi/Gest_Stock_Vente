package model;

public class Sale {

    private int id;
    private Product product;
    private int quantity;
    private double totalPrice;

    // Constructor
    public Sale(int id, Product product, int quantity) {
        this.id = id;
        this.product = product;
        this.quantity = quantity;
        this.totalPrice = calculateTotalPrice();
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
        this.totalPrice = calculateTotalPrice(); // Update totalPrice if product is changed
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
        this.totalPrice = calculateTotalPrice(); // Update totalPrice if quantity is changed
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    // Method to calculate total price of the sale (quantity * price)
    private double calculateTotalPrice() {
        return product.getPrice() * quantity;
    }

    @Override
    public String toString() {
        return "Sale{id=" + id + ", product=" + product + ", quantity=" + quantity + ", totalPrice=" + totalPrice + "}";
    }
}
