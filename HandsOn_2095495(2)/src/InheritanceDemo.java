
public class InheritanceDemo {

	public static void main(String[] args) {
		NRIAccount nri= new NRIAccount();
		SeniorCitizen sr= new SeniorCitizen();
		nri.depositMoney();
		nri.applyFixesDeposit();
		nri.withdrawMoney();
		sr.applyFixedDeposit();
		sr.depositMoney();
		sr.withdrawMoney();

	}

}
