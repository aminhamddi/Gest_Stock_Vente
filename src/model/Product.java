package model;

public class Product {

    private int id;
    private String name;
    private Category category;
    private double price;
    private int stockQuantity;

    // Constructor
    public Product(int id, String name, Category category, double price, int stockQuantity) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    // Method to reduce stock quantity when a sale is made
    public void reduceStock(int quantitySold) {
        if (quantitySold <= stockQuantity) {
            this.stockQuantity -= quantitySold;
        } else {
            throw new IllegalArgumentException("Not enough stock available");
        }
    }

    // Method to increase stock quantity when products are restocked
    public void increaseStock(int quantityAdded) {
        if (quantityAdded > 0) {
            this.stockQuantity += quantityAdded;
        } else {
            throw new IllegalArgumentException("Quantity added must be greater than zero");
        }
    }

    @Override
    public String toString() {
        return "Product{id=" + id + ", name='" + name + "', category=" + category + ", price=" + price + ", stockQuantity=" + stockQuantity + "}";
    }
}
