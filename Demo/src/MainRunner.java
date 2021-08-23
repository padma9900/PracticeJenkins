
public class MainRunner {
public static void main(String [] args){
	Tv t=new Tv();
    t.SwitchOn();
	t.switchOff();
	t.changeChannel();
	
	Refrigerator r=new Refrigerator();
	r.SwitchOn();
	r.switchOff();
	
	Switch s=new Refrigerator();
	s.SwitchOn();
	s.switchOff();
	
	
}

}
