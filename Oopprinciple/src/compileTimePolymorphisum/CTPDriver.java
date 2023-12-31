package compileTimePolymorphisum;

public class CTPDriver {
	public static void main(String[] args) {
		System.out.println("**********Parent**********");
		Parent p=new Parent();
		p.degree();
		p.hobby();
		
		System.out.println("**********Child**********");
		Child c=new Child();
		c.degree();
		c.hobby();
		
		System.out.println("**********Upcasting**********");
		p=c;	//upcasting
		p.degree();
		p.hobby();
		
		System.out.println("**********Downcasting**********");
		Child c1=(Child)p;
		c1.degree();
		c1.hobby();
	}
}
