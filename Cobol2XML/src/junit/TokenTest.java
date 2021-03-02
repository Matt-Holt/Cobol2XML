package junit;

import static org.junit.Assert.*;
import parse.tokens.*;

import org.junit.Test;

public class TokenTest {

	@Test
	public void test() {
		char c = 'a';
		Token t = new Token(c);
		assertFalse(t.isNumber());
		assertFalse(t.isWord());
		assertTrue(t.isSymbol());

		String word = "Word";
		t = new Token(word);
		assertFalse(t.isNumber());
		assertTrue(t.isWord());
		assertFalse(t.isSymbol());

		int num = 5;
		t = new Token(num);
		assertTrue(t.isNumber());
		assertFalse(t.isWord());
		assertFalse(t.isSymbol());
		
		double decimal = 5.2;
		t = new Token(decimal);
		assertTrue(t.isNumber());
		assertFalse(t.isWord());
		assertFalse(t.isSymbol());
	}

}
