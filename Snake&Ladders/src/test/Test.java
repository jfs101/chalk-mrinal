package test;

import static org.junit.jupiter.api.Assertions.*;
import main.SnakeLadders;

class Test {
SnakeLadders sl;
	@SuppressWarnings("static-access")
	@org.junit.jupiter.api.Test
	void Snaketest() {
		sl = new SnakeLadders();
		assertEquals(true,sl.snake(1, 2));
		assertEquals(false,sl.snake(2, 2));
	}
	
	@SuppressWarnings("static-access")
	@org.junit.jupiter.api.Test
	void Laddertest() {
		assertEquals(true,sl.ladder(0, 2));
		assertEquals(false,sl.ladder(2, 2));
	}
	
	@SuppressWarnings("static-access")
	@org.junit.jupiter.api.Test
	void GameOvertest() {
			
		assertEquals(true,sl.gameOver(10));
		assertEquals(false,sl.gameOver(0));
			
	}

}
