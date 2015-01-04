
public interface Expression {
	//public Money reduce( String to );
	public Money reduce( Bank bank, String to );
	public Expression times( int multiplier );
}
