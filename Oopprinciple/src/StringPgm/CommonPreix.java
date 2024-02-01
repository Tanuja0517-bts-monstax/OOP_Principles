package StringPgm;

import java.util.Scanner;

public class CommonPreix {
	public static String commonPre(String str[]) {
		String str1="";
		int j=0;
		for(int i=1;i<str.length;i++) {
			String temp=""+str[0].charAt(j);
			
			if(str[i].contains(temp) && j<str[0].length()) {
				j++;
				str1+=temp;
			}
			else
				break;
		}
		return str1;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size of array:");
		int num=sc.nextInt();
		String str[]=new String[num];
		System.out.println("Enter values in array:");
		for(int i=0;i<str.length;i++) {
			str[i]=sc.next();
		}
		String compre=commonPre(str);
		System.out.println();
		System.out.println("Common Preix String:"+compre);
	}
}
