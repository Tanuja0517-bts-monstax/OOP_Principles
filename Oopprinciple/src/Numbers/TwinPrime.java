package Numbers;

import java.util.Scanner;

public class TwinPrime {
	public static boolean isPrime(int num) {
		boolean flag=true;
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				flag=false;
				break;
			}
		}
		return flag;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter 1st number:");
		int num1=sc.nextInt();
		System.out.print("Enter 2nd number:");
		int num2=sc.nextInt();
		int diff=num1>num2?num1-num2:num2-num1;
		if(isPrime(num1) && isPrime(num2) && diff==2) {
			System.out.println(num1+" "+num2+" are twin prime numbers");
		}
		else
			System.out.println(num1+" "+num2+" are not twin prime numbers");
	}
}
