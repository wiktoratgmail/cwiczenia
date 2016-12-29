package modul1;
import java.util.Scanner;


public class Cwiczenie13 {

	public static void main(String[] args) {
		// Inteligentny powielacz - wyswieltenie zrodla programu HelloWorld
		
		Scanner klawiatura = new Scanner(System.in);
		System.out.println("podaj nazwe klasy:");
		String NazwaKlasy = klawiatura.nextLine();
		
		System.out.println("podaj tekst do wyswietlenia:");
		String TekstWyswietlany = klawiatura.nextLine();

		 
		klawiatura.close();
		
		
		String program = 
			"\t // Powitanie.java	\n"
		  + "\t public class" + " "  +NazwaKlasy + "{ \n"
		  + "\t\t public static void main(String[] args){ \n"
		  + "\t\t System.out.println(\"" + TekstWyswietlany  +"\"); \n"
		  + "\t\t } \n" 
		  + "\t };";
 
		 System.out.println(program);		 
	}
}
