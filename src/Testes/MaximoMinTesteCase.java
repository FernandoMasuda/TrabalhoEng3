package Testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
class MaximoMinTesteCase {

	@Test
	void testClass() {
		MaximoMin mm1 = new MaximoMin();
	}

	@Test
	void test0() {
		int [] val = {};
		
		assertThrows(IllegalArgumentException.class, ()->MaximoMin.maxmin(val));
	}
	
	@Test
	void test1() {
		int [] val = {1, 3, 6, 5, -2};
		int [] expected = {6, -2};
		
		assertEquals(Arrays.toString(expected), Arrays.toString(MaximoMin.maxmin(val)));
	}

}
