package StringPgm;

import java.util.Scanner;

public class RomanNumToDecimal {
	public static int romNum(char ch) {
			if(ch=='I')
				return 1;
			if(ch=='V')
				return 5;
			if(ch=='X')
				return 10;
			if(ch=='L')
				return 50;
			if(ch=='C')
				return 100;
			if(ch=='D')
				return 500;
			if(ch=='M')
				return 1000;
			return -1;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the roman number:");
		String str=sc.next();
		int res=0;
		for(int i=0;i<str.length();i++) {
			int s1=romNum(str.charAt(i));
			if(i+1<str.length()) {
				int s2=romNum(str.charAt(i+1));
				
				if(s1>=s2)
					res+=s1;
				else {
					res=res+s2-s1;
					i++;
				}
			}
			else
				res+=s1;
		}
		System.out.println("Decimal number for "+str+" is "+res);
	}
}
