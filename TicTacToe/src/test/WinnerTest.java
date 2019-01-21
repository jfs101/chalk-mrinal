package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.TicTacToe;

/*
 * CHANGING OF TEST FILES MAY LEAD TO DISQUALIFICATION OF PROJECT
 * 
 */

class WinnerTest {

	TicTacToe m;
	
	@SuppressWarnings("static-access")
	@Test
	void player1Testing() {
		m = new TicTacToe();
		m.ticbox = new int[3][3];
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				m.ticbox[i][j] = 0;
			}
		}
		m.ticbox[0][0] = 1;
		m.ticbox[0][1] = 1;
		m.ticbox[0][2] = 1;
		assertEquals(1,m.win(m.ticbox));
	}
	@SuppressWarnings("static-access")
	@Test
	void player2Testing() {
		TicTacToe m = new TicTacToe();
		m.ticbox = new int[3][3];
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				m.ticbox[i][j] = 0;
			}
		}
		m.ticbox[0][0] = 2;
		m.ticbox[0][1] = 2;
		m.ticbox[0][2] = 2;
		assertEquals(2,m.win(m.ticbox));
	}


}
