
public class Money {

	//public Money times( int multiplier );
	//public String currency();
	protected int amount;
	protected String currency;
	
	public Money( int amount, String currency ) {
		this.amount = amount;
		this.currency = currency;
	}
	
	public static Money dollar(int amount) {
		return new Dollar(amount, "USD");
	}
	
	public static Money franc(int amount) {
		return new Franc(amount, "CHF");
	}
	
	public boolean equals( Object object ) {
		Money money = (Money) object;
		return amount == money.amount
				&& currency.equals( money.currency() );		
	}
	
	public Money times( int multiplier ) {
		return new Money( amount * multiplier, currency );
	}
	
	/*public Money times( int multiplier ) {
		amount * multiplier;
	}*/
	
	public String currency() {
		return currency;
	}

}
