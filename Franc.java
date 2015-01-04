
public class Franc extends Money {
	
	public Franc( int amount ) {
		super(amount);
		this.amount = amount;
	}

	public Money times( int multiplier ) {
		return new Franc( amount * multiplier );
	}
	
	public boolean equals( Object object ) {
		Money money = ( Money ) object;
		return this.amount == money.amount;
	}

}
