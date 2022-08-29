package Testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
class BubbleSortTesteCase {

	@Test
	void testClass() {
		BubbleSort s1 = new BubbleSort();
	}
	
	@Test
	void test() {
		int [] value = {4, 3, 12, 8, 9, 15, 18};
		BubbleSort.sort(value);
	}

}
