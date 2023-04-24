package firststep;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

// Production Code를 테스트 해보는 코드 
// 메소드를 분리해서 각각을 테스트 할 수 있도록 구현  -> Junit을 활용한 테스트 코드로 수정 
public class CalculatorTest {
	private Calculator cal;
	
	@Before // 매 테스트마다 동작하는 것을 어노테이션으로 처리 -> 추후에 Junit에서 확장 가능성이 커짐!
	public void setup()
	{
		cal = new Calculator();
		System.out.println("Before");
	}
	
	@Test
	public void add() 
	{
		assertEquals(9,cal.add(6, 3));
	}
	
	@Test
	public void subtract()
	{
		assertEquals(3, cal.subtract(6, 3));
	}
	
	@Test
	public void multiply()
	{
		assertEquals(18, cal.multiply(6, 3));
	}
	
	@Test
	public void divide()
	{
		assertEquals(2,cal.divide(6, 3));
	}
	
	@After
	public void afterwork()
	{
		System.out.println("End Test");
	}
	
}
