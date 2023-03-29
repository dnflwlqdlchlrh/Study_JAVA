package exam04;

public class PremiumCustomer extends Customer{
	
	private double discount;
	private int priceTotal;
	
	@Override
	public void buy(String productName, int price) {
		priceTotal += price;
		double p = calcDiscount(price);
		System.out.printf("%s 상품을 %.2f 할인율 적용하요 %,.1f원에 구입하였습니다.\n", productName, discount, p);
	}
	
	private double calcDiscount(int price) {
		if(priceTotal >= 1000000) {
			discount = 0.1;
			return price * (1 - 0.1);
		}else if(priceTotal >= 500000) {
			discount = 0.05;
			return price * (1 - 0.05);
		}else if(priceTotal >= 300000) {
			discount = 0.02;
			return price * (1 - 0.02);
		} else {
			return price;
		}
	}

}
