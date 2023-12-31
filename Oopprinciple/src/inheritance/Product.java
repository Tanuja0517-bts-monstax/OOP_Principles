package inheritance;

public class Product extends Shop{
	public Product(int qut,String expdate,String name,String brand,double price) {
		super(qut,expdate,name,brand,price);
	}
	public void show()
	{
		System.out.println("**********Information about Product**********");
	}
}
