import java.util.Scanner;


public class HiLo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String playAgain = "";
		int count = 0;
		do {
			System.out.println("Guess a number between -100 and 100");
			int theNumber = (int)(Math.random() * 200 - 100 + 1);
//			System.out.println(theNumber);
			int guess = 0;
			while(guess != theNumber) {
				guess = scan.nextInt();
				System.out.println("Guess a number between - 100 and 100: ");
				count++;
				if (guess < theNumber)
					System.out.println(guess + " is too low, Try again");
				if (guess > theNumber)
					System.out.println(guess + " is too high, Try again");
				if (guess == theNumber)
					System.out.println(guess + " This is winning number,"
							+ " Congratilations!!!");
			}
			System.out.println("Would you like to play again (y/n)");
			System.out.println("It only took you " + count + " tries!, Good work!");
			playAgain = scan.next();
		} while (playAgain.equalsIgnoreCase("y"));
		System.out.println("Thank you for playing! Goodbye.");
		scan.close();
	}

}