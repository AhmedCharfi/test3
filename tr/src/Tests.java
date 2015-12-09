
import static org.junit.Assert.*;

import org.junit.Test;


public class Tests {
	Taschenrechner tr = new Taschenrechner();
	int a = 4;
	int b= 5;
	@Test
	public void test1()
	{
		assertEquals(tr.add(a,b),9);
		assertEquals(tr.mul(a,b),20);
	
	}
	@Test
	public void test2()
	{
			
		assertEquals(tr.div(a,b),0);
		assertEquals(tr.sub(a,b),11);
		
		
	}
	
}
