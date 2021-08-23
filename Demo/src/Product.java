
public class Product {
String pname,pid,clr;
int price;
Product(String pname,String pid,String clr,int price)
{
	this.pname=pname;
	this.pid=pid;
	this.clr=clr;
	this.price=price;
}
public String toString()
{
	return"[ " +this.pname+"  "+this.pid+"  "+this.clr+"  "+price+"  ]";
	
	
}
}
