package Numbers;

import java.util.Scanner;

public class SpecialNum {
	public static boolean isSpecial(int num) {
		int temp=num;
		int sum=0;
		while(num>0) {
			int rem=num%10;
			int fact=1;
			for(int i=1;i<=rem;i++)
				fact*=i;
			num/=10;
			sum+=fact;
		}
		if(temp==sum)
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number:");
		int num=sc.nextInt();
		if(isSpecial(num))
			System.out.println(num+" is Special number");
		else
			System.out.println(num+" is not Special number");
	}
}
