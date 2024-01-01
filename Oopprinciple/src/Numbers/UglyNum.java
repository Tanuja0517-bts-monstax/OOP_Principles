package Numbers;

import java.util.Scanner;

public class UglyNum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number:");
		int num=sc.nextInt();
		while(num>0)
		{
			if(num%2==0)
				num/=2;
			else if(num%3==0)
				num/=3;
			else if(num%5==0)
				num/=5;
			else
				break;
		}
		if(num==1)
			System.out.println("Number is Ugly number");
		else
			System.out.println("Number is not Ugly number");
	}
}
