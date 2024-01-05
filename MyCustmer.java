package MyPackage;

public class MyCustmer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 MyBank ob=new MyBank();
 ob.setMoney(10000);
 int MyProfit=ob.getMoney();
 System.out.println("My amount is "+MyProfit);
 
	}
}

class MyBank {
	 private int money;


public void setMoney(int money) {
	this.money=money;
}
public int getMoney() {
	return money*2 ;
}
}