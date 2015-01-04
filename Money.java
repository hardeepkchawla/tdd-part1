
public abstract class Money {

	public abstract Money times( int multiplier );
	protected int amount;
	
	public Money( int amount ) {
		this.amount = amount;
	}
	
	public static Money dollar(int amount) {
		return new Dollar(amount);
	}
	
	public static Money Franc(int amount) {
		return new Franc(amount);
	}
	
}
