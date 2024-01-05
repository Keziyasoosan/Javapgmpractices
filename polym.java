package MyPackage;
//encapulsation
public class polym {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        employee cuEm =new employee();
        cuEm.setName("keziya");
        System.out.println(cuEm.getName("keziya"));
        cuEm.setEmail("kezisus@gmail.com");
        System.out.println(cuEm.getEmail("kezisus@gmail.com"));
        cuEm.setPhoneno(46767478);
        System.out.println(cuEm.getPhoneno(46767478));
        
        
      
	}

}
class employee{
	private String name;
	private String email;
	private int phoneno;
	
	public void setName(String name) {
		this.name=name;
		                                     //mthods
	}
	public String getName(String name) {
		return name;
		
	}
	public void setEmail(String email) {
		this.email=email;
	}
	public String getEmail(String email) {
		return email;
		
	}
	public void setPhoneno(int phoneno) {
		this.phoneno=phoneno;
		
	}
	public int getPhoneno(int phnone) {
		return phoneno;
		
	}
}