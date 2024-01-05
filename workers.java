package MyPackage; //problem 2 inheritance

public class workers {

	public static void main(String[] args) {
		// TODO Auto-genE
		MyEmployee eN= new MyEmployee();
		eN.Cname="GOOGLE";
	     eN.Ctype="Big";
         eN.name="Anu";
         eN.Salary=43657;
	      eN.display();
	Department D= new Department();
		D.Dname="Tech";
		D.Designation="Software Enger";
		D.display();
		
	}	
	
}
	class company{
		String Cname;
		String Ctype;
		
	}
	class MyEmployee extends company{
		String name;
		double Salary;
     public void display() {
       System.out.println(Cname+" "+Ctype+" "+name+" "+Salary);   	 
         }
	}
	class Department extends company{
		String Dname;
		String Designation;
		public void display () {
			System.out.println(Dname+ " "+Designation);
		}
	}
	

	
	
	
