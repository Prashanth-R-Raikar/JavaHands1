import java.util.Scanner;

public class Employee{
	long empID;
	double empSalary;
	float emptax;
	int dayofwork;
	double pf;
	void calculatePF() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Employee ID:");
		empID= sc.nextLong();
		System.out.println("Enter the employee salary");
		empSalary= sc.nextDouble();
		System.out.println("Enter the emp Tax");
		emptax= sc.nextFloat();
		System.out.println("No of days he worked");
		dayofwork= sc.nextInt();
		pf= empSalary/(emptax*dayofwork);
		System.out.println("The pf of the employee "+empID+ " is: "+pf);
	}
}