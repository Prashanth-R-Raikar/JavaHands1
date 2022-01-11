import java.util.Scanner;

public abstract class Shape {
	String color;
	public abstract double calculateArea();
	void setColor() {
		System.out.println("Enter the color");
		Scanner sc= new Scanner(System.in);
		color = sc.next();
	}

}
