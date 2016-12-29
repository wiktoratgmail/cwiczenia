package modul2;

import java.util.Scanner;

public class Cwiczenie23 {

	public static void main(String[] args) {
		// Stempelki

		int liczba = 1;

		Scanner klawiatura = new Scanner(System.in);
		do {

			System.out.println("Podaj liczbe: ");

			liczba = klawiatura.nextInt();

			// petla do stepelkow
			for (int i = 0; i < liczba; i++) {
				System.out.print('#');
			}

			System.out.println();
			// powtarzaj petle dopoki uzytkownik nie wprowadzi liczby mniejszej od 1, np. 0
		} while (liczba > 1);

		klawiatura.close();

	}

}
