package modul3;

import java.util.Scanner;

public class Cwiczenie34 {

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

			long wynik = trzeciaPotega(liczba);

			System.out.println("Podales " + liczba);
			System.out.println("Potega " + wynik);
			 
		}  
	}

}
