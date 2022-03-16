import java.util.Scanner;

public class HeadsOrTails {

	public static void main(String[] args) {
		// Setting Variables 
		int correctCount = 0;
		try (// Input for guess and how many flips
		Scanner secondchance = new Scanner(System.in)) {
			System.out.print("Guess which will have more: heads or tails?");
			String headsOrTailsGuess = secondchance.next();
			
			System.out.print("How many times shall we flip a coin?");
			int numberOfFlips = secondchance.nextInt();
			
			System.out.print("\n");
			// loop to repeat coin flips based on the number of flips 
			for (int i = 0; i < numberOfFlips; i++) {
			// Generate random number 	
				if(Math.random() > 0.5) {
					System.out.println("heads");
					if(headsOrTailsGuess.matches("heads")) {
						correctCount++;
					}
				} else {
					System.out.println("tails");
					if(headsOrTailsGuess.matches("tails")) {
						correctCount++;
					}
				}
			}
			// Output and calculation of guesses and percentages 				
		System.out.println("Your guess, " + headsOrTailsGuess + ", came up " + correctCount + " times.");
		System.out.println("Thats " + correctCount * 100 / numberOfFlips + "%");
		}
		
		

	}

}
