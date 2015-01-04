
public abstract class Money {

	public abstract Money times( int multiplier );
	public abstract String currency();
	protected int amount;
	protected String currency;
	
	public Money( int amount, String currency ) {
		this.amount = amount;
		this.currency = currency;
	}
	
	public static Money dollar(int amount) {
		return new Dollar(amount, "USD");
	}
	
	public static Money Franc(int amount) {
		return new Franc(amount, "CHF");
	}
	
}
