class Bike
{
	void run()
	{
		System.out.println("runnig");
	}
}
class Splender extends Bike
{
	void run()
	{
		System.out.println("running safely with 60km..");
	}
	public static void main(String agrs[])
	{
		Bike b=new Splender();//upcasting.
		b.run();
	}
}
	
		