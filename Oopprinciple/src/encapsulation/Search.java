package encapsulation;

import java.util.Scanner;

public class Search {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Name of Actor:");
		String name=sc.nextLine();
		System.out.print("Enter Age of Actor:");
		int age=sc.nextInt();
		System.out.print("Enter NetWorth of Actor:");
		sc.nextLine();
		String networth=sc.nextLine();
		System.out.print("Enter Height of Actor:");
		double height=sc.nextDouble();
		System.out.print("Enter Hit Movie of Actor:");
		sc.nextLine();
		String movie=sc.nextLine();
		System.out.print("Enter Weight of Actor:");
		double weight=sc.nextDouble();
		
		Google g=new Google(name, age, networth, height, movie, weight);
		g.info();
		System.out.println();
		System.out.print("Enter 5 Pin:");
		int pin=sc.nextInt();
		g.setHeight(pin, 5.8);
		System.out.println("Updated Info");
		g.info();
	}
}
