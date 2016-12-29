package modul2;

import java.util.Scanner;

public class Cwiczenie26 {
	public static void main(String[] args) {
		// Miesiace

		int liczbaDniArr[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		int nrMiesiaca = 1;

		int dzienMiesiaca = 1;

		Scanner klawiatura = new Scanner(System.in);
		do {

			System.out.println("Podaj nr miesiaca: ");
			nrMiesiaca = klawiatura.nextInt();
			
			if ((nrMiesiaca < 1)||(nrMiesiaca > 12))
			{
				System.out.print("KONIEC");	
			break;
			}
			
			System.out.println("Podaj dzien miesiaca: ");
			dzienMiesiaca = klawiatura.nextInt();
			
			if ((dzienMiesiaca < 1)||(dzienMiesiaca > 31))
			{
				System.out.print("KONIEC");	
			break;
			}
		
			
			int dzienRoku = 0;

			for (int i = 0; i < nrMiesiaca; i++) {

				dzienRoku = dzienRoku + liczbaDniArr[i];
			}

			dzienRoku = dzienRoku + dzienMiesiaca  - liczbaDniArr[nrMiesiaca-1];

			System.out.print(dzienRoku);

			System.out.println();
			// powtarzaj petle dopoki uzytkownik nie wprowadzi liczby mniejszej
			// od 1, np. 0
		} while ((nrMiesiaca > 0) && (nrMiesiaca < 13));

		klawiatura.close();

	}

}
