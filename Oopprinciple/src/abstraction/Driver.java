package abstraction;

import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		SolidClass child=new SolidClass();
		System.out.print("Enter channel number:");
		int num=sc.nextInt();
		
		sc.nextLine();
		System.out.print("Enter channel name:");
		String channelname=sc.nextLine();
		
		sc.nextLine();
		System.out.print("Enter show name:");
		String show=sc.nextLine();
	
		child.channel(num, channelname, show);
		child.infoShow();
	}
}
