package Exercise2;

import static org.junit.Assert.assertSame;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringCalculatorTest {

	@Test
	void first_test_working() {
		StringCalculator calculate = new StringCalculator();
		
		String firstTestActual1 = calculate.add("");
		String firstTestActual2 = calculate.add("1");
		String firstTestActual3 = calculate.add("1,2");

		String firstTestExpected1 = "0";
		String firstTestExpected2 = "1";
		String firstTestExpected3 = "3";
		
		assertEquals(firstTestActual1, firstTestExpected1);
		assertEquals(firstTestActual2, firstTestExpected2);
		assertEquals(firstTestActual3,  firstTestExpected3);

		
	}
	
	@Test
	void second_test_unknow_amount_number() {
		StringCalculator calculate = new StringCalculator();
		
		String firstTestActual1 = calculate.add("1,5,15,155,1551,51");
		String firstTestActual2 = calculate.add("1,2665,58965,845568,77777777");
		String firstTestActual3 = calculate.add("1,2");

		String firstTestExpected1 = "1778";
		String firstTestExpected2 = "78684976";
		String firstTestExpected3 = "3";
		
		
		assertEquals(firstTestActual1, firstTestExpected1);
		assertEquals(firstTestActual2, firstTestExpected2);
		assertEquals(firstTestActual3,  firstTestExpected3);
		
	}
	
	
	@Test
	void third_test_allow_new_lines_between_numbers() {
		
		StringCalculator calculate = new StringCalculator();
		
		String firstTestActual1 = calculate.add("15\n15155\n1551\n51");
		String firstTestActual2 = calculate.add("1\n2665\n58965\n845568\n77777777");
		String firstTestActual3 = calculate.add("1,2");

		String firstTestExpected1 = "16772";
		String firstTestExpected2 = "78684976";
		String firstTestExpected3 = "3";
		
		assertEquals(firstTestActual1, firstTestExpected1);
		assertEquals(firstTestActual2, firstTestExpected2);
		assertEquals(firstTestActual3,  firstTestExpected3);
	}
	
	
	@Test
	void fourth_test_allow_new_lines() {
		StringCalculator calculate = new StringCalculator();
		
		String firstTestActual1 = calculate.add("1\n2,3");
		String firstTestExpected3 = "6";
		
	}
	
	
	@Test
	void fifth_insert_new_delimeters() {
		StringCalculator calculate = new StringCalculator();

		String firstTestActual1 = calculate.add("1\n2665,58965!845568:77777777");
		String firstTestActual2 = calculate.add("1 2665+58965.845568/77777777");
		String firstTestActual3 = calculate.add("1\n2665,58965!845568:77777777");
		
		
		String firstTestExpected1 = "78684976";
		String firstTestExpected2 = "78684976";
		String firstTestExpected3 = "78684976";

		assertEquals(firstTestActual1, firstTestExpected1);
		assertEquals(firstTestActual2, firstTestExpected2);
		assertEquals(firstTestActual3,  firstTestExpected3);
		
	}
	
	
	@Test
	void sixth_test_different_different_delimeter() {
		StringCalculator calculate = new StringCalculator();
		
		String firstTestActual1 = calculate.add("1\n2665,58965!845568:77777777");
		String firstTestActual2 = calculate.add("1");
		String firstTestActual3 = calculate.add("1,2");

		String firstTestExpected1 =  "78684976";
		String firstTestExpected2 = "1";
		String firstTestExpected3 = "3";
		
	}
	
	@Test
	void seventh_test_different_change_delimeter() {
		StringCalculator calculate = new StringCalculator();
		
		String firstTestActual1 = calculate.add(";\n1,5,15,155,1551,51");
		String firstTestActual2 = calculate.add(";\n1");
		String firstTestActual3 = calculate.add(";\n1,2");

		String firstTestExpected1 = "78684976;";
		String firstTestExpected2 = "1;";
		String firstTestExpected3 = "3;";
		
	}

}
