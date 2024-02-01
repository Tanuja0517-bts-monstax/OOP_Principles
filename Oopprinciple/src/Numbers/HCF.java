package Numbers;

import java.util.Scanner;

public class HCF {
	public static void theHCF(int num1,int num2) {
		int hcf=num1<num2?num1:num2;
		for(;;) {
			if(num1%hcf==0 && num2%hcf==0 ) {
				System.out.println("Highet Common Factor of"+num1+" and "+num2+ " is "+hcf);
				break;
			}
			hcf--;
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter first number:");
		int num1=sc.nextInt();
		System.out.print("Enter second number:");
		int num2=sc.nextInt();
		
		theHCF(num1,num2);
	}
}
