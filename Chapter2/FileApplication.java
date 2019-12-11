import java.util.Scanner;

/*
 * Cody Henopp
 * 12/10/19
 * 
 * This program is solving the annual interest rate of a savings account.
 */
public class FileApplication {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter monthly saving ammount: $");
		double MonthlyAmount = input.nextDouble();
		double MonthlyInterestRate;
		double MonthlyAfterInterest;
		double MonthAfter2;
		double MonthAfter3;
		double MonthAfter4;
		double MonthAfter5;
		double MonthAfter6;
		MonthlyInterestRate = ((1+0.00417));
		MonthlyAfterInterest = (MonthlyAmount*MonthlyInterestRate);
		MonthAfter2 = ((MonthlyAmount+MonthlyAfterInterest)*(MonthlyInterestRate));
		MonthAfter3 = ((MonthlyAmount+MonthAfter2)*(MonthlyInterestRate));
		MonthAfter4 = ((MonthlyAmount+MonthAfter3)*(MonthlyInterestRate));
		MonthAfter5 = ((MonthlyAmount+MonthAfter4)*(MonthlyInterestRate));
		MonthAfter6 = ((MonthlyAmount+MonthAfter5)*(MonthlyInterestRate));

		System.out.print("After the sixth month, the account value is $" + (MonthAfter6));


	}
}
