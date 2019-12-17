import java.util.Scanner;

/*
 * Cody Henopp
 * 12/17/19
 * 
 * This program solves Cramer's Rule.
 */
public class Implementation {
	public static void main(String[] args) {


		Scanner input = new Scanner(System.in);


		System.out.print("Enter a: ");
		double a = input.nextDouble();
		System.out.print("Enter b: ");
		double b = input.nextDouble();
		System.out.print("Enter c: ");
		double c = input.nextDouble();
		System.out.print("Enter d: ");
		double d = input.nextDouble();
		System.out.print("Enter e: ");
		double e = input.nextDouble();
		System.out.print("Enter f: ");
		double f = input.nextDouble();

		if (((a*d)-(b*c)) == 0) {
			System.out.print("The equation has no solution.");

		}
		else {
			double x = (((e*d)-(b*f))/((a*d)-(b*c)));
			System.out.println("x= " + x);
			double y = (((a*f)-(e*c))/((a*d)-(b*c)));
			System.out.println("y= " + y);
			System.out.print("Result is as shown.");
		}



	}


}
