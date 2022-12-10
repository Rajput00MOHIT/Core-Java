package in.co.oop;

public class testaccountoop {
 public static void main(String[] args) {
	 Accountoop a = new Accountoop();
	 a.setnumber("954410110009652");
	 a.setaccounttype("current");
	a.setbalance(1000000.00);
	double withdrawal =(22545.00);
	System.out.println("Account Number :" + a.getnumber());
	System.out.println("Account Type :" + a.getaccounttype());
	System.out.println("total Balance :"+ a.getbalance());
	System.out.println("withdrawl :" + withdrawal);
	System.out.println("Balance:" + (a.getbalance()-withdrawal));
	
	 }


}
