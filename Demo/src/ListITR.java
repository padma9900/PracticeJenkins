//import java.util.ArrayList;
//import java.util.ListIterator;
import java.util.*;
public class ListITR {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(12);
		al.add(21);
		al.add(45);
		al.add("hello");
		al.add(null);
		al.add(13.25);
		ListIterator itr=al.listIterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		

	}

}
