package firststep;

// Production Code를 테스트 해보는 코드 
// 메소드를 분리해서 각각을 테스트 할 수 있도록 구현  
public class CalculatorTest {
	public static void main(String[] args)
	{
		Calculator cal = new Calculator();
		add(cal);
		substract(cal);
		multiply(cal);
		divide(cal);
	}
	
	private static void add(Calculator cal)
	{
		System.out.println(cal.add(3,4));
	}
	
	private static void substract(Calculator cal)
	{
		System.out.println(cal.subtract(5,4));
	}
	
	private static void multiply(Calculator cal)
	{
		System.out.println(cal.multiply(2,6));
	}
	
	private static void divide(Calculator cal)
	{
		System.out.println(cal.divide(8,4));
	}
}
