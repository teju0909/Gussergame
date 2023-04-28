package in.inueron;

import java.util.Scanner;

public class Guesser {

	public static void main(String[] args) {
		boolean flag = true;
		PlayersNumbers c = new PlayersNumbers();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("\n"+"*****welcome to gusser player game*****"+"\n");
		do{
			c.guesserNum();
			System.out.println("Enter How Many Players You Want To Play This Game ? ::");
		
			int n = sc.nextInt();
		
			if(n>5) {
				System.out.println("More Than 5 Player Can't Play This Game..");
			}else {
				c.playerNum(n);
				c.result(n);
			}
		
		System.out.println("\n"+"DO YOU WANT TO PLAY AGAIN? [Yes(y/Y)/No] ::");
		Scanner sc2 = new Scanner(System.in);
		String ans=sc2.next();
		if("Yes".equals(ans)||"YES".equals(ans)||"yes".equals(ans)||"Y".equals(ans)||"y".equals(ans)) {
			flag=true;
		}else {
			flag=false;
			System.out.println("                     THANK YOU..           "
					+ " "+"\n"+"              APPLICATION HAS STOPPED..");
		}
		}while(flag);
		
		
	}

}
