import java.util.Scanner;
public class Payroll{
	public static void main(String[] arg){

Scanner input = new Scanner(System.in);

String info = """

	<======== Welcome to Semicolon Employees Payroll ========>	
  		

	1- Add Employee Payroll
	2- View Employees Payroll
	3- Update Employee Payroll
	0- Exit

	""";
System.out.println(info);

int userInput = input.nextInt();
switch(userInput){
case 1: 
	System.out.print("Enter Employee Name: "); 
		String employeeName = input.next();
	System.out.print("Enter Number of hours worked in a week: "); 
 		double numberOfhoursPerWeek = input.nextDouble();
	System.out.print("Enter hourly pay rate: ");
		double hourlyPayRate = input.nextDouble();
	System.out.print("Federal tax withholding rate: ");
		double federalTax = input.nextDouble();
	System.out.print("Enter state tax withholding rate: ");
		 double stateTaxWithholdingRate = input.nextDouble();


	System.out.print("Employee payroll added ===========>"); 
break;

case 2:

for (int count = 0; count <= 5; count++){

	System.out.print("Enter Employee Name: ");
  		String enterEmployeeName = input.next();

	System.out.print("Enter Number of hours worked in a week: ");
 		double numberOfhoursPerWeek1 = input.nextDouble();

	System.out.print("Enter hourly pay rate: ");
 		double hourlyPayRate1 = input.nextDouble();


	
	double grossPay = numberOfhoursPerWeek1 * hourlyPayRate1;
	System.out.println("Gross pay: " + grossPay);

	System.out.println("Deductions:");

 	double federalTaxWithholdingRate1 = grossPay * 0.2;
	System.out.println("\t" + "Federal tax withholding rate(20.0%): " + federalTaxWithholdingRate1);

 	double stateTaxWithholdingRate1 = grossPay * 0.09;
	System.out.println("\t" + "State tax withholding rate(9.0%): " + stateTaxWithholdingRate1);

	double totalDeduction = federalTaxWithholdingRate1 + stateTaxWithholdingRate1;
	System.out.printf("\t" + "Total Deduction:" + "%.2f\n", totalDeduction);

	double netPay = grossPay - totalDeduction;
	System.out.printf("Net Pay: " +"%.2f\n", netPay);

if(hourlyPayRate1 > 168){
	System.out.print("Work hour too much!!!");
	}

if (enterEmployeeName == enterEmployeeName){


}


}
break;
}


}
	
}