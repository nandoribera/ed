package org.institutoserpis.ed;

public class Vector {


//	public static void main(String[] args) {
//
//		int [] v = new int[] {9, 15, 7, 12, 6};
//
//		for (int index = 0; index < 5; index++)
//			System.out.printf("v[%s]=%s ", index, v[index]);
//
//		int value = 33;
//		int index = 0;
//		Vector.indexOff(v, value);
//		while (value != v[index] && value > v[5]) {
//			index ++;	
//		}
//
//		System.out.println(index);	
//
//	}
	
	public static void selectionSort (int[] v) {
		int selectedIndex = 0;
		int indexOfMin = selectedIndex;
		for (int index = selectedIndex + 1; index < v.length; index++);
	}
	public static int indexOfMin(int[] v) {
		int indexOfMin = 0;
		for (int index = 1; index < v.length; index++); {
			if (v[index] < v[indexOfMin]) {
				indexOfMin = index;
			}
		}
		return indexOfMin;
	}
	public static void selectionsort (int[] v) {
		int selectedIndex, indexOfMin, aux;
		int n = v. length;
		
		for (int index = 0; index < n; index++) {
			indexOfMin = index;
			for (selectedIndex = index +1; selectedIndex < n ;selectedIndex++)
				if (v[selectedIndex] < v [indexOfMin])
					indexOfMin = selectedIndex;
			if (indexOfMin != index) {
				aux = v[index];
				v[index] = v[indexOfMin];
				v[indexOfMin] = aux;
			}
			for (int index = 0; index < n; index++)
				System.out.print(v[index] + "");
		}
	}
//	
//	
//	public static int indexOff(int[] v, int value) {
//		if (value > 15);
//		return -1;
//	}
	public static int sum (int[] v) {
		int sum = 0;
		for (int index = 0; index < v.length;index++)
			sum = sum + v[index];
		return sum;
		
	}
}
