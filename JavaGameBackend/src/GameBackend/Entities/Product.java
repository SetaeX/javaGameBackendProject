package GameBackend.Entities;

import GameBackend.Abstracts.Entity;

public class Product implements Entity{
	private int id;
	private double price;
	private double lastPrice;
	private String productName;
	private String productDescription;
	private String productCode;
	private int point;
	public Product() {
	}
	public Product(int id,double price, String productName, String productDescription) {
		super();
		this.price=price;
		this.id = id;
		this.productName = productName;
		this.productDescription = productDescription;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductDescription() {
		return productDescription;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	public int getId() {
		return id;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getProductCode() {
		productCode=productName.charAt(0)+Integer.toString(id);
		return productCode;
	}
	public double getLastPrice() {
		return lastPrice;
	}
	public void setLastPrice(double lastPrice) {
		this.lastPrice = lastPrice;
	}
}
