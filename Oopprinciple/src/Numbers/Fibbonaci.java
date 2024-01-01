package Numbers;

import java.util.Scanner;

public class Fibbonaci {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number:");
		int num=sc.nextInt();
		int num1=0;
		int num2=1;
		int num3=0;
		System.out.print(num1+" ");
		System.out.print(num2+" ");
		while(num3<num) {
			num3=num1+num2;
			System.out.print(num3+" ");
			num1=num2;
			num2=num3;
		}
	}
}
