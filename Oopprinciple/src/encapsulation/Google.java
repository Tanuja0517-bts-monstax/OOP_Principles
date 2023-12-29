package encapsulation;

public class Google {
		private int pin=12345;
		private String name="";
		private int age;
		private String networth;
		private double height;
		private String hitmovie;
		private double weight;
		
		public Google(String name,int age,String networth,double height,String hitmovie,double weight)
		{
			this.name=name;
			this.age=age;
			this.networth=networth;
			this.height=height;
			this.hitmovie=hitmovie;
			this.weight=weight;
		}
		
		public String getName() {
			return name;
		}
		
		public int getAge() {
			return age;
		}
		
		public String getNetWorth() {
			return networth;
		}
		
		public double getHeight() {
			return height;
		}
		
		public String getHitMovie() {
			return hitmovie;
		}
		
		public double getWeight() {
			return weight;
		}
		
		public void setAge(int pin,int newage) {
			if(this.pin==pin)
				age=newage;
			else
				System.out.println("Wrong PIN, Data not updated");
		}
		
		public void setNetWorth(int pin,String newnw)
		{
			if(this.pin==pin)
				networth=newnw;
			else
				System.out.println("Wrong PIN, Data not updated");
		}
		
		public void setHeight(int pin,double height)
		{
			if(this.pin==pin)
				this.height=height;
			else
				System.out.println("Wrong PIN, Data not updated");
		}
		
		public void setWeight(int pin,double weight)
		{
			if(this.pin==pin)
				this.weight=weight;
			else
				System.out.println("Wrong PIN, Data not updated");
		}
		
		public void setHitMovie(int pin,String newHit)
		{
			if(this.pin==pin)
				hitmovie=newHit;
			else
				System.out.println("Wrong PIN, Data not updated");
		}
		
		public void info()
		{
			System.out.println("Name:"+name);
			System.out.println("Age:"+age);
			System.out.println("NetWorth:"+networth);
			System.out.println("Height:"+height);
			System.out.println("Hit Movie:"+hitmovie);
			System.out.println("Weight:"+weight);
		}
}
