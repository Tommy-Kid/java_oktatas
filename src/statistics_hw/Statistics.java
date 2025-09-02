package statistics_hw;
import java.util.Scanner;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Arrays;

public class Statistics {
	 public static final int REQUEST_NUMBERS = 10;
	 
	 public static void main(String[] args) {
	        int[] array = fillArray();
	        System.out.println("A legkisebb elem a tömbben: " + findMinimum(array));
	        System.out.println("A legnagyobb elem a tömbben: " + findMaximum(array));
	        System.out.println("Az átlaga a  tömbnek: " + avg(array));
	        List<Integer> modes = findMode(array);
	        if (modes.size() == 1) {
	            System.out.println("Az elemek módusza: " + modes.get(0));
	        } else {
	            System.out.println("Nincs egyértelmű módusz, több érték is előfordul: " + modes);
	        }
	        System.out.println("A tömb mediánja: " + findMedian(array));
	        
	    }

	    private static int[] fillArray() {
	        System.out.println("10 db számot fogok tőled bekérni");
	        int[] array = new int[REQUEST_NUMBERS];
	        Scanner s = new Scanner(System.in);

	        for (int i = 0; i < REQUEST_NUMBERS; i++) {
	            System.out.print("Kérem a(z) " + (i + 1) + ". számot: ");
	            array[i] = s.nextInt();
	        }
	        s.close();
	        return array;
	    }

	    private static int findMinimum(int[] array) {
	        int min = array[0];
	        for (int i = 1; i < array.length; i++) {
	            min = (array[i] < min) ? array[i] : min;
	        }
	        return min;
	    }
	    
	    private static int findMaximum(int[] array) {
	        int max = array[0];
	        for (int i = 1; i < array.length; i++) {
	            max = (array[i] > max) ? array[i] : max;
	        }
	        return max;
	    }
	    
	    private static int sum(int[] array) {
	        int sum = 0;
	        for (int i = 0; i < array.length; i++) {
	           sum+=array[i];
	        }
	        System.out.println("Az elemek összege: " + sum);
	        return sum;
	    }
	    
	    private static double avg(int[] numbers) {
	        int total = 0;
	        for (int n : numbers) {
	            total += n;
	        }
	        return (double) total / numbers.length;
	    }
	    
	    public static List<Integer> findMode(int[] array) {
	        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

	        for (int num : array) {
	            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
	        }

	        int maxCount = 0;
	        for (int count : frequencyMap.values()) {
	            if (count > maxCount) {
	                maxCount = count;
	            }
	        }

	        List<Integer> modes = new ArrayList<>();
	        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
	            if (entry.getValue() == maxCount) {
	                modes.add(entry.getKey());
	            }
	        }

	        return modes;
	    }
	    
	     private static double  findMedian(int[] array) {
	       Arrays.sort(array);
	       int n = array.length;
	       if ((n & 1) == 1) {
	           return array[n / 2];
	       } else {
	           int mid1 = n / 2;
	           int mid2 = mid1 - 1;
	           return (array[mid2] + (long) array[mid1]) / 2.0;
	       }
	    }
	    

}
