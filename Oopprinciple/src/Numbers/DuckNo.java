package Numbers;

import java.util.Scanner;

public class DuckNo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number which should not start with zero'0':");
		int num=sc.nextInt();
		int temp=num;
		while(num>0) {
			int rem=num%10;
			if(rem==0) {
				System.out.println(num+" number is duck number");
				break;
			}
			num/=10;
		}
		if(num==0)
			System.out.println(temp+" number is not duck number");
	}
}
