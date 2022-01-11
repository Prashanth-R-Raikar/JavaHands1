import java.util.Scanner;

class Number1 {
	void display(int num1, int num2, int num3) {
		int big;
		if(num1>num2) {
			if(num1>num3) {
				big=num1;
			}else if(num3>num2) {
				big=num3;
			}else {
				big=num2;
			}
		}else if(num2>num3) {
			big=num2;
		}else {
			big=num3;
		}
		System.out.println("The biggest number is"+big);
	}
}
public class ElseIfProblem {

	public static void main(String[] args) {
		Number1 num= new Number1();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the first number");
		int num1=sc.nextInt();
		System.out.println("Enter the second number");
		int num2=sc.nextInt();
		System.out.println("Enter the third number");
		int num3=sc.nextInt();
		num.display(num1,num2,num3);
	}

}
