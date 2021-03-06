package finalproject_01;

import java.util.Scanner;

/*

 * Author: Cody Henopp

 * 

 * Date: 03/10/2020

 * 

 */

class FinalProject_01 {



	public static void main(String[] args) {

/*
 * What is happening in the main method is it starts the table and then directly calls to the ship method.
 */

		Scanner input = new Scanner(System.in);

		String [][] table = new String [6][6];
		String [][] ship = new String [6][6];
		int total = 0;


		for (int i = 0; i < table.length; i++) {

			for (int j = 0; j < table[i].length; j++) {

				table[i][j] = "[]";


			}




		}

		ship(table);

	}
/*
 * This is where the matrix is then printed to be called to the shooter method for the second player to start shooting for the ship.
 */
	public static void printGrid(String [][] table, String[][] ship) {



		for (int i = 0; i < table.length; i++) {

			for (int j = 0; j < table.length; j++) {
				System.out.print(table[i][j] + " ");
			}
			System.out.println();
		}



		shooter(table, ship);
	}
/*
 * The shooter method is for after the first player has added where they want the ship. In this method it asks for the second player
 * to then shoot on the matrix to find the ship. It will either show a "*" if you hit the ship and a "!" if you miss the ship. After 
 * you have found the whole ship the game will end and tell you that you won.
 */
	public static void shooter(String[][] layout, String[][] ship) {

		Scanner input = new Scanner(System.in);

		System.out.println("Second player there is one ship that is a 3X1. Find it.");

		int total = 0;
		int count = 0;

		String miss = "!";

		String shot = "*";

		while(count <= 2) {


			System.out.println("Enter a row for shot.");

			int row = input.nextInt();

			System.out.println("Enter a column for shot.");

			int col = input.nextInt();



			if (layout[row][col].equalsIgnoreCase(ship[row][col])) {

				layout[row][col] = shot;
				count++;


			}

			else {
				layout[row][col] = miss;

			}
			total++;


			
			for (row = 0; row < layout.length; row++) {

				for (col = 0; col < layout.length; col++) {
					System.out.print(layout[row][col] + " ");
				}
				System.out.println();
			}
			if (count == 3) {
				System.out.println("You won!");
				
			}
		}
		



	}
/*
 * What happens in the ship method is it asks the first player to add a 3X1 ship by entering in the row and col of where they
 * want it located. After it is entered it will then call to go to the printGrid method.
 */
	public static void ship(String[][] placement) {
		Scanner input = new Scanner(System.in);
		int total = 0;
		String[][] ship = new String[6][6];

		String turn = "[]";
		System.out.println("First player enter location for a 3X1 ship that is horizontal or vertical only: (all next to each other)");

		for (int row = 0; row < ship.length; row++) {
			for (int col = 0; col < ship[row].length; col++) {
/*
 * This while loop is going to keep going until the total has been hit and in this case it is 2 based on the ship size so it can
 * then go to the printGrid method.
 */
				while (total <= 2) {



					System.out.println("Please enter a row for placement");

					row = input.nextInt();

					System.out.println("Please enter a column for placement");

					col = input.nextInt();



					ship[row][col] = turn;

					total++;

					}
				if (row != (row + 1) || row != (row - 1) || row != (row + 2) || row != (row - 2) || row != (row + 3) || row != (row - 3) ||
					col != (col + 1) || col != (col - 1) || col != (col + 2) || col != (col - 2) || col != (col + 3) || col != (col - 3)){
					printGrid(placement, ship);
				}
				
					
				}
			
		}
/*
 * This calls to the printGrid method to show the matrix.
 */
		//printGrid(placement,ship);

	}
}

