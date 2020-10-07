package course;

import java.util.Scanner;

import util.Menu;
import util.Product;

public class Application {

	public static void main(String[] args) {
		
		Product product = new Product();
		Scanner sc = new Scanner(System.in);
			
		
		int flag = 0;
		
		do{
			Menu.showMenu();
			flag = sc.nextInt();
			
			switch(flag) {
			case 1:
				System.out.println("Quantity: ");
				product.addProduct(sc.nextInt());
			
			case 3:
				System.out.println("Quantity: ");
				product.removeProduct(sc.nextInt());
			case 4:
				Menu.showMenu();
			
			;
			}
			
		}while(flag != 0);
		
		
		
		System.out.println("-----------------------------");
		
		
		sc.close();

	}

}
