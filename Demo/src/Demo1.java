import java.util.*;

public class Demo1 {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(23);
		al.add(23);
		al.add(null);
		al.add(35);
		al.add(null);
		al.add("paddu");
		al.add(45.13);
		System.out.println(al);
		ArrayList al1=new ArrayList(1000);
		al1.add(10001);
		System.out.println(al1);
		ArrayList al2=new ArrayList(0);
		al2.add(32);
		System.out.println(al2);
				
	}

}
