package modul1;

import java.util.Scanner;

public class Cwiczenie15 {

	public static void main(String[] args) {
		// Ekonimiczny kierowca
		
		Scanner klawiatura = new Scanner(System.in);
		System.out.println("podaj odleglosc  [km]: ");
		double odleglosc = klawiatura.nextDouble();
		System.out.println("podaj srednie zuzycie paliwa na 100km: ");
		double spalanie = klawiatura.nextDouble();
		System.out.println("podaj cene za 1L paliwa [PLN]:");
		double cenapaliwa = klawiatura.nextDouble();		
		
		// obliczenie minimalnego kosztu przejazdu
		//  ((spalanie * odleglosc) / 100 = ile litrow) * cenapaliwa
		
		
		double koszt = ((spalanie * odleglosc) / 100 ) * cenapaliwa;
		
		 
		System.out.println("Koszt przejazdu to [PLN]: "); System.out.printf("%.2f",koszt); 
		
		klawiatura.close();

	}

}
