package exam;

import org.junit.Test;

import static org.junit.Assert.*;

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

	@Test
	public void testGetNameLength()
	{
		int length = Exam.getNameLength("Jim");
		assertEquals(length, 3);
	}

	@Test
	public void testGetLastCharacter()
	{
		assertEquals('m', Exam.getLastCharacter("Exam"));
	}

}
