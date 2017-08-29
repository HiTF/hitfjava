package pass;
import static java.lang.System.*;
import java.util.Scanner;

class PassCheck {

	public static void main(String[] args) {
		out.println("Enter passsword");
		Scanner keyboard = new Scanner(in);
		String password = keyboard.next();
		out.println("U enter >>"+ password + "<<");
		out.println();
		if (password == "swordfish") {
			out.println("something");
		} else {
			out.println("somthing else");
			
		}
		out.println();
		if (password.equals("swordfish")) {
			out.println("true");
		}else {
			out.println("u pidr");
		}
	}

}
