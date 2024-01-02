package Numbers;

import java.util.Scanner;

public class MultiplyDigits {
	public static int multiply(int num) {
		int result=1;
		while(num>0) {
			int rem=num%10;
			result*=rem;
			num/=10;
		}
		return result;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number:");
		int num=sc.nextInt();
		System.out.println("Multiplication of digits of "+num+" is "+multiply(num));
	}
}
