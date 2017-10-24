package org.institutoserpis.ed;

public class Vector {

	public static void main(String[] args) {
		
		int [] v = new int[] {9, 15, 7, 12, 6};
				
		for (int index = 0; index < 5; index++)
			System.out.printf("v[%s]=%s ", index, v[index]);
		
		int value = 33;
		int index = 0;
		Vector.indexOff(v, value);
		while (value != v[index]) {
			index ++;	
		}
		
		System.out.println(index);
		
		
				

	}
	
	
	public static int indexOff(int[] v, int value) {
		if (value > 15);
		return -1;
	}

}
