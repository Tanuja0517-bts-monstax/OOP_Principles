package Numbers;

import java.util.Scanner;

public class CoPrime {
	public static boolean isCoPrime(int num,int num1) {
		int hcf=num>num1?num:num1;
		
		while(hcf>0) {
			if(num%hcf==0 && num1%hcf==0) 
				break;
			hcf--;
		}
		if(hcf==1)
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter 1st number:");
		int num=sc.nextInt();
		System.out.print("Enter 2nd number:");
		int num1=sc.nextInt();
		
		if(isCoPrime(num,num1))
			System.out.println(num+" and "+num1+" are co-prime numbers");
		else
			System.out.println(num+" and "+num1+" are not co-prime numbers");
	}
}
