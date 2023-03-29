package exam04;

public class Main {

	public static void main(String[] args) {
		
		NormalCustomer ncus1 = new NormalCustomer();
		
		PremiumCustomer pcus1 = new PremiumCustomer();
		
		ncus1.buy("가방", 1000000);
		pcus1.buy("샤넬", 1000000);

	}

}
