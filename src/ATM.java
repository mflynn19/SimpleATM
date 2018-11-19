import java.util.Scanner;

public class ATM {
	private BankAccount acc;
	private AccountHolder per;
	private Scanner in = new Scanner(System.in);
	public ATM(BankAccount acc, AccountHolder per) {
		this.acc = acc;
		this.per= per;
	}
	public void deposit() {
		int k = in.nextInt();
		in.nextLine();
		acc.setBalance(acc.getBalance() + k); 
	}
	public void withdraw() {
		int k = in.nextInt();
		in.nextLine();
		if (k < acc.getBalance()) {
			acc.setBalance(acc.getBalance() - k);
		}
	}
	public void menu() {
		System.out.println("Welcome to the bank of UCVTS. Please enter your account number.");
		long i = in.nextLong();
		in.nextLine();
		if (i == acc.getAccountNumber()) {
			System.out.println("Please enter your pin.");
			int n = in.nextInt();
			in.nextLine();
			if (n == per.getPIN()) {
				System.out.println("Please select 1 to withdraw; 2 to deposit; 3 to see your account balance; 4 to exit.");
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
						System.out.println("Your current balance is " + acc.getBalance());
					}
							break;
						
						case 2:
							double addition = in.nextDouble();
							in.nextLine();
							double what = acc.deposit(addition);
							System.out.println("Your current balance is " + what + ".");
							break;
						
						case 3:
							System.out.println("Your current balance is " + acc.getBalance() + " .");
							break;
						case 4:
							System.out.println("Thank you for visiting the bank of UCVTS! Goodbye!");
					}
				}
			}
		else {
			System.out.println("Please reenter your account information.");
		}
		}
	}