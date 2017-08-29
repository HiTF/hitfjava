package dell;

import java.io.File;
import static java.lang.System.out;
import java.util.Scanner;

class delete {
	public static void main(String[] args) {
		File evidence = new File("CookedBooks.txt");
		Scanner keyboard = new Scanner(System.in);
		char reply;
		do {
			out.print("Delete file? (y/n)");
			reply = keyboard.findWithinHorizon(".",0).charAt(0);
		}while (reply != 'y' && reply !='n');
		if (reply == 'y') {
			out.println("Ok, delete");
			evidence.delete();
			out.println("File has been delete");
		}else {
			out.println("Ok, Ok, i dont delete this shit");
		}

	}

}
