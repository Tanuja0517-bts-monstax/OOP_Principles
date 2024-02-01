package controlFlowStatement;

import java.util.Scanner;

public class FoodAppSwitch {
	public static int hotelMenu(int num) {
		int totalPrice=0;
		Scanner sc=new Scanner(System.in);
		switch(num) {
		case 1:
			System.out.println("1. Veg"+"\n"+"2. Non-Veg \n");
			System.out.print("Enter your choice:");
			int ch1=sc.nextInt();
			switch(ch1) {
				case 1:
					System.out.println("1. Gobi Manchuriyan------------>120");
					System.out.println("2. Paneer 65------------>140");
					System.out.println("3. Veg Manchuriyan------------>110");
					System.out.print("Enter your choice:");
					int choice1=sc.nextInt();
					if(choice1==1) {
						totalPrice+=120;
					}
					else if(choice1==2) {
						totalPrice+=140;
					}
					else if(choice1==3){
						totalPrice+=110;
					}
					else {
						System.out.println("Wrong Choice");
					}
				break;
				
				case 2:
					System.out.println("1. Chicken Tandoori------------>350");
					System.out.println("2. Chicken 65------------>150");
					System.out.println("3. Chicken Lollypop------------>140");
					System.out.print("Enter your choice:");
					int choice2=sc.nextInt();
					if(choice2==1) {
						totalPrice+=350;
					}
					else if(choice2==2) {
						totalPrice+=150;
					}
					else if(choice2==3){
						totalPrice+=140;
					}
					else {
						System.out.println("Wrong Choice");
					}
				break;
			}
		break;
		
		case 2:
			System.out.print("Enter your choice:");
			System.out.println("1. Veg"+"\n"+"2. Non-Veg");
			int ch2=sc.nextInt();
			switch(ch2) {
				case 1:
					System.out.println("1. Kaju Bhajji------------>190");
					System.out.println("2. Shev Bhaji------------>200");
					System.out.println("3. Dal Tadka------------>220");
					System.out.println("4. Jeera Rice----------->100");
					System.out.println("5. Roti---------->35");
					System.out.print("Enter your choice:");
					int choice3=sc.nextInt();
					if(choice3==1) {
						totalPrice+=190;
					}
					else if(choice3==2) {
						totalPrice+=200;
					}
					else if(choice3==3){
						totalPrice+=220;
					}
					
					else if(choice3==4) {
						totalPrice+=100;
					}
					else if(choice3==5){
						totalPrice+=35;
					}
					else {
						System.out.println("Wrong Choice");
					}
				break;
				
				case 2:
					System.out.println("1. Chicken Biriyani------------>250");
					System.out.println("2. Chicken Gravy------------>220");
					System.out.println("3. Mutton Biriyani------------>280");
					System.out.println("4. Mutton Gravy----------->250");
					System.out.println("5. Roti---------->35");
					System.out.print("Enter your choice:");
					int choice4=sc.nextInt();
					if(choice4==1) {
						totalPrice+=250;
					}
					else if(choice4==2) {
						totalPrice+=220;
					}
					else if(choice4==3){
						totalPrice+=280;
					}
					
					else if(choice4==4) {
						totalPrice+=250;
					}
					else if(choice4==5){
						totalPrice+=35;
					}
					else {
						System.out.println("Wrong Choice");
					}
				break;

			}
			break;
		case 3:
			System.out.println("1. Alcoholic Drinks"+" \n"+" 2. Non-Alcohoic Drinks");
			System.out.print("Enter your Choice:");
			int ch3=sc.nextInt();
			switch(ch3) {
				case 1:
					System.out.println("Large Shots------------>550");
					System.out.println("Beer Brand 1----------->480");
					System.out.println("Cocktail 1----------->500");
					System.out.print("Enter your choice:");
					int choice5=sc.nextInt();
					if(choice5==1)
						totalPrice+=550;
					else if(choice5==2)
						totalPrice+=480;
					else if(choice5==3)
						totalPrice+=500;
					else
						System.out.println("Wrong choice");
				break;
				case 2:
					System.out.println("Cold Coffee------------>150");
					System.out.println("Juice 1----------->100");
					System.out.println("Soda ----------->120");
					System.out.print("Enter your choice:");
					int choice6=sc.nextInt();
					if(choice6==1)
						totalPrice+=150;
					else if(choice6==2)
						totalPrice+=100;
					else if(choice6==3)
						totalPrice+=120;
					else
						System.out.println("Wrong choice");
				break;
			}
		}
		return totalPrice;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("1. Staters");
		System.out.println("2. Main Course");
		System.out.println("3. Drinks");
		System.out.print("Enter your choice:");
		int ch=sc.nextInt();
		int totalPrice=0;
		boolean flag=true;
		while(flag) {
			System.out.println("Enter Y or y to Make order:");
			char chara=sc.next().charAt(0);
			if(chara=='Y' || chara=='y') {
				totalPrice+=hotelMenu(ch);
			}
			else {
				System.out.println("Enter Done for bill");
				String bill=sc.next();
				if(bill.equalsIgnoreCase("DONE"))
					flag=false;
			}
		}
		System.out.println("Your total amount:"+totalPrice);
	}
}
