
public class AccountingApp {
	
	public static void main(String[] args) {
		
		double valueofSupply = 20000.0;
		double vatRate = 0.1;
		double expenseRate = 0.3;
		double vat = valueofSupply * vatRate;
		double total = valueofSupply + vat;
		double expense = valueofSupply * expenseRate;
		double income = valueofSupply - expense;
		
		double dividend1 = income * 0.5;
		double dividend2 = income * 0.3;
		double dividend3 = income * 0.2;
		
		
		System.out.println("Value of supply : " + valueofSupply);
		System.out.println("VAT : " + vat);
		System.out.println("Total : " + total);
		System.out.println("Expense : " + expense );
		System.out.println("Income : " + income);
		System.out.println("Dividend1 : " + dividend1);
		System.out.println("Dividend2 : " + dividend2);
		System.out.println("Dividend3 : " + dividend3);
		
		
		
	}
}
