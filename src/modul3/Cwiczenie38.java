package modul3;

import java.util.Scanner;

public class Cwiczenie38 {

	static Scanner klawiatura = new Scanner(System.in);
	
	public static String wczytaj()
	{
		String tekst = klawiatura.next(); 
		return tekst;	 
	} 
	
	public static void main(String[] args) {
	// Przeglad mozliwosci klasy STRING 
	
	System.out.println("wpisz tekst");	

    String napis = wczytaj(); 
	
    String tLC = napis.toLowerCase();
    
    String tUC = napis.toUpperCase();
    
    char cAt = napis.charAt(0); //znak na pozycji
    
    int len = napis.length(); // dlugosc napisu
    
    String sub = napis.substring(0); // substring 
    
    int iof = napis.indexOf(0); // 
    

	
	System.out.println(
			"dlugosc napisu "+ len  + " \n "
	//		+ "lowecase" + tLc + " \n "
			+ "uppercase" + tUC + " \n "
			+ "od konca do poczatku \n"
			+ "fragment rozpoczynajacy sie losowym znakiem i konczacy ostatnim znakiem napisu \n"
			+ "");	

	
	System.out.println("Podaj drugi napis dla porownania z pierwszym");
			
	wczytaj();
	
	klawiatura.close(); 
	
	}

}
