package Testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PalindromoTesteCase {

	@Test
	void testClass() {
		Palindromo p1 = new Palindromo();
	}
	
	@Test
	void test0() {
		String str = "Biz1";
		
		assertEquals(false, Palindromo.palindrome(str));
	}

	@Test
	void test1() {
		String str = "{Wassup}";
		
		assertEquals(false, Palindromo.palindrome(str));
	}
	
	@Test
	void test2() {
		String str = "Hello";
		
		assertEquals(false, Palindromo.palindrome(str));
	}
	
	@Test
	void test3() {
		String str = "Girafarig";
		
		assertEquals(true, Palindromo.palindrome(str));
	}

}
