import static org.junit.Assert.*;

import org.junit.Test;


public class DollarTest {
	
	@Test
	public void testDollar() {
		//fail("Not yet implemented");
		//testDifferentClassEquality();
	}
	@Test
	public void testMultiplication() {
		Money five = Money.dollar(5);
		assertEquals( Money.dollar(10), five.times(2) );
		assertEquals( Money.dollar(15), five.times(3) );
	}
	@Test
	public void testEquality() {
		assertTrue( Money.dollar(5).equals(Money.dollar(5)) );
		assertFalse( Money.dollar(5).equals(Money.dollar(6)) );
		assertTrue( Money.franc(5).equals(Money.franc(5)) );
		assertFalse( Money.franc(5).equals(Money.franc(6)) );
		assertFalse(Money.franc(5).equals(Money.dollar(6)));

	}
	@Test
	public void testCurrency() {
		assertEquals( "CHF", Money.franc(1).currency() );
		assertEquals( "USD", Money.dollar(1).currency() );
	}
	
	/*@Test
	  public void testDifferentClassEquality() {
		assertTrue(new Money(10, "CHF").equals(new Franc(10, "CHF")));
	}*/
	@Test
	public void testSimpleAddition() {
		Money five = Money.dollar(5);
		Bank bank = new Bank();
		Expression sum = five.plus(five);
		Money reduced = bank.reduce(sum, five.currency() );
		assertEquals(Money.dollar(10), reduced );
	}
	@Test
	public void testPlusReturnsSum() {
		Money five = Money.dollar(5);
		Expression result = five.plus(five);
		Sum sum = (Sum) result;
		assertEquals(five, sum.augend );
		assertEquals(five, sum.addend );
	}
	@Test
	public void testReduceSum() {
		Expression sum = new Sum(Money.dollar(3), Money.dollar(4));
		Bank bank = new Bank();
		Money result = bank.reduce(sum, "USD");
		assertEquals(Money.dollar(7), result);
	}

}
