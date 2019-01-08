package main;

import java.util.*;

public class TicTacToe{
public static int[][] ticbox;
	public static int win(int [][]tic) {
		for(int i=0;i<3;i++) {
			if(tic[i][0]==tic[i][1]) {
				if(tic[i][1]==tic[i][2]) {
					if(tic[i][1]!=0)
						return tic[i][1];
				}
			}
		}
		for(int i=0;i<3;i++) {
			if(tic[0][i]==tic[1][i]) {
				if(tic[1][i]==tic[2][i]) {
					if(tic[i][1]!=0)
						return tic[1][i];
				}
			}
		}
		if(tic[0][0]==tic[1][1]) {
			if(tic[1][1]==tic[2][2]) {
				if(tic[1][1]!=0)
					return tic[1][1];
			}
		}
		if(tic[0][2]==tic[1][1]) {
			if(tic[1][1]==tic[2][0]) {
				if(tic[1][1]!=0)
					return tic[1][1];
			}
		}
		
		
		return 0;
		
	}
	
	public static void printBox(int [][]tic) {
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(tic[i][j]);
			}
			System.out.println("");
		}
	}
	public static boolean validate(int a1,int a2,int [][] tic) {
		
		if(a1 >= 0 && a1<3) {
			if(a2 >= 0 && a2 < 3) {
				if(tic[a1][a2]==0) {
					return true;
				}
			}
		}
		return false;
	}
	public static void main(String args[]) {
		
		ticbox = new int[3][3];
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				ticbox[i][j] = 0;
			}
		}
		
		 int chk = win(ticbox);

		boolean turn= true;
		int limit = 9;
		while(chk==0 && limit > 0) {
			//if true player 1	
			if(turn) {
				System.out.println("Player 1 Enter the box number");
				printBox(ticbox);
				Scanner sc = new Scanner(System.in);
				int a1 = sc.nextInt();
				int a2 = sc.nextInt();
				boolean valid = validate(a1,a2,ticbox);
				if(valid) {
					ticbox[a1][a2] = 1;
					chk = win(ticbox);
					turn = false;
					limit --;
				}
				else {
					System.out.println("Please enter a valid position!!");
				}
			}else {
				System.out.println("Player 2 Enter the box number");
				printBox(ticbox);
				Scanner sc = new Scanner(System.in);
				int a1 = sc.nextInt();
				int a2 = sc.nextInt();
				boolean valid = validate(a1,a2,ticbox);
				if(valid) {
				ticbox[a1][a2] = 2;
				chk = win(ticbox);
				turn = true;
				limit --;
				}
				else {
					System.out.println("Please enter a valid position!!");
				}
			}
			
			
			//if false player 2 
		}
		
		if(chk!=0) {
			System.out.println("The winner is Player "+chk);
		}else {
			System.out.println("Its a draw match!!");
		}
		
	}
}