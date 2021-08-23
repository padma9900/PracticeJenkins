
public class Hr1 extends Emp {
	Hr1(String name,int age,int sal,long mob,String email)
	{
		super.name=name;
		super.age=age;
		super.sal=sal;
		super.mob=mob;
		super.email=email;
		
	}
	public String toString()
	{
		return "["+super.name+" "+super.age+"  "+super.sal+"  "+super.mob+"  "+super.email+" ]";
	}
	}

