package usernpass;

import javax.swing.JOptionPane;

class unp {

	public static void main(String[] args) {
		String username = JOptionPane.showInputDialog("������ ����?:");
		String password = JOptionPane.showInputDialog("�����?:");
		if ((
				(username.equals("��")&&
				password.equals("��")) || 
				(username.equals("hritter")&&
				password.equals("preakston"))
				))
				{
			JOptionPane.showMessageDialog(null,"�� ������ ������ ����");
		}else {
			JOptionPane.showMessageDialog(null,"������ ����� �����");		
			}
		}
}
