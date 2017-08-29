package usernpass;

import javax.swing.JOptionPane;

class unp {

	public static void main(String[] args) {
		String username = JOptionPane.showInputDialog("Username:");
		String password = JOptionPane.showInputDialog("Password:");
		if (username != null && password != null && (
				(username.equals("bburd")&&
				password.equals("swordfish")) || 
				(username.equals("hritter")&&
				password.equals("preakston"))
				))
				{
			JOptionPane.showMessageDialog(null,"U enter to System");
		}else {
			JOptionPane.showMessageDialog(null,"U enter to System");		
			}
		}
}
