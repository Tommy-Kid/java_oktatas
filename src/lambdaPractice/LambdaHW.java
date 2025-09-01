package lambdaPractice;

import java.util.function.*;
import java.util.stream.Collectors;
import java.util.Random;
import java.util.Set;


public class LambdaHW {

	public static Function<String, String> toCamelCase = input -> {
		 String[] words = input.trim().toLowerCase().split("\\s+");
		    StringBuilder builder = new StringBuilder();

		    for (int i = 0; i < words.length; i++) {
		        String word = words[i];
		        if (word.isEmpty()) continue;

		        if (i == 0) {
		            builder.append(word); 
		        } else {
		            builder.append(Character.toUpperCase(word.charAt(0)))
		                   .append(word.substring(1));
		        }
		    }
		    return builder.toString();
		};
		
	public static	Function<String, String> toUpperCase = String::toUpperCase;
	
	public static	Function<Integer, String> toGenerateStringByLength = length ->{
		StringBuilder builder = new StringBuilder();
		Random random = new Random();
		for(int i=0; i < length; i++) {
			int randomNumber = random.nextInt(122 - 97 + 1) + 97;
			builder.append(Character.toString((char)randomNumber));
		}
		return builder.toString();
	};
	
	public static	Function<String, Integer> toCountSpaces = inputText ->
		(int) inputText.chars()
		.filter(c -> c==' ')
		.count();
		
	public static Function<String, String> toOrderByAlphabet = inputText ->
		inputText.toLowerCase()
		.chars()
		.sorted()
		.collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
		.toString();
	
	public static Consumer<Integer> toPrintAllNumberLTParam = lessThan -> {
		for (int i = 1; i < lessThan; i++) {
		    System.out.print(i + " ");
		}
		System.out.println();
	};
	
	public static Function<Integer, Boolean> toCheckIsPrime = number -> {
	    if (number <= 1) return false;
	    if (number == 2) return true;
	    if (number % 2 == 0) return false;
	    for (int i = 3; i <= Math.sqrt(number); i += 2) {
	        if (number % i == 0) return false;
	    }
	    return true;
	};
	
	public static BiFunction<Set<Character>, Set<Character>, Set<String>> toCartesianProduct =
	        (set1, set2) -> Set.of("THIS METHOD IS NOT IMPLEMENTED YET");
	        
	public static Function<String, Set<String>> toPermutations =
	        s -> Set.of("THIS METHOD IS NOT IMPLEMENTED YET");        
	
	public static void main(String[] args) {
		String example = "Nehéz ez a Lambdas házifeladat!";
		int intExample = 7;
		System.out.println(toCamelCase.apply(example));
		System.out.println(toUpperCase.apply(example));
		System.out.println(toGenerateStringByLength.apply(intExample));
		System.out.println(toCountSpaces.apply(example));
		System.out.println(toOrderByAlphabet.apply(example));
		toPrintAllNumberLTParam.accept(intExample);
		System.out.println(toCheckIsPrime.apply(intExample));
		System.out.println(toCartesianProduct.apply(Set.of('a','b'),Set.of('x','y')));
		System.out.println(toPermutations.apply(example));
		
		 
	}
}
