package MyPackage;
//method -overloading
public class methover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		shape s =new shape();
		s.area(20);
		s.area(5);
		s.area(5, 8);
		

	}
	

}
class shape {
	public void area(double r) {
	 double pi=3.14;
	 double  c= pi*r*r;
	System.out.print("circle area="+c);
}
 public void area(int a) {
	 int s=a*a;
	 System.out.println("square area="+s);
	 
 }
   public void area(float a, float b) {
	 float n=a*b;
	System.out.println("rectangle area="+n);
	
 }

}