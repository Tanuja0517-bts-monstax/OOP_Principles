package Numbers;

import java.util.Scanner;

public class LCM {
	public static void theLcm(int num1,int num2) {
		int lcm=num1>num2?num1:num2;
		for(;;) {
			if(lcm%num1==0 && lcm%num2==0) {
				System.out.println("Least Commom Fact of "+num1+" and "+num2+" is "+lcm);
				break;
			}
			lcm++;
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter first number:");
		int num1=sc.nextInt();
		System.out.print("Enter second number:");
		int num2=sc.nextInt();
		
		theLcm(num1,num2);
	}
}
