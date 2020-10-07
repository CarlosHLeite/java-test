package util;

import java.util.Scanner;

public class Product {

	public static String name;
	public static double price;
	public static int quantity;
	
	public void addProduct(int quantity) {
		Product.quantity += quantity;
	}
	
	public void removeProduct(int quantity) {
		Product.quantity -= quantity;
	}
	
	public double showQuantity() {
		return price * quantity;
	}
	
	public static void addProductMenu() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a name of a product");
		name = sc.nextLine();
		System.out.println("Enter price of a product");
		price = sc.nextDouble();
		System.out.println("Enter quantity of a product");
		quantity = sc.nextInt();
		
		
		sc.close();
		
		
	}
}
