package findElementInArray;
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class SearchInArray {
    public static final int[] array = new int[8];
    public static final int MIN = -6;
    public static final int MAX = 6;
    static Scanner scanner = new Scanner(System.in);

    public static int[] fillArray() {
        Random rand = new Random();
        boolean zeroIncluded = false;

        for (int i = 0; i < array.length; i++) {
            int intNumber = rand.nextInt(MAX - MIN + 1) + MIN;
            array[i] = intNumber;
            if (intNumber == 0) zeroIncluded = true;
        }

        if (!zeroIncluded) {
            int randomIndex = rand.nextInt(array.length);
            array[randomIndex] = 0;
        }

        System.out.println("Generált tömb: " + Arrays.toString(array));
        return array;
    }

    public static void Search() {
        fillArray();
        System.out.print("Melyik számot keresed a tömbben? ");
        int searchNumber = scanner.nextInt();

        for (int i = 0; i < array.length; i++) {
            if (array[i] == searchNumber) {
                System.out.println("A keresett szám: " + searchNumber + " a(z) " + i + ". indexű helyen található meg.");
                return;
            }
        }

        System.out.println("A szám nem található a tömbben.");
    }

    public static void main(String[] args) {
        System.out.println("Írd be, hogy 'exit' a kilépéshez. ENTER-t nyomj a megerősítéshez.\n");
        String input;

        do {
            Search();
            scanner.nextLine(); // a nextInt() utáni ENTER miatt kell
            System.out.print("Folytatod? (nyomj ENTER-t a folytatáshoz vagy írd be: 'exit'): ");
            input = scanner.nextLine();
        } while (!input.equalsIgnoreCase("exit"));

        scanner.close();
        System.out.println("-----\nKöszönöm, hogy tesztelted a működésem :)");
    }
}

