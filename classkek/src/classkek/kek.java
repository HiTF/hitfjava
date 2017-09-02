package classkek;



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
		System.out.println();
		uAccount.display();
	}

}
