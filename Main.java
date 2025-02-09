package xogame;

import java.util.Scanner;

public class Main {
	static char[][] xoBoard = new char[3][3];
	static char bot;
	static char player;
	static int count = 0;
	static String currentPlayer = "player";
	
	public static void printBoard() {
		System.out.println("--------");
		System.out.println("You: "+ Main.player + ", Bot: " + Main.bot + "\n-----");
		for(int i=0; i<Main.xoBoard.length; i++) {
			for(int j=0; j<Main.xoBoard.length; j++) {
				System.out.print(Main.xoBoard[i][j] + " ");
			}
			System.out.println("");
		}
		System.out.println("-----");
	}
	public static void initBoard(char[][] xo) {
		System.out.println("Initiating XO Board...");
		char pos = '0';
		for(int i=0; i<xo.length; i++) {
			for(int j=0; j<xo.length; j++) {
				xo[i][j] = ++pos;
			}
		}
		Main.printBoard();
	}
	public static void switchPlayer(String currPlayer) {
		if(currPlayer.toLowerCase() == "player") {
			Main.currentPlayer = "bot";
		}
		else {
			Main.currentPlayer = "player";
		}
	}
	public static boolean isWon(char[][] xo) {
		if(Main.count > 9) {
			System.out.println("Match drawn!");
			return true;
		}
		else {
			for(int i=0; i<xo.length; i++) {
				char val = xo[i][0];
				int count = 0;
				for(int j=0; j<xo.length; j++) {
					if(val == xo[i][j]) {
						++count;
					}
				}
				if(count == 3) {
					if(val == Main.bot) {
						System.out.println("Bot won the match!");
						return true;
					}
					if(val == Main.player) {
						System.out.println("You won the match!");
						return true;
					}
				}
			}
			for(int j=0; j<xo.length; j++) {
				char val = xo[0][j];
				int count = 0;
				for(int i=0; i<xo.length; i++) {
					if(val == xo[i][j]) {
						++count;
					}
				}
				if(count == 3) {
					if(val == Main.bot) {
						System.out.println("Bot won the match!");
						return true;
					}
					if(val == Main.player) {
						System.out.println("You won the match!");
						return true;
					}
				}
			}
			if(xo[0][0] == xo[1][1] && xo[1][1] == xo[2][2]) {
				if(xo[0][0] == Main.bot) {
					System.out.println("Bot won the match!");
					return true;
				}
				if(xo[0][0] == Main.player) {
					System.out.println("You won the match!");
					return true;
				}
			}
			if(xo[0][2] == xo[1][1] && xo[1][1] == xo[2][0]) {
				if(xo[0][2] == Main.bot) {
					System.out.println("Bot won the match!");
					return true;
				}
				if(xo[0][2] == Main.player) {
					System.out.println("You won the match!");
					return true;
				}
			}
		}
		return false;
	}
	public static void makeMove(char[][] xo, String currPlayer, char pos) {
		if(currPlayer.toLowerCase() == "player") {
			++Main.count;
			if(pos == '1') {
				if(xo[0][0] != 'X' || xo[0][0] != 'O') {
					xo[0][0] = Main.player;
				}
			}
			else if(pos == '2') {
				if(xo[0][1] != 'X' || xo[0][1] != 'O') {
					xo[0][1] = Main.player;
				}
			}
			else if(pos == '3') {
				if(xo[0][2] != 'X' || xo[0][2] != 'O') {
					xo[0][2] = Main.player;
				}
			}
			else if(pos == '4') {
				if(xo[1][0] != 'X' || xo[1][0] != 'O') {
					xo[1][0] = Main.player;
				}
			}
			else if(pos == '5') {
				if(xo[1][1] != 'X' || xo[1][1] != 'O') {
					xo[1][1] = Main.player;
				}
			}
			else if(pos == '6') {
				if(xo[1][2] != 'X' || xo[1][2] != 'O') {
					xo[1][2] = Main.player;
				}
			}
			else if(pos == '7') {
				if(xo[2][0] != 'X' || xo[2][0] != 'O') {
					xo[2][0] = Main.player;
				}
			}
			else if(pos == '8') {
				if(xo[2][1] != 'X' || xo[2][1] != 'O') {
					xo[2][1] = Main.player;
				}
			}
			else if(pos == '9') {
				if(xo[2][2] != 'X' || xo[2][2] != 'O') {	
					xo[2][2] = Main.player;
				}
			}
		}
		else {
			++Main.count;
			System.out.println("Bot move");
			boolean changed = false;
			for(int i=0; i<xo.length; i++) {
				for(int j=0; j<xo.length; j++) {
					if(xo[i][j] != 'X' && xo[i][j] != 'O') {
						xo[i][j] = Main.bot;
						changed = true;
						break;
					}
				}
				if(changed) {
					break;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("---Welcome to XO Game---");
		System.out.print("Your sign (X or O): ");
		char val = sc.nextLine().charAt(0);
		if(val == 'x' || val == 'X') {
			Main.player = 'X';
			Main.bot = 'O';
		}
		else {
			Main.player = 'O';
			Main.bot = 'X';
		}
		Main.initBoard(xoBoard);
		boolean isWon = false;
		while(!isWon) {
			if(Main.currentPlayer.toLowerCase() == "player") {
				System.out.print("Your move, Select position: ");
				char pos = sc.nextLine().charAt(0);
				Main.makeMove(xoBoard, Main.currentPlayer, pos);
			}
			else {
				Main.makeMove(xoBoard, Main.currentPlayer, '1');
			}
			isWon = Main.isWon(xoBoard);
			Main.printBoard();
			if(!isWon) {
				Main.switchPlayer(Main.currentPlayer);
			}
		}
		sc.close();
	}
}