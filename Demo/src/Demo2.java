import java.util.*;

public class Demo2 {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(34);
		al.add(44);
		al.add(39);
		al.add(40);
		al.add(80);
		System.out.println(al);
		List s1=al.subList(1, 4);
		System.out.println(s1);
		 al.add(2, 21);
		System.out.println(al);
		al.set(2, 99);
		System.out.println(al);
		al.add(2, 99);
		System.out.println(al);
		List s=al.subList(3, 5);
		System.out.println(s);
		al.add('a');
		System.out.println(al);
		al.remove(3);
		System.out.println(al); 
		//al.remove(4); //remove(int index)
		//System.out.println(al);
	//	al.remove(44); // remove(obejct)
		//System.out.println(al);
		//al.remove('a');
		//System.out.println(al); //exception =indexout of bound
	}

}
