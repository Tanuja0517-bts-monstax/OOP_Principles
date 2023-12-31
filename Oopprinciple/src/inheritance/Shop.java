package inheritance;

public class Shop {
	public int quantity;
	public String expdate;
	public String name;
	public String brand;
	public double price;
	
	public Shop(int quantity,String expdate,String name,String brand,double price) {
		this.quantity=quantity;
		this.expdate=expdate;
		this.name=name;
		this.brand=brand;
		this.price=price;
	}
	
	public void productInfo() {
		System.out.println("Name of product:"+name);
		System.out.println("Brand of product:"+brand);
		System.out.println("Price of product:"+price);
		System.out.println("Expirery date of product:"+expdate);
		System.out.println("Quantity of product:"+quantity);
	}
}
