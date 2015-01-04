import static org.junit.Assert.*;

import org.junit.Test;


public class DollarTest {
	
	@Test
	public void testDollar() {
		//fail("Not yet implemented");
		testMultiplication();
		testEquality();
	}
	
	public void testMultiplication() {
		Money five = Money.dollar(5);
		assertEquals( Money.dollar(10), five.times(2) );
		assertEquals( Money.dollar(15), five.times(3) );
	}
	
	public void testEquality() {
		assertTrue( Money.dollar(5).equals(Money.dollar(5)) );
		assertFalse( Money.dollar(5).equals(Money.dollar(6)) );
		assertTrue( Money.Franc(5).equals(Money.Franc(5)) );
		assertFalse( Money.Franc(5).equals(Money.Franc(6)) );
		assertFalse(Money.Franc(5).equals(Money.dollar(6)));

	}
	
	public void testCurrencty() {
		assertEquals( "CHF", Money.Franc(1).currency() );
		assertEquals( "USD", Money.dollar(1).currency() );
	}


}
