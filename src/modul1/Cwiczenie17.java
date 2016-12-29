package modul1;

import java.util.Scanner;

public class Cwiczenie17 {

	public static void main(String[] args) {
		// Plan podrozy
		
		// podaj dlugosc podrozy
		// srednie zuzycie paliwa
		// cena paliwa
		// pojemnosc baku
		
		// jaki bedzie calkowity koszt podrozy zakladajac kazdorazowe tankowanie do pelna? 
		
		Scanner klawiatura = new Scanner(System.in);
		
		System.out.println("podaj odleglosc  [km]: ");
		double odleglosc = klawiatura.nextDouble();
		
 		System.out.println("podaj pojemnosc baku  [l]: ");
		double pojemnoscBaku = klawiatura.nextDouble();
		
		System.out.println("podaj srednie zuzycie paliwa na 100km: ");
		double spalanie = klawiatura.nextDouble();
		
		System.out.println("podaj cene za 1L paliwa [PLN]:");
		double cenapaliwa = klawiatura.nextDouble();		
		
		// obliczenie minimalnego kosztu przejazdu
		//  ((spalanie * odleglosc) / 100 = ile litrow) * cenapaliwa
		
		double ileBakow = Math.ceil(((spalanie * odleglosc) / 100) / pojemnoscBaku);
		
		//System.out.println("Podczas podrozy trzeba zatankowac " + ileBakow + " bakow");
		
		double koszt = ileBakow * pojemnoscBaku * cenapaliwa;
		
		 
		System.out.println("Koszt przejazdu to [PLN]: "); System.out.printf("%.2f",koszt); 
		
		klawiatura.close();

	}

}
