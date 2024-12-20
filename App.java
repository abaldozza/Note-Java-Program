import java.util.*;
import models.*;

public class App {
	public static void main(String[] args) {
		int choice = 0;
		boolean validInput = false;
		Scanner scan = new Scanner(System.in);

		System.out.println("\t.-=~=-.                                   .-=~=-.\r\n"
				+ "\t(__  _)-._.-=-._.-=-._.-=-._.-=-._.-=-._.-(__  _)\r\n"
				+ "\t( _ __)                                   ( _ __)\r\n"
				+ "\t(__  _)           YOUR NOTEPAD            (__  _)\r\n"
				+ "\t(_ ___)                                   (_ ___)\r\n"
				+ "\t(_ ___)-._.-=-._.-=-._.-=-._.-=-._.-=-._.-(_ ___)\r\n"
				+ "\t`-._.-'                                   `-._.-'");

		while (choice != 5 || !validInput) {
			try {
				System.out.println("\t\t       _________________\r\n"
						+ "\t\t    / \\                 \\.\r\n"
						+ "\t\t    |   |   1. Create   |.\r\n"
						+ "\t\t     \\_ |   2. Read     |.\r\n"
						+ "\t\t        |   3. Update   |.\r\n"
						+ "\t\t        |   4. Delete   |.\r\n"
						+ "\t\t        |   5. Exit     |.\r\n"
						+ "\t\t        |  _____________|__\r\n"
						+ "\t\t        \\_/_______________/\n");
				System.out.print("\t\t        Input -> ");
				choice = scan.nextInt();
				validInput = true;
			} catch (InputMismatchException e) {
				System.out.println("Invalid input.");
				scan.next();
			}

			switch (choice) {
				case 1:
					Create cr = new Create();
					System.out.println(cr);
					break;
				case 2:
					Read re = new Read();
					System.out.println(re);
					break;
				case 3:
					Update up = new Update();
					System.out.println(up);
					break;
				case 4:
					Delete de = new Delete();
					System.out.println(de);
					break;
				case 5:
					System.out.println("Goodbye!");
					System.exit(0);
				default:
					System.out.println("\nPlease input what's within the choices.\n");
					break;
			}
		}
	}
}
