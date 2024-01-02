package Numbers;

import java.util.Scanner;

public class UniqueNum_ORNot {
	public static boolean isUnique(int num) {
		String str=String.valueOf(num);
		String str1[]=str.split("");
		int ct=0;
		
		for(int i=0;i<str1.length;i++)
		{
			for(int j=i+1;j<str1.length;j++)
				if(str1[i].equals(str1[j])) {
					ct++;
					break;
			}
		}
		if(ct==0)
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number:");
		int num=sc.nextInt();
		if(isUnique(num))
			System.out.println(num+" is unique digit number");
		else
			System.out.println(num+" is not unique digit number");
	}
}
