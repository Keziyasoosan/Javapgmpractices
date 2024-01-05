package MyPackage;

public class Stat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pen e1=new pen();
		e1.id=23;
		e1.display();
		e1.designation="engineer";
		pen e2=new pen();
		e2.id=34;	         // 
		e2.salary=24356;//duplication forms 
	e2.designation="tester";
	e2.display();
		pen e3=new pen();
		e3.id=54;
		e3.designation="assi";
		e3.salary=325434;
		e3.display();
        System.out.println(e2.totalsalary());
          pen.computeGrat(10,348524 );
	}

}
class pen{
	int id;
	static String cname="asd";
	String designation;
	int salary;

public void display() {
   System.out.println("ID=   "+id+"CNAME:  "+cname+"DESIGNATION:   " +designation+"SALARY=     "+salary+"  ");
	
}
public int totalsalary() {
	// TODO Auto-generated method stub
	return salary;
}
public static int  computeGrat(int noOfyr,int salary) {
	return noOfyr*salary*15/26;
}
}