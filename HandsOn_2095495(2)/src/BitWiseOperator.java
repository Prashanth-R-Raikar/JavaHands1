import java.util.Scanner;

class Calculator1{

	void bitwiseAND(int num12, int num22) {
		int num3= num12&num22;
		System.out.println("The bitwiseAND is : "+num3);
	}
	void bitwiseOR(int num12, int num22) {
		int num3= num12|num22;
		System.out.println("The bitwiseOR is : "+num3);
	}
	void bitwiseXOR(int num12, int num22) {
		int num3= num12^num22;
		System.out.println("The bitwiseXOR is : "+num3);
	}
	void bitwiseNOT(int num12, int num22) {
		int num3= ~num12;
		int num4=~num22;
		System.out.println("The bitwiseNOT is : "+num3);
		System.out.println("The bitwiseNOT is : "+num4);
	}
}

public class BitWiseOperator {

	public static void main(String[] args) {
		Calculator1 cal= new Calculator1();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the first number");
		int num1=sc.nextInt();
		System.out.println("Enter the second number");
		int num2=sc.nextInt();
		cal.bitwiseAND(num1,num2);
		cal.bitwiseOR(num1,num2);
		cal.bitwiseXOR(num1,num2);
		cal.bitwiseNOT(num1,num2);

	}

}
