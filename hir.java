package MyPackage;

public class hir {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
  abstract class google {
	  abstract void Search();
	public void message() {
		
	System.out.println("Thanking you for using google");
		
	}
   class SearchAll extends google{
	   void Search() {
		   System.out.println("All search results");	   
	   }
	   
   }
  }