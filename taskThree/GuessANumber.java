import java.util.Random;
import java.util.Scanner;  

public class GuessANumber {
    private static int rnd_number;
	
    public static void main(String[] args) {
        // pick a random number
        Random random = new Random();
        rnd_number = random.nextInt(100) + 1;
        System.out.println( "I'm thinking of a number between 1 and 100 (including both).");
	System.out.println( "Can you guess what it is?...");
        makeAGuess();
    }


    private static void makeAGuess(){
	// Create a Scanner object 
    Scanner scanner = new Scanner (System.in);

    // use hasNextDouble to check if input is numeric, 
    boolean IsNumberNumeric = scanner.hasNextDouble();
        if (scanner.hasNextInt()) {

            // Read user input
            int number = scanner.nextInt();

            // Compare it with the random number
            if (number == rnd_number) {
                System.out.println("Correct");
            } else if (number < rnd_number) {
                System.out.println("The random number is larger than: " + number);
                makeAGuess();
            } else {
                System.out.println("The random number is smaller than: " + number);
                makeAGuess();
            }
        } else { //If number is not numeric:
            System.out.println("Only type in integers");
            makeAGuess(); 
        }

    }
}
       
