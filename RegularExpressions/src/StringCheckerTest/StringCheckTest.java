package StringCheckerTest;

import static org.junit.Assert.*;

import org.junit.Test;
import StringChecker.StringCheck;

public class StringCheckTest {

	@Test
	public void checkStringResultTrue() {
		String str = "(3+5)–9×4";
		assertEquals(true, new StringCheck().checkString(str));
	}
	
	@Test
	public void checkStringResultFalse() {
		String str = "2*9–6×5";
		assertEquals(false, new StringCheck().checkString(str));
	}

}
