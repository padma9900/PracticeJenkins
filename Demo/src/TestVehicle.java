
public class TestVehicle {
public static void main(String[] args) {
	Vehicle v=new Bike();
	SelfStart s=new Bike();
   KickStart k=new Bike();
   v.start();
  v.stop();
  s.selfStart();
  k.kickStart();
  
	
	
}
}
