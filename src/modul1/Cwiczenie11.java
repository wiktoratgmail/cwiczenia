package modul1;
// Cwiczenie 1.1 "Kto ty jestes"

import java.util.Scanner;

public class Cwiczenie11 {

	public static void main(String[] args) {

		Scanner klawiatura = new Scanner(System.in);
		System.out.println("podaj imie:");
		String imie = klawiatura.nextLine();

		System.out.println("Witaj " + imie);
		klawiatura.close();
	}
}
