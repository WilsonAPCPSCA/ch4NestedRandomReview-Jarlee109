import java.util.Scanner;
import java.util.Random;
public class dice {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner in = new Scanner(System.in);
		System.out.println("This program will simulate tossing a pair of dice.");
		System.out.print("How many times do you want to roll the dice: ");
		int roll = in.nextInt();
		System.out.println("This is the sequence of sums, one for each toss:");
		int dice1;
		int dice2;
		int sum;
		for (int i=1; i<=roll; i++){
			dice1 = rand.nextInt(6)+1;
			dice2 = rand.nextInt(6)+1;
			sum = dice1+ dice2;
			System.out.print(sum + " ");
		}

	}

}
