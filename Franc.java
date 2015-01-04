
public class Franc extends Money {
	
	public Franc( int amount, String currency ) {
		super(amount, currency);
	}

	public Money times( int multiplier ) {
		return Money.Franc( amount * multiplier );
	}
	
	public boolean equals( Object object ) {
		Money money = ( Money ) object;
		return this.amount == money.amount;
	}
	
	public String currency() {
		return currency;
	}

}
