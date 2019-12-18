import java.util.Scanner;

/*
 * Cody Henopp
 * 12/17/19
 * 
 * This program solves for the perimeter of a triangle.
 */
public class Triangle {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter first side: ");
		double side1 = input.nextDouble();
		System.out.print("Enter second side: ");
		double side2 = input.nextDouble();
		System.out.print("Enter third side: ");
		double side3 = input.nextDouble();
		double perimeter = (side1+side2+side3);




		if ((side1+side3) <= side2 || (side2+side3) <= side1 || (side1+side2) <= side3) {

			System.out.println("Answer is invalid.");
		}


		else {


			System.out.print(perimeter);


		}

	}

}
