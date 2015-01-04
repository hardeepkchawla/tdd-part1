import java.util.Hashtable;


public class Bank {

	private Hashtable<String, Integer> rates = new Hashtable<String, Integer>();
	public Money reduce( Expression source, String to ) {
		return source.reduce( this, to );
	}
	
	public int rate( String from, String to ) {
		if( from.equals(to) ) {
			return 1;
		}
		String key = from + "_" + to;
		Integer rate = rates.get(key);
		return rate.intValue();
		//return from.equals("CHF") && to.equals("USD") ? 2 : 1;
	}
	
	public void setRate( String from, String to, int rate ) {
		rates.put( from + "_" + to, new Integer( rate ) );
	}
	
}
