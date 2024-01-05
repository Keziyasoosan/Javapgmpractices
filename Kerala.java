package MyPackage;

public class Kerala {
  int populatin;
  String Mname;
  double Salary;
  Kerala(int population,String Mname,double Salary){
	  this.populatin=population;
	  this.Mname=Mname;
	  this.Salary=Salary;
  }
  public void show() {
	  System.out.println(populatin+Mname+Salary);
  }
}
