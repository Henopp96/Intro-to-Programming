import java.util.Scanner;

/*
 * Cody Henopp
 * 12/18/19
 * 
 * This program prints a payroll statement.
 */
public class Payroll {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter employee's name: ");
		String EmpName = input.nextLine();
		System.out.print("Enter number of hours worked: ");
		double Hours = input.nextDouble();
		System.out.print("Enter hourly pay rate: $");
		double PayRate = input.nextDouble();
		System.out.print("Enter federal tax withholding rate: ");
		double FederalTax = input.nextDouble();
		System.out.print("Enter state tax withholding rate: ");
		double StateTax = input.nextDouble();
		double FederalWithholding = (FederalTax)*(Hours*PayRate);
		double StateWithholding = (StateTax)*(Hours*PayRate);
		double GrossPay = (Hours*PayRate);
		double NetPay = (GrossPay-(StateWithholding+FederalWithholding));
		
		System.out.println(" ");
		System.out.println("Employee Name: " + EmpName);
		System.out.println("Hours worked: " + Hours);
		System.out.println("Pay rate: $" + PayRate);
		System.out.printf("Gross Pay: $%5.2f",GrossPay);
		System.out.println("");
		System.out.println("Deductions: ");
		System.out.printf("\tFederal Withholding ");
		System.out.print("(" + FederalTax*100 + "%" + "): " + "$");
		System.out.printf("%5.2f",FederalWithholding);
		System.out.print("\n\tState Withholding " + "(" + StateTax*100 + "%" + "): ");
		System.out.printf("$" + "%2.2f",StateWithholding);
		System.out.printf("\n\tTotal Deduction: $%5.2f",(StateWithholding+FederalWithholding));
		System.out.printf("\nNet Pay: $%5.2f", NetPay);
		
				
	}
}
