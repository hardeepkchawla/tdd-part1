import static org.junit.Assert.*;

import org.junit.Test;


public class FrancTest {
	
	@Test
	public void testFranc() {
		//fail("Not yet implemented");
		testMultiplication();
		testEquality();
	}
	
	public void testMultiplication() {
		Money five = Money.Franc(5);
		assertEquals( Money.Franc(10), five.times(2) );
		assertEquals( Money.Franc(15), five.times(3) );
	}
	
	public void testEquality() {
		assertTrue( Money.Franc(5).equals(Money.Franc(5)) );
		assertFalse( Money.Franc(5).equals(Money.Franc(6)) );
	}


}
