import java.util.Random;
import java.util.Scanner;

public class CoinFlipper {

	public static void main(String[] args)
	{
	    
		Scanner in = new Scanner(System.in);
		System.out.println("Guess which will have more: heads or tails?\n");
	    String headsOrTailsGuess = in.nextLine();
		System.out.println("How many times shall we flip a coin?\n");
		int numberOfFlips = in.nextInt(); 

		String loss = "";
		if (headsOrTailsGuess.equals("heads")) loss="tails";
		if (headsOrTailsGuess.equals("tails")) loss="heads";
		
		Random r = new Random();
		int correctCount = 0;
		for (int j = 0; j < numberOfFlips; j ++) {
			int flip = r.nextInt(2);
				correctCount+=flip;
				if (flip == 0) System.out.println(loss + "\n");
				if (flip == 1) System.out.println(headsOrTailsGuess + "\n");
		}
		
		System.out.println("Your guess " + headsOrTailsGuess + " came up " + correctCount + " times. That's " + (100.0 * correctCount) / numberOfFlips + "%.");
	}
}

