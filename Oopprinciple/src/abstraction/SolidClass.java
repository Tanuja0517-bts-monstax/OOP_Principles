package abstraction;

public class SolidClass extends AbsClass{
	int num;
	String channelname;
	String show;
	
	public void channel(int num,String channelname,String show) {
			this.num=num;
			this.channelname=channelname;
			this.show=show;
		}
	 public void infoShow() {
		 System.out.println("Channel number:"+num);
		 System.out.println("Channel name:"+channelname);
		 System.out.println("Channel show name:"+show);
	 }
}
