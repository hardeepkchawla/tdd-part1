/*
public class Dollar extends Money {

	
	public Dollar( int amount, String currency ) {
		super(amount, currency);
	}
	
	public Money times( int multiplier ) {
		//return Money.dollar( amount * multiplier );
		return new Dollar( amount * multiplier, currency );
	}
	
	public boolean equals( Object object ) {
		Money money = ( Money ) object;
		return this.amount == money.amount && getClass().equals( money.getClass() ) ;
	}
	
	public String currency() {
		return currency;
	}
}
*/
