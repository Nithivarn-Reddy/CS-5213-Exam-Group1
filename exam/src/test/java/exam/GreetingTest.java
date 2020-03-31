package exam;

import static org.junit.Assert.*;

import org.junit.Test;

public class GreetingTest {

	@Test
	public void testHello1() 
	{
		assertEquals("Hello Bob", Exam.getGreeting("Bob"));
	}
	
	@Test
	public void testHello2() 
	{
		assertEquals("Hello a", Exam.getGreeting("a"));
	}
	@Test
	public void testGoodBye1() 
	{
		assertEquals("Goodbye a", Exam.getGoodBye("a"));
	}
	@Test
	public void testGoodBye2() 
	{
		assertEquals("Goodbye Jim", Exam.getGoodBye("Jim"));
	}
}
