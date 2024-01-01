package Numbers;

import java.util.Scanner;

public class HarshadNum {
	public static boolean isHarshad(int num) {
		int temp=num;
		int sum=0;
		while(num>0) {
			int rem=num%10;
			sum+=rem;
			num/=10;
		}
		if(temp%sum==0)
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number:");
		int num=sc.nextInt();
		if(isHarshad(num))
			System.out.println(num+" Number is Harshad number");
		else
			System.out.println(num+" Number is not Harshad number");
	}
}
