import java.util.*;
//*******************************************************************
//Seattle Central College
//ITC 115 - Assignment 9
//Student: Alessandra Souza Lima
//Design and Code a class for a generic product. 
//The product data should include a product code, description, price and product count.
//From the client app create instances of 2-3 different products
//and use the toString method to display their data.
//
//Date: 3/8/2020
//*******************************************************************

public class AnewProduct {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Product[] aNewProduct = new Product[3];
		
		System.out.println("Hello customer. You can enter three products.");
		userInput(input, aNewProduct);
		userOutput(aNewProduct);
		addUserProductPrices(aNewProduct);
		
		input.close();
	}
	public static void userInput(Scanner console, Product[] aNewProduct) {
		for(int i = 0; i < 3; i++) {
			System.out.print("Insert here your product code and price: ");
			String productName = console.next();
			double price = console.nextDouble();
			aNewProduct[i] = new Product(productName, price);
			System.out.println("Enter the product description: ");
			String description = console.next();
			aNewProduct[i].setDescription(description);
		}
	}
	
	public static void userOutput(Product[] aNewProduct) {
		for(int i = 0; i < 3; i++) {
			System.out.println("Product number " + (i + 1) + " is " + aNewProduct[i]);
		}
	}
	
	public static void addUserProductPrices(Product[] aNewProduct) {
		double price = 0;
		for(int i = 0; i < 3; i++) {
			price = aNewProduct[i].getPrice();
			Product.totalProductPrice(price);
		}
		
		System.out.println("The total price is " + Product.getTotalPriceFormatted() + ".");
	}
	

	
}
