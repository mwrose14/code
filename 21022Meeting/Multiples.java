
/**
 * 2/10/2022 Meeting project, "Multiples of 3 or 5" problem from
 * ProjectEuler.net
 *
 * @author Mike Flynn/Programming Club
 * @version 1.0
 */
public class Multiples {
    public static void main (String[] args) {
        // ***Brute Force Solution***
        // Initialize the sum1 variable
        int sum1 = 0;
        
        // Iterate through every number under 1000, if the number
        // is a multiple of 3 or 5, add to the sum
        for(int i = 0; i < 1000; i++) {
            // Check to see if i is a multiple of 3 or 5
            if(i % 5 == 0 || i % 3 == 0) {
                sum1 += i;
            }
        }
         
        // Print sum1
        System.out.println("Sum1 is " + sum1);
        
        // More efficient method
        // Initialize the sum2 variable
        int sum2 = 0;
        
        // Loop to iterate through multiples of 3
        for(int i = 0; i < 1000; i += 3) {
            // Add i to sum2
            sum2 += i;
        }
        
        // Loop through multiples of 5, check that i is
        // also not a multiple of 3
        for(int i = 0; i < 1000; i += 5) {
            // If i is not a multiple of 3 add to the sum
            if (i % 3 != 0) {
                // Add i to sum2
                sum2 += i; 
            }
        }
        
        // Print sum2
        System.out.println("Sum2 is " + sum2);
    }
}


