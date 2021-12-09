package fr.boucles;

public class ExerciceBouclesEtTests {

	public static void main(String[] args) {
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		int i;
		for(i = 0; i <= array.length - 1; i++) {
			System.out.println(array[i]);
		}
		for(i = array.length -1; i >= 0; i--) {
			System.out.println(array[i]);
		}
		for(i = 0; i <= array.length - 1; i++) {
			if ((int)array[i] > 3) {
			System.out.println(array[i]);
			}
		}
		for(i = 0; i <= array.length - 1; i++) {
			if((int)array[i] % 2 == 0) {
				System.out.println(array[i]);				
			}
		}
		for(i = 0; i <= array.length - 1; i++) {
			if((int)array[i] % 2 == 0) {
				System.out.println(array[i]);				
			}
		}
		for(i = 0; i <= array.length - 1; i++) {
			if(i % 2 == 0) {
				System.out.println(array[i]);				
			}
		}
		for(i = 0; i <= array.length - 1; i++) {
			if(((int)array[i] % 2 == 1 || (int)array[i] % 2 < 0  )) {
				System.out.println(array[i]);				
			}
		}
	}
}
