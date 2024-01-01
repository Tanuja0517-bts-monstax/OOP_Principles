package Numbers;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number:");
		int num=sc.nextInt();
		int temp=num;
		int rev=0;
		while(temp>0) {
			int rem=temp%10;
			rev=(rev*10)+rem;
			temp/=10;
		}
		if(num==rev)
			System.out.println(num+" is palindrome");
		else
			System.out.println(num+" is not palindrome");
	}
}
