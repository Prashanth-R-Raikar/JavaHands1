import java.util.Scanner;

class Calculator{
	void addition(int num12, int num22) {
		int num3= num12+num22;
		System.out.println("The sum is : "+num3);
	}
	void substraction(int num12, int num22) {
		int num3= num12-num22;
		System.out.println("The substraction is : "+num3);
	}
	void multlipication(int num12, int num22) {
		int num3= num12*num22;
		System.out.println("The mult is : "+num3);
	}
	void division(int num12, int num22) {
		int num3= num12/num22;
		System.out.println("The division is : "+num3);
	}
}
public class CalculatorMain {

	public static void main(String[] args) {
		Calculator cal= new Calculator();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the first number");
		int num1=sc.nextInt();
		System.out.println("Enter the second number");
		int num2=sc.nextInt();
		cal.addition(num1,num2);
		cal.division(num1,num2);
		cal.multlipication(num1,num2);
		cal.substraction(num1,num2);

	}

}
