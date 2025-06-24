package findElementInArray;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SearchInArray {
	public static int[] array = new int[8];
	public static final int MIN = -6;
    public static final int MAX = 6;
    static Scanner scanner = new Scanner(System.in);
	
	public static int[] fillArray(){
		Random rand = new Random();
		 for (int i = 0; i < array.length; i++) {
		        int intNumber = rand.nextInt(MAX - MIN + 1) + MIN;
		        array[i] = intNumber;
		}
			
		int randomIndex = rand.nextInt(array.length);
		array[randomIndex] = 0;

		System.out.println(Arrays.toString(array));
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
		
	    System.out.println("Írd be, hogy 'exit' a kilépéshez. ENTER-t nyomj a megerősítéshez.\n");
	    String input;
		try {
			do {
				Search();
				scanner = new Scanner(System.in);	
				System.out.print("Folytatod? (nyomj ENTER-t a folytatáshoz vagy írd be: 'exit'): ");
				input = scanner.nextLine();    
			}while(!input.equalsIgnoreCase("exit"));
				
		} catch (Exception e) {
			System.out.println("Hiba történt a fájl beolvasásakor. "+ e.getMessage());
		}
		finally{
			scanner.close();
		}
	   
		System.out.println("-----\nKöszönöm hogy tesztelted a működésem :)");
	}
}
