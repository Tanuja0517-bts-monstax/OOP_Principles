package Numbers;
import java.util.Scanner;
public class NeonNum {
	public static boolean isNeonNum(int num) {
		int result=num*num;
		int temp=result;
		int sum=0;
		while(temp>0) {
			int rem=temp%10;
			sum+=rem;
			temp/=10;
		}
		if(num==sum)
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number:");
		int num=sc.nextInt();
		if(isNeonNum(num))
			System.out.println(num+" is Neon Number");
		else
			System.out.println(num+" is not Neon Number");
	}
}
