public class PrintEvenNumbers {
    public static void main(String[] args) {
     
        int count = 0;
        
        // Variable to keep track of the current number to be checked
        int number = 2;
        
        
        while (count < 10) {
            
            System.out.println(number);
            
            // Increment the count of printed even numbers
            count++;
            
            // Move to the next even number
            number += 2;
        }
    }
}
