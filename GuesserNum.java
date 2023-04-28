package in.inueron;

import java.util.Scanner;

public class GuesserNum {
		int guesserNum() {
			Scanner sc = new Scanner(System.in);
			System.out.println("Guesser Kindly Guess The Number :: ");
			int i = sc.nextInt();
			return i;
		}
}
