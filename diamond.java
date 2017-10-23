import java.util.Scanner;
public class diamond {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("What is the side length of the diamond: ");
		int length = in.nextInt();
		for(int i=1; i<=length; i++){
			for(int k=(length-i); k>=0; k--){
				System.out.print(" ");
			}
			for(int j=1; j<=(i*2-1); j++){
				System.out.print("*");
			}
			System.out.println("");
		}
		for(int i=(length-1); i>=1; i--){
			for(int k=(length-i);k>=0; k--){
				System.out.print(" ");
			}
			for(int j=1; j<=(2*i-1); j++){
			System.out.print("*");
			}
			System.out.println("");
		}

	}

}
