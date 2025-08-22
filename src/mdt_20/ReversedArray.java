package mdt_20;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ReversedArray {

	public static void main(String[]arg) {
		int[] array1 = IntStream.range(0, 40)
			    .map(i -> switch (i / 10) {
			        case 0 -> 20 + i;
			        case 1 -> 130 + (i - 10) * 2;
			        case 2 -> 1550 - (i - 20) * 10;
			        case 3 -> -1000000 * (int)Math.pow(2, i - 30);
			        default -> 0;
			    }).toArray();
			
		System.out.println("3.a feladat: ");
		Arrays.stream(array1).forEach(System.out::println);
		System.out.println("\n3.b feladat: ");
		IntStream.iterate(array1.length - 1, i -> i - 1)
	    .limit(array1.length)
	    .forEach(i -> System.out.print(array1[i] + ", "));
	}	
}
