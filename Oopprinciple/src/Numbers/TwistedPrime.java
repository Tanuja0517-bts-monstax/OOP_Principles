package Numbers;

import java.util.Scanner;

public class TwistedPrime {
	public static boolean isTwistedPrime(int num) {
		int temp=num;
		int rev=0;
		boolean flag=true;
		while(num>0) {
			int rem=num%10;
			rev=(rev*10)+rem;
			num/=10;
		}
		for(int i=2;i<temp || i<rev;i++)
		{
			if(temp%i==0 && rev%i==0) {
				flag=false;
				break;
			}
		}
		if(flag==true)
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number:");
		int num=sc.nextInt();
		if(isTwistedPrime(num))
			System.out.println(num+" is Twisted Prime number");
		else
			System.out.println(num+" is not Twisted Prime number");
	}
}
