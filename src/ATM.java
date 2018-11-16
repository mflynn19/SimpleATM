import java.util.Scanner;

public class ATM {
	private BankAccount acc;
	private Scanner in = new Scanner(System.in);
	public ATM(BankAccount acc) {
		this.acc = acc;
	}
	public void deposit() {
		int k = in.nextInt();
		in.nextLine();
		acc.setbalance(acc.getbalance() + k); 
	}
	public void withdraw() {
		int k = in.nextInt();
		in.nextLine();
		if (k < acc.getbalance()) {
			acc.setbalance(acc.getbalance() - k);
		}
	}
	public void menu() {
		System.out.println("Welcome to the bank of FAFSA. Please enter your SSN.");
		int i = in.nextInt();
		in.nextLine();
		while (i != acc.getSSN) {
			System.out.println("You have no account here. Please try again.");
		}
		else {
			System.out.println("Please enter your pin.");
			int j = in.nextInt();
			in.nextLine();
			while (j != acc.getpin) {
				System.out.println("Incorrect pin please try again.");
			}
			else {
				System.out.println("Please select 1 to withdraw; 2 to deposit; 3 to see your account balance.");
				int select = in.nextInt();
				switch(select) {	
				case 1:
					double want = in.nextDouble();
					in.nextLine();
					double who = acc.withdraw(want);
					if (who == 0) {
						System.out.println("Insufficient funds. Go to work.");
					}
					else if (who == 1) {
						System.out.println("Invalid amount!");
					}
					else {
						System.out.println("Your current balance is " + balance);
					}
					break;
				
				case 2:
					double addition = in.nextDouble();
					in.nextLine();
					double what = acc.deposit(what);
					System.out.println("Your current balance is" + what);
					break;
				
				case 3:
					double isit = in.NextDouble();
					in.nextLine();
					double where = acc.balance(balance);

					System.out.println("Your current balance is" + acc.balance(balance));
					break;
			}
		}
	}
	Scanner.close();     
}




System.out.println("Please type in your SSN.");
int n = s.nextInt();
if (n != SSN) {
	System.out.println("Please type in a valid SSN.");
}