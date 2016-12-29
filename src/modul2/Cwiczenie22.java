package modul2;

public class Cwiczenie22 {

	public static void main(String[] args) {
		/*
		 * dwie zagniezdzone petle wyswietlaja wszystkie czterocyfrowe liczby
		 * palindroniczne czyli takie, ktore czytane wprzod i wspak daja te sama
		 * liczbe
		 */

		for (int i = 10; i <= 99; i++) {

			// wstaw liczbe i do stringa i pobierz jego dlugosc

			String temp = Integer.toString(i);

			int[] numArr = new int[2];

			for (int j = 0; j < 2; j++) {
				numArr[j] = temp.charAt(j) - '0'; // doodaj do tablicy pierwszy
													// lub drugi znak stringa
			}

			System.out.print(i);         //wyswietl liczbe
			//wyswietl "lustrzane odbicie" liczby
			System.out.print(numArr[1]); //wyswietl drugi znak z tablicy
			System.out.print(numArr[0]); //wyswietl pierwszy znak z tablicy
			System.out.println();

		}

	}

}
