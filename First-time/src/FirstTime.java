import javax.swing.JFrame;

class FirstTime {

	public static void main(String[] args) {
		JFrame myFrame = new JFrame();
		String myTitle = "Upyachka";
		myFrame.setTitle(myTitle);
		myFrame.setSize(300, 150);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setVisible(true);
		System.out.println("Hello World!");
	}
}

