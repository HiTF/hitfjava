import javax.swing.JFrame;

class FirstTime {

	public static void main(String[] args) {
		JFrame myFrame = new JFrame();
		String myTitle = "Upyachka";
		myFrame.setTitle(myTitle);
		myFrame.setSize(300, 200);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		System.out.println("Hello World!");
	}
}

