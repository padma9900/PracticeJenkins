import java.util.ArrayList;

public class TestProduct {

	public static void main(String[] args) {
		ArrayList<Product> arr=new ArrayList<Product>();
		arr.add(new Product("laptop","abc","black",70000));
		arr.add(new Product("washing machine","ide","silver",50000));
		arr.add(new Product("tablefan","xyz","white",30000));
		arr.add(new Product("book","uvc","red",3000));
		for(Object a:arr)
		{
			System.out.println(a);
		}
	}

}
