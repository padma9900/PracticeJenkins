import java.util.ArrayList;
import java.util.Vector;

public class Demo4 {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add("finch");
		al.add("maxi");
		al.add("susi");
		al.add("padu");
		al.add("anki");

System.out.println(al);
Vector v=new Vector();
//v.addAll(al);
      v.add(34);
      v.add(23);
     v.addAll(al);
      v.add(null);
      v.add(45);
System.out.println(v);
	}


}
