
public class BankAccount {
	int depositeAmount;
	int withdrawAmount;
	int balance;
	double interestRate;
	void depositMoney() {
		System.out.println("The deposited amount is: "+depositeAmount);
	}
	void withdrawMoney() {
		balance= depositeAmount-withdrawAmount;
		System.out.println("The balance is: "+balance);
	}
}
