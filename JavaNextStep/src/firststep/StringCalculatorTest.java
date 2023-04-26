package firststep;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class StringCalculatorTest {
	
	private StringCalculator cal ;
	
	@Before
	public void setup()
	{
		cal = new StringCalculator();
	}
	
	
	@Test
	public void addtest()
	{
		assertEquals(3,cal.add("1:2"));
	}
	
	@Test
	public void addtest2()
	{
		assertEquals(0,cal.add(""));
	} 
	
	@Test
	public void addtest3()
	{
		assertEquals(6,cal.add("//;\n1;2;3"));
	}
}
