package Numbers;

import java.util.Scanner;

public class SpyNum {
	public static boolean isSpy(int num) {
		int sum=0;
		int pro=1;
		while(num>0) {
			int rem=num%10;
			sum+=rem;
			pro*=rem;
			num/=10;
		}
		if(sum==pro)
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number:");
		int num=sc.nextInt();
		if(isSpy(num))
			System.out.println(num+" is Spy number");
		else
			System.out.println(num+" is not Spy number");
	}
}
