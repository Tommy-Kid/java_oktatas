package statistics_hw;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

public class statistics {
	 public static final int REQUEST_NUMBERS = 10;
	 
	 public static void main(String[] args) {
	        int[] array = fillArray();
	        findMinimum(array);
	        findMaximum(array);
	        int total=sum(array);
	        avg(total);
	        findMode(array);
	        findMedian(array);
	        
	    }

	    private static int[] fillArray() {
	        System.out.println("10 db számot fogok tőled bekérni");
	        int[] array = new int[REQUEST_NUMBERS];
	        Scanner s = new Scanner(System.in);

	        for (int i = 0; i < REQUEST_NUMBERS; i++) {
	            System.out.print("Kérem a(z) " + (i + 1) + ". számot: ");
	            array[i] = s.nextInt();
	        }

	        return array;
	    }

	    private static void findMinimum(int[] array) {
	        int min = array[0];
	        for (int i = 1; i < array.length; i++) {
	            min = (array[i] < min) ? array[i] : min;
	        }
	        System.out.println("A legkisebb elem a tömbben: " + min);
	    }
	    
	    private static void findMaximum(int[] array) {
	        int max = array[0];
	        for (int i = 1; i < array.length; i++) {
	            max = (array[i] > max) ? array[i] : max;
	        }
	        System.out.println("A legnagyobb elem a tömbben: " + max);
	    }
	    
	    private static int sum(int[] array) {
	        int sum = 0;
	        for (int i = 0; i < array.length; i++) {
	           sum+=array[i];
	        }
	        System.out.println("Az elemek összege: " + sum);
	        return sum;
	    }
	    
	     private static void avg(int total) {
	        System.out.println("Az elemek átlaga: " + (total/REQUEST_NUMBERS));
	    }
	    
	     public static void findMode(int[] array) {
	        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
	        
	        for (int num : array) {
	            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
	        }
	    
	        int mode = array[0];
	        int maxCount = 0;
	    
	        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
	            if (entry.getValue() > maxCount) {
	                maxCount = entry.getValue();
	                mode = entry.getKey();
	            }
	        }
	    
	         System.out.println("Az elemek móduszát: " + mode);
	    }
	    
	     private static void findMedian(int[] array) {
	       Arrays.sort(array);
	       int mid1 = array.length/2;
	       int mid2 = array.length/2 - 1;
	       
	        System.out.println("Az elemek mediánja: " + (array[mid1] + array[mid2]) / 2.0);
	    }
	    

}
