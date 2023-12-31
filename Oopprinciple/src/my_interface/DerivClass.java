package my_interface;

import java.util.Scanner;

public class DerivClass {
	public static void main(String[] args) {
		Class1 cls=new Class1();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter country name:");
		cls.country(sc.nextLine());
		System.out.print("Enter city name:");
		cls.city(sc.nextLine());
		Interface1.show();
	}
}
