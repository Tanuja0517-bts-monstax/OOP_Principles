package Numbers;

import java.util.Scanner;

public class HappyNum {
	public static int isHappy(int num) {
		int sum=0;
		while(num>0)
		{
			int rem=num%10;
			sum+=rem*rem;
			num/=10;
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number:");
		int num=sc.nextInt();
		while(true)
		{
			num=isHappy(num);
			if(num==1)
				break;
		}
			if(num==1)
			System.out.println("Is happy number");
		else
			System.out.println("Is not  happy number");
	}
}
