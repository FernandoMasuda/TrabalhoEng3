package Testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import java.util.*;
class EquacaoTesteCase {

	@Test
	void testClass() {
		Equacao3Grau e1 = new Equacao3Grau();
	}

	@Test
	void test0() {
		int a = 0, b = 2, c = 6;		
		assertThrows(IllegalArgumentException.class, ()->Equacao3Grau.getRoots(a, b, c));
	}
	
	@Test
	void test1() {
		int a = 1, b = 4, c = 3;
		double [] expected = {-1, -3};
		
		assertEquals(Arrays.toString(expected), Arrays.toString(Equacao3Grau.getRoots(a, b, c)));
	}
	
	@Test
	void test2() {
		int a = 2, b = 4, c = 2;
		double [] expected = {-1};
		
		assertEquals(Arrays.toString(expected), Arrays.toString(Equacao3Grau.getRoots(a, b, c)));
	}
	
	@Test
	void test3() {
		int a = 3, b = 1, c = 2;
		double [] expected = {};
		
		assertEquals(Arrays.toString(expected), Arrays.toString(Equacao3Grau.getRoots(a, b, c)));
	}
}