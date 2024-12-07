package model;

import java.sql.Timestamp;

public class Sale {
    private int id;
    private int productId;
    private int quantity;
    private double totalPrice;
    private Timestamp saleDate;

    public Sale(int id, int productId, int quantity, double totalPrice, Timestamp saleDate) {
        this.id = id;
        this.productId = productId;
        this.quantity = quantity;
        this.totalPrice = totalPrice;
        this.saleDate = saleDate;
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public Timestamp getSaleDate() {
		return saleDate;
	}

	public void setSaleDate(Timestamp saleDate) {
		this.saleDate = saleDate;
	}

	@Override
	public String toString() {
		return "Sale [id=" + id + ", productId=" + productId + ", quantity=" + quantity + ", totalPrice=" + totalPrice
				+ ", saleDate=" + saleDate + "]";
	}

    
}
