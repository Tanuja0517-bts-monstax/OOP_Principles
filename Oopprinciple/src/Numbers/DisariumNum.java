package Numbers;
import java.util.*;
public class DisariumNum {
	public static int count(int num) {
		int ct=0;
		while(num>0)
		{
			ct++;
			num/=10;
		}
		return ct;
	}
	
	public static int power(int base,int count) {
		int pow=1;
		for(int i=0;i<count;i++)
			pow*=base;
		return pow;
	}
	
	public static boolean isDisariumNum(int num) {
		int ct=count(num);
		int temp=num;
		int sum=0;
		while(temp>0) {
			int rem=temp%10;
			sum+=power(rem,ct--);
			temp/=10;
		}
		if(num==sum)
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number:");
		int num=sc.nextInt();
		if(isDisariumNum(num))
			System.out.println(num+" is Disarium Number");
		else
			System.out.println(num+" is not Disarium number");
	}
}