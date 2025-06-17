package mdt_13;

import java.util.stream.IntStream;

public class PrimeSeeker {

	private static boolean isPrime(int n) {
	    if (n < 2) return false;
	    for (int i = 2; i <= Math.sqrt(n); i++) {
	        if (n % i == 0) return false;
	    }
	    return true;
	}
	
	
	private static int nextPrime(int n) {
	    int candidate = n + 1;
	    while (!isPrime(candidate)) {
	        candidate++;
	    }
	    return candidate;
	}
	
	
	public static void main(String[] arg) {
	
		int lastPrime = IntStream.iterate(2, PrimeSeeker::nextPrime)
			    .limit(10001)
			    .reduce(0, (a, b) -> b);
		System.out.println(lastPrime);
			
	}
}
