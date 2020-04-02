# Battleship Game by Cody Henopp

## Synopsis
This is a simple battleship game shooting for one single 3X1 ship.

## Motivation
My motivation behind this game was to do something a little beyond my current skillset and it definitely challenged me to keep going.

## How to Play
How to play is the first player will enter where they want the location of the ship to be. They will enter in a row (0-5) and column (0-5) location for the ship. The ship will ask for 3 points and can only be entered next to each other as a 3X1 ship horizontally or vertically only. After the location of the ship has been entered the second player will then try and shoot to find the ship entering the same type of location as the first player. A " ! " will show if the player has missed and a " * " will show if the player has hit the ship. The prompt to shoot will continue to show until the second player has successfully sunk the ship and it will say "You win!" and the program will then end.

## Code Example
This method is where the second player is shooting and I am proud of it because it took me a while to figure exactly how to make it work correctly.
```
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
```
