package tests;

import static org.junit.Assert.*;
import org.junit.Test;

import Calculator.Calc;

public class CalcTest {

	@Test
	public void Sum13and25res38() {
		int a = 13;
		int b = 25;
		int expect = 38;
		
		assertEquals(expect, new Calc().Sum(a, b));
	}
	
	
	
	@Test
	public void Min25and13res12() {
		int a = 25;
		int b = 13;
		int expect = 12;
		
		assertEquals(expect, new Calc().Min(a, b));
	}

}
