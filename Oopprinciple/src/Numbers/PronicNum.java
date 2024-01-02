package Numbers;

import java.util.Scanner;

public class PronicNum {
	public static boolean isPronic(int num) {
		boolean flag=true;
		int i=2;
		int temp=0;
		while(i<num/2) {
			temp=i*++i;
			if(temp==num) {
				break;
			}
		}
		if(temp!=num)
			flag=false;
		return flag;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number:");
		int num=sc.nextInt();
		if(isPronic(num))
			System.out.println(num+" is pronic number");
		else
			System.out.println(num+" is not Pronic number");
	}
}
