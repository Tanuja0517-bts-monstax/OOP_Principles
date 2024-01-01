package Numbers;

import java.util.Scanner;

public class PerfectNum {
	public static boolean isPerfect(int num) {
		int sum=0;
		for(int i=1;i<num;i++) {
			if(num%i==0)
				sum+=i;
		}
		if(sum==num)
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number:");
		int num=sc.nextInt();
		
		if(isPerfect(num))
			System.out.println(num+" is Perfect number");
		else
			System.out.println(num+" is not Perfect number");
	}
}
