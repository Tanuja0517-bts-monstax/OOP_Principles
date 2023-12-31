package runTimePolymorphisum;

public class RTPDriver {
	public static void main(String[] args) {
		System.out.println("**********Parent**********");
		Parent p=new Parent();
		p.behaviour();
		p.facecolor();
		p.iq();
		
		System.out.println("**********Child**********");
		Child c=new Child();
		c.behaviour();
		c.facecolor();
		c.iq();
		c.parents();
		
		System.out.println("**********Upcasting**********");
		p=c;		//Upcasting
		p.behaviour();
		p.facecolor();
		p.iq();
		//p.parents();			//Exception
		
		System.out.println("**********Downcasting**********");
		Child c1=(Child)p;		//Downcasting
		c1.behaviour();
		c1.facecolor();
		c1.iq();
		c1.parents();
	}
}
