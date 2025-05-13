package findElementInArray;
import java.util.Random;
import java.util.Scanner;

public class SearchInArray {
	public static int[] array = new int[8];
	
	public static int[] fillArray(){
		Random rand = new Random();
		boolean zeroIncluded = false;
		 for (int i = 0; i < array.length; i++) {
		        int intNumber = rand.nextInt(13) - 6;
		        array[i] = intNumber;
		        if (intNumber == 0) zeroIncluded = true;
		}
		
		if (!zeroIncluded){
			int randomIndex = rand.nextInt(array.length);
			array[randomIndex] = 0;
		}
	
		 for (int szam : array) {
	            System.out.print(szam + " ");
	     }
		 return array;
	}
	
	
	public static void Search(){
		int[] array = fillArray();
		
		System.out.println("Melyik számot keresi a tömbben?");
		Scanner sc = new Scanner(System.in);
		System.out.print("Adj meg a keresett számot: ");
		int searchNumber = sc.nextInt(); // Ez tud mínuszt is kezelni
		System.out.println("beolvasott szám: " + searchNumber);
		boolean found = false;
		for (int i = 0; i < array.length; i++) {
		    if (array[i] == searchNumber) {
		        System.out.println("A keresett szám: " + searchNumber + " a " + (i+1) + ". indexű helyen található meg.");
		        found = true;
		        break; // ha csak az első találat érdekel
		    }
		}
		 if (!found) {
	            System.out.println("A keresett szám: " + searchNumber + " nem található meg a tömbben.");
	        }	 
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	    System.out.println("Írd be, hogy 'exit' a kilépéshez. ENTER-t nyomj a megerősítéshez.\n");
	    String input;
		do {
			Search();
			scanner = new Scanner(System.in);
			
			System.out.print("Folytatod? (nyomj ENTER-t a folytatáshoz vagy írd be: 'exit'): ");
			input = scanner.nextLine();
	        
		}while(!input.equalsIgnoreCase("exit"));
		
		scanner.close();
		System.out.println("-----\nKöszönöm hogy tesztelted a működésem :)");
	}
}
