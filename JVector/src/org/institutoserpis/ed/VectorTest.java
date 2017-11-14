package org.institutoserpis.ed;

import static org.junit.Assert.*;

import org.junit.Test;

public class VectorTest {

//		Selección Directa	
		@Test
		public void selectionSort() {
			int[] v = new int[] {9,15,7,12,6};
			Vector.selectionSort(v);
			assertArrayEquals(new int[] {6,7,9,12,15}, v);
		}
		public static void selectionSort (int[] v) {
			int selectedIndex = 0;
			int indexOfMin = selectedIndex;
			for (int index = selectedIndex + 1; index < v.length; index++);
		}
		
//		Suma Array	
		@Test
		public void sum() {
			int sum = 0;
			assertEquals(49, Vector.sum(new int[] {9,15,7,12,6}));
		}
		@Test
		public void indexOfMin() {
			assertEquals(4, Vector.indexOfMin(new int[] {9,15,7,12,6}));
		}

}
