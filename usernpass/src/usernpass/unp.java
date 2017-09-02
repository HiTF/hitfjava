package usernpass;

import javax.swing.JOptionPane;

class unp {

	public static void main(String[] args) {
		String username = JOptionPane.showInputDialog("Андрей пидр?:");
		String password = JOptionPane.showInputDialog("Точно?:");
		if ((
				(username.equals("да")&&
				password.equals("да")) || 
				(username.equals("hritter")&&
				password.equals("preakston"))
				))
				{
			JOptionPane.showMessageDialog(null,"Ну значит Андрей пидр");
		}else {
			JOptionPane.showMessageDialog(null,"Андрей пошел нахуй");		
			}
		}
}
