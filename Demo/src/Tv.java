
public class Tv implements Switch,Remote {

	@Override
	public void changeChannel() {
		System.out.println("change chanels");
		
	}

	@Override
	public void SwitchOn() {
		System.out.println("tv gets on");
		
	}

	@Override
	public void switchOff() {
		System.out.println("tv gets off");
	}

}
