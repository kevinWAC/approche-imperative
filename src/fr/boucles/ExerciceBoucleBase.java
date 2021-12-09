package fr.boucles;

public class ExerciceBoucleBase {

	public static void main(String[] args) {
		int i;
		for (i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		for (i = 0; i <= 19; i++) {
			System.out.println("ulreich Kévin");
		}
		for  (i = 1; i <= 100; i++ ) {
			if(i % 2 == 0) {
				System.out.println(i);				
			}
		}
		for  (i = 1; i <= 100; i++ ) {
			if(i % 2 == 1) {
				System.out.println(i);				
			}
		}
	}
}
