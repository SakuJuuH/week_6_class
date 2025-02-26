import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {

	@Test
	void add() {
		assertEquals(2, Calculator.add(1, 1));
	}

	@Test
	void sub() {
		assertEquals(10, Calculator.sub(20, 10));
	}

	@Test
	void multiply() {
		assertEquals(100, Calculator.multiply(10, 10));
	}

	@Test
	void divide() {
		assertEquals(10, Calculator.divide(100, 10));
	}
}