package modul3;

import java.util.Scanner;

// przerywanie petli nieskonczonej
public class Cwiczenie35 {

	public static long trzeciaPotega(int liczba) {
		long tp = liczba * liczba * liczba;
		return tp;
	}

	public static void main(String[] args) {
		// Nieskonczony szescian

		Scanner klawiatura = new Scanner(System.in);

		int liczba = 1;
		while (true) {
			System.out.println("Podaj liczbe: ");

			liczba = klawiatura.nextInt();

			if (liczba == 0) {
				System.out.println("Koniec");
				break;
			} else {

				long wynik = trzeciaPotega(liczba);

				System.out.println("Podales " + liczba);
				System.out.println("Potega " + wynik);
				
				
			}
		} klawiatura.close();
	}

}
