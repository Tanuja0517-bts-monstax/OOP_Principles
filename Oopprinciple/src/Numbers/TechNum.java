package Numbers;

import java.util.Scanner;

public class TechNum {
	public static int count(int num) {
		int ct=0;
		while(num>0) {
			num/=10;
			ct++;
		}
		return ct;
	}
	public static int power(int base,int raise) {
		int pow=1;
		for(int i=0;i<raise;i++) {
			pow*=base;
		}
		return pow;
	}
	public static boolean isTechNum(int num) {
		int sum=0;
		int temp=num;
		int ct=count(num);
		if(ct%2==0) {
			int last=num%power(10,ct/2);
			int start=num/power(10,ct/2);
			sum=(last+start)*(start+last);
			
			if(temp==sum) 
				return true;
			else
				return false;
		}
		return false;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number:");
		int num=sc.nextInt();
		
		if(isTechNum(num))
			System.out.println(num+" is tech number");
		else
			System.out.println(num+" is not a tech number");
	}
}
