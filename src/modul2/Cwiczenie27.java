package modul2;

import java.util.Random;

public class Cwiczenie27 {

	// losowanie liczb z zadanego przedzialu
	public static int randInt(int min, int max) {

		// Usually this can be a field rather than a method variable
		Random rand = new Random();

		// nextInt is normally exclusive of the top value,
		// so add 1 to make it inclusive
		int randomNum = rand.nextInt((max - min) + 1) + min;

		return randomNum;
	}

	// wyswietlenie tablicy
	public static void pokazTablice(int[][] Tablica) {
		// numery kolumn
		for (int j = 0; j < 6; j++) {
			if (j == 0) {
				System.out.print("X" + " \t");
			} else
				System.out.print((j) + ". \t");
		}
		// wiersze
		System.out.println();
		for (int i = 0; i < 4; i++) {

			// numery wierszy
			System.out.print((i + 1) + ". ");
			// kolumny
			for (int j = 0; j < 5; j++) {
				System.out.print("\t" + Tablica[i][j]);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// Macierz temperatur

		// losowanie liczb z przedzialu -20, 20 i zapis do tablicy 4x5
		// wyswietlic tablice w postaci macierzowej
		// powiekszenie zawartosci tablicy o nr wiersza i nr kolumny

		int Tablica1[][] = new int[4][5];

		// wypelnienie tablicy
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 5; j++) {
				Tablica1[i][j] = randInt(-20, 20);
			}
		}

		pokazTablice(Tablica1);

		// wypelnienie tablicy
		int Tablica2[][] = new int[4][5];

		for (int i = 0; i < 4; i++) {

			for (int j = 0; j < 5; j++) {

				// powiekszenie o nr wiersza i kolumny
				Tablica2[i][j] = Tablica1[i][j] + i + 1 + j + 1;
			}
		}

		System.out.println("Tablica z wartosciami powiekszonymi o nr wiersza i kolumny");

		pokazTablice(Tablica2);

	}

}
