import java.util.Scanner;
public class random {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("This program will simulate flipping a coin.");
		System.out.println("How many times do you want to flip: ");
		int usr = in.nextInt();
		int heads = 0;
		int tails = 0;
		System.out.println("");
		for (int i=1; i<=usr; i++){
			double coin = Math.random();
			if (coin < 0.5){
				System.out.print("H");
				heads++;
			}else{
				System.out.print("T");
				tails++;
			}
			}
		System.out.println("");
		System.out.println("There were " + heads + " heads and " + tails + " tails.");

	}

}
