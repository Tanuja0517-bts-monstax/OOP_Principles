//Strong number
package Numbers;

import java.util.Scanner;

public class StrongNum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number:");
		int num=sc.nextInt();
		int sum=0;
		int temp=num;
		while(temp>0) {
			int product=1;
			int rem=temp%10;
			for(int i=rem;i>0;i--) {
				product*=i;
			}
		sum+=product;
		temp/=10;
		}
		if(num==sum)
			System.out.println(num+" is Strong number");
		else
			System.out.println(num+" is not Strong number");
	}
}
