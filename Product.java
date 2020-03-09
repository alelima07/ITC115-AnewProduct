import java.text.NumberFormat;

public class Product {
	private String productCode;
	private String description;
	private double price;
	private static double totalPrice;
	
	//constructor
	public Product(String productCode, double price) {
		if(price <= 0) {
			throw new IllegalArgumentException();
		}
		this.productCode = productCode;
		this.price = price;
	}
	
	//toString
	public String toString() {
		return this.productCode + " " + getPriceFormatted() + " " + description;
	}
	
	//getters
	public String getProductCode() {
		return this.productCode;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public static String getTotalPriceFormatted() {
		String formattedTotalPrice = NumberFormat.getCurrencyInstance().format(totalPrice);
		return formattedTotalPrice;
	}
	
	public String getPriceFormatted() {
		String formattedPrice = NumberFormat.getCurrencyInstance().format(this.price);
		return formattedPrice;
	}
	
	//setter
	public void setDescription(String description) {
		this.description = description;
	}
	
	//total price of all products
	public static double totalProductPrice(double price) {
		totalPrice += price;
		return totalPrice;
	}
	
}