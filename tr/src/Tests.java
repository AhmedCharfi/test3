
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
		if(tr.getOp().equals("-"))
		{
		assertEquals(tr.getRes(),-1);
		}
		if(tr.getOp().equals("?"))
		{
		assertEquals(tr.getRes(),4);
		}
	}
	@Test
	public void test3()
	{
		if(tr.getOp().equals("*"))
		{
		assertEquals(tr.getRes(),10);
		}
		if(tr.getOp().equals("/"))
		{
		assertEquals(tr.getRes(),0);
		}
	}
	
}
