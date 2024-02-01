package StringPgm;

public class String1 {
	public static void main(String[] args) {
		String s=new String("Tanuja");
		String s1=new String("Tanuja");
		String s2="Tanuja";
		String s3="Tanuja";
		
		if(s==s1)
			System.out.println("Yess New");
		else
			System.out.println("No");
		
		if(s2==s3)
			System.out.println("Yess");
		else
			System.out.println("No");
		
		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
	}
}
