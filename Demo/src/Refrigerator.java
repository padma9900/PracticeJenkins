
public class Refrigerator implements Switch{

	@Override
	public void SwitchOn() {
System.out.println("cooling gets on");
	}

	@Override
	public void switchOff() {
		System.out.println("cooling gets off");
	}

}
