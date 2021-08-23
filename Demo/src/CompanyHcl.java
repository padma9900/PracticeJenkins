import java.util.Iterator;
import java.util.LinkedList;
public class CompanyHcl {
	
	public static void main(String[] args) {
		
		LinkedList<DevEngg> dev=new LinkedList<DevEngg>();
		
		dev.add(new DevEngg("padma",27,35000,8884310855l,"padma@gmai.com"));
		dev.add(new DevEngg("dinga",25,30000,8234310855l,"dinga@gmai.com"));
		dev.add(new DevEngg("dingi",23,25000,9004310855l,"dingi@gmai.com"));
		
		Iterator itr=dev.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println();
		
	    LinkedList<TestEngg> te=new LinkedList<TestEngg>();
		
		te.add(new TestEngg("abc",20,36000,7184310855l,"abc@gmai.com"));
		te.add(new TestEngg("def",28,31000,7834310855l,"def@gmai.com"));
		te.add(new TestEngg("xyz",29,29000,9904310855l,"xyz@gmai.com"));
		
		Iterator itr1=te.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println();
		
	      LinkedList<Hr1> hr=new LinkedList<Hr1>();
		
		hr.add(new Hr1("paddu",30,45000,9984310855l,"paddu@gmai.com"));
		hr.add(new Hr1("vaishu",35,35000,7734310855l,"vaishu@gmai.com"));
		hr.add(new Hr1("bhumi",32,55000,8904310855l,"bhumi@gmai.com"));
		
		Iterator itr2=hr.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println();
		
		LinkedList all=new LinkedList();
		all.addAll(dev);
		all.addAll(te);
		all.addAll(hr);
		for (Object a:all)
		{
		System.out.println(a);
			
	}	
		
	}
	}

