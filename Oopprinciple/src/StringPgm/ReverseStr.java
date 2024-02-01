package StringPgm;

import java.util.Scanner;

public class ReverseStr {
	public static String reverseStr(String str) {
		String temp[]=str.split(" ");
		String str1="";
		for(int i=temp.length-1;i>=0;i--) {
			str1+=temp[i]+" ";
		}
		return str1;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the String:");
		String str=sc.nextLine();
		System.out.println("Original String: "+str);
		str=reverseStr(str);
		System.out.println("Reversed String: "+str);
	}
}
