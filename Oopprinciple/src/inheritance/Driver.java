package inheritance;

import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
		System.out.print("Enter quantity of product:");
		int qut=sc.nextInt();
		
		System.out.println("Enter expirery date of product:");
		String expdate=sc.next();
		
		sc.nextLine();
		System.out.print("Enter Name of product:");
		String name=sc.nextLine();
		
		sc.nextLine();
		System.out.print("Enter Brand of product:");
		String brand=sc.nextLine();
		
		System.out.print("Enter price of product:");
		double price=sc.nextDouble();
		
		Product p=new Product(qut,expdate,name,brand,price);
		p.show();
		p.productInfo();
	}
}
