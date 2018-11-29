package clients.cashier;

import catalogue.Basket;
import catalogue.BetterBasket;
import middle.MiddleFactory;


public class BetterCashierModel extends CashierModel{
	public BetterCashierModel(MiddleFactory mf) {
		super(mf);
	}

	@Override
	public Basket makeBasket() {
		return new BetterBasket();
	}
}
