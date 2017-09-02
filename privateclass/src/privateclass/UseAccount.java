package privateclass;

import static java.lang.System.out;

class UseAccount {

	public static void main(String[] args) {
		Account myAccount  = new Account();;
		Account uAccount = new Account();;
		
		myAccount.setName("Barry");
		myAccount.setAdress("Moscow");
		myAccount.setBalance(1.3);
		uAccount.setName("BMary");
		uAccount.setAdress("London");
		uAccount.setBalance(1.3);
		out.println(myAccount.getName());
		out.println(myAccount.getAdress());
		out.println(myAccount.getBalance(5.0));
		out.println();
		out.println(uAccount.getBalance(100.0));
		}

}
