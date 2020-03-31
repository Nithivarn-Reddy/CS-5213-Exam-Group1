package exam;

import static org.junit.Assert.*;

import org.junit.Test;

public class GreetingTest {

	@Test
	public void test() 
	{
		assertEquals("Hello Bob", Exam.getGreeting("Bob"));
	}
	
	@Test
	public void test2() 
	{
		assertEquals("Hello a", Exam.getGreeting("a"));
	}

}
