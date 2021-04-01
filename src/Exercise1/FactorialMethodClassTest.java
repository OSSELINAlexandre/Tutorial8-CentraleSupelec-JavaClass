package Exercise1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FactorialMethodClassTest {

	@Test
	void testifWorlking() {
		
		FactorialMethodClass t1 = new FactorialMethodClass();
		FactorialMethodClass t2 = new FactorialMethodClass();
		FactorialMethodClass t3 = new FactorialMethodClass();
		FactorialMethodClass t4 = new FactorialMethodClass();
		FactorialMethodClass t5 = new FactorialMethodClass();
		
		int actual1 = t1.Fact(5);
		int actual2 = t2.Fact(6);
		int actual3 = t3.Fact(7);
		int actual4 = t4.Fact(8);
		int actual5 = t5.Fact(9);
		
		int expected1 = 120;
		int expected2 = 720;
		int expected3 = 5040;
		int expected4 = 40320;
		int expected5 = 362880;

		assertEquals(actual1 , expected1);
		assertEquals(actual2 , expected2);
		assertEquals(actual3 , expected3);
		assertEquals(actual4 , expected4);
		assertEquals(actual5 , expected5);
		
	}
	
	@Test
	void testifWorlkingSecondConstructor() {
		
		FactorialMethodClass t1 = new FactorialMethodClass(5);
		FactorialMethodClass t2 = new FactorialMethodClass(6);
		FactorialMethodClass t3 = new FactorialMethodClass(7);
		FactorialMethodClass t4 = new FactorialMethodClass(8);
		FactorialMethodClass t5 = new FactorialMethodClass(9);
		
		int actual1 = t1.Fact();
		int actual2 = t2.Fact();
		int actual3 = t3.Fact();
		int actual4 = t4.Fact();
		int actual5 = t5.Fact();
		
		int expected1 = 120;
		int expected2 = 720;
		int expected3 = 5040;
		int expected4 = 40320;
		int expected5 = 362880;

		assertEquals(actual1 , expected1);
		assertEquals(actual2 , expected2);
		assertEquals(actual3 , expected3);
		assertEquals(actual4 , expected4);
		assertEquals(actual5 , expected5);
		
	}


}
