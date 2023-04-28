package in.inueron;

import java.util.Scanner;

public class PlayersNumbers {
	int guesserNo;
	int playersNo[]=new int[5];

	int guesserNum() {
		GuesserNum g = new GuesserNum();
		guesserNo = g.guesserNum();
		return guesserNo;
	}
	
	void playerNum(int n) {
		Scanner g = new Scanner(System.in);
		for(int i =0; i<n; i++) {
		
		System.out.println("Player "+ (i+1) +" Is Guessing The Number..::");
		playersNo[i] = g.nextInt();
		}
	}
	
	
	void result(int n) {
		
		String res[] = {"","","","",""};
		int cnt=0;
//		for(int k=1;k<=n;k++) {
//			System.out.println("Playrs No::"+playersNo[k]);
//		}
		
		for(int i=0;i<n;i++) {
			if(playersNo[i]==guesserNo) {
				cnt++;
				res[i]=" "+(i+1)+" ";
				
			}
		}
		
//		for(int k=1;k<=n;k++) {
//			System.out.println("Res No::"+res[k]);
//		}
		if(cnt>1) {System.out.println("**********************************");

			System.out.print("GAME TIE BETWEEN THESE PLAYERS ::");
			for(int l=0;l<res.length;l++) {
				System.out.print(res[l].toString());
			}
			
			System.out.println(" ");
			System.out.println("*********GAME IS OVER*********");
		
		}else if(cnt==1){System.out.println("**********************************");

			System.out.print("GAME WON BY PLAYER ::");

			for(int l=0;l<res.length;l++)
				System.out.print(res[l].toString());
			
			System.out.println(" ");
			System.out.println("*********GAME IS OVER*********");
		
		}else {System.out.println("**********************************");
			
			System.out.println("NO ONE IS THE WINNER");
			System.out.println(" ");
			System.out.println("*********GAME IS OVER*********");
		}
		
		
		/*
		 if(playersNo[1] == guesserNum && playersNo[0] == guesserNum) {
			System.out.println("TIE BETWEEN PLAYER 1 & 2...");
		}else if(playersNo[2] == guesserNum && playersNo[1] == guesserNum) {
			System.out.println("TIE BETWEEN PLAYER 2 & 3...");
		}else if(playersNo[2] == guesserNum && playersNo[0] == guesserNum) {
			System.out.println("TIE BETWEEN PLAYER 1 & 3...");
		}else if(playersNo[0] == guesserNum) {
			System.out.println("FIRST PLAYER WON THE GAME...");
		}else if(playersNo[1] == guesserNum) {
			System.out.println("SECOND PLAYER WON THE GAME...");
		}else if(playersNo[2] == guesserNum) {
			System.out.println("THIRD PLAYER WON THE GAME...");
		}else if(playersNo[3] == guesserNum) {
			System.out.println("FOURTH PLAYER  WON THE GAME...");
		}else if(playersNo[4] == guesserNum) {
			System.out.println("FIFTH PLAYER WON THE GAME...");
		}else {
			System.out.println("NO ONE IS THE WINNER");;
		}
		*/
	}
}
