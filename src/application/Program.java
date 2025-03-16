package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Product a;
		a = new Product();

		System.out.println("Enter product data:");

		System.out.print("Name: ");
		a.name = sc.next();

		System.out.print("Price: ");
		a.price = sc.nextDouble();

		System.out.print("Quantity in stock: ");
		a.quantity = sc.nextInt();

		a.showInformation();

		System.out.print("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		a.addProduct(quantity);

		a.showInformationUpdated();

		System.out.print("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		a.removeProduct(quantity);

		a.showInformationUpdated();
		
		sc.close();

	}

}
