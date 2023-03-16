
public class AccountingArrayLoopApp {
	
	public static void main(String[] args) {
		
		double valueofSupply = 20000.0;
		double vatRate = 0.1;
		double expenseRate = 0.3;
		double vat = valueofSupply * vatRate;
		double total = valueofSupply + vat;
		double expense = valueofSupply * expenseRate;
		double income = valueofSupply - expense;
		
		System.out.println("Value of supply : " + valueofSupply);
		System.out.println("VAT : " + vat);
		System.out.println("Total : " + total);
		System.out.println("Expense : " + expense );
		System.out.println("Income : " + income);
		
		double[] dividendRates = new double[3];
		dividendRates[0] = 0.5;
		dividendRates[1] = 0.3;
		dividendRates[2] = 0.2;
		
		
		int i = 0;
		while(i < dividendRates.length) {
			System.out.printf("Dividend %d : %.1f\n", i, income * dividendRates[i]);
			i = i + 1;
			
		}
		
		
		
	}
}
