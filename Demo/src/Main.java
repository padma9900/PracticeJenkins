
public class Main {
public static void main(String[] args) {
Emplyoee e=new Backend("padma",2,3434676);
System.out.println(e.Ename+" "+e.Eid+" "+e.Salary);
e.work();
Emplyoee e1=new Frontend("ABCF",1,23456);
System.out.println(e1.Ename+" "+e1.Eid+" "+e1.Salary);
e1.work();
Emplyoee e2=new Manual("Anu",1,25387);
System.out.println(e2.Ename+" "+e2.Eid+" "+e2.Salary);
e2.work();
Emplyoee e3=new Automation("ABEDFJ",1,23456);
System.out.println(e3.Ename+" "+e3.Eid+" "+e3.Salary);
e3.work();

Emplyoee e4=new Devolopment();
e4.work();
Emplyoee e5=new Hr();
e5.work();

}

}
