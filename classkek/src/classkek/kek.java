package classkek;

import static java.lang.System.out;

class kek {

	public static void main(String[] args) {
		Account myAccount  = new Account();;
		Account uAccount = new Account();;
		
		myAccount.name = "Barry";
		myAccount.adress = "Barklays";
		myAccount.balance = 24.02;
		uAccount.name = "Hyyarri";
		uAccount.adress = "Pervomayskaya";
		uAccount.balance = 14.88;
		
		myAccount.display();
		out.printf(" $%4.2f\n", myAccount.getInterest(5.00));
		System.out.println();
		uAccount.display();
		out.print(uAccount.getInterest(10.00));
		
		
	}

}
