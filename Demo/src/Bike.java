
public class Bike extends Vehicle implements SelfStart,KickStart{
	@Override
	void start()
	{
		System.out.println("bike start");
	}
	@Override
	void stop()
	{
		System.out.println("bike stop");	
	}
	@Override
	public void kickStart() {
		System.out.println("kick start");
		
	}
	@Override
	public void selfStart() {
		System.out.println("self start");
		
	}


}
