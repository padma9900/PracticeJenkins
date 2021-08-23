import java.util.ArrayList;
import java.util.Collection;

public class ArrayListExp {

	public static void main(String[] args) {
	Collection c=new ArrayList();
	c.add(23);
	c.add(34);
	c.add(45);
	c.add("paddu");
	c.add("maxwell");
	c.add('e');
	c.add(45.23);
	System.out.println(c);
	System.out.println(c.size());
	c.remove("paddu");
	System.out.println(c);
	System.out.println(c.contains(45));
	System.out.println(c.contains(20));
	System.out.println(c.size());
	System.out.println(c.isEmpty());
	c.removeAll(c);
	System.out.println(c);
	System.out.println(c.isEmpty());
	}

}
