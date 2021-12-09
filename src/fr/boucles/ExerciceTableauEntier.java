package fr.boucles;

public class ExerciceTableauEntier {

	public static void main(String[] args) {
		int[] notes = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		System.out.print(notes[0]+"\n");
		System.out.print(notes.length+"\n");
		System.out.print(notes[notes.length-1]+"\n");	
		notes[4] = 8;
	}
}
