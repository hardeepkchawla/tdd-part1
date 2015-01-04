
public class Money implements Expression {

	//public Money times( int multiplier );
	//public String currency();
	protected int amount;
	protected String currency;
	
	public Money( int amount, String currency ) {
		this.amount = amount;
		this.currency = currency;
	}
	
	public static Money dollar(int amount) {
		return new Money(amount, "USD");
	}
	
	public static Money franc(int amount) {
		return new Money(amount, "CHF");
	}
	
	public boolean equals( Object object ) {
		Money money = (Money) object;
		return amount == money.amount
				&& currency.equals( money.currency() );		
	}
	
	public Expression times( int multiplier ) {
		return new Money( amount * multiplier, currency );
	}
	
	/*public Money times( int multiplier ) {
		amount * multiplier;
	}*/
	
	public String currency() {
		return currency;
	}
	
	/*public Money plus(Money addend) {
		return new Money(amount + addend.amount, currency);
	}*/
	
	public String toString() {
		return amount + " " + currency;
	}
	
	public Expression plus( Expression addend ) {
		return new Sum( this, addend );
	}
	
	public Money reduce( Bank bank, String to ) {
		int rate = bank.rate(currency, to);
		return new Money(amount/rate, to);
		
	}
}
