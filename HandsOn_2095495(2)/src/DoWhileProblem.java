
class Welcome1{
	void printmessage() {
		System.out.println("Welcome All");
	}
}
public class DoWhileProblem {

	public static void main(String[] args) {
		int c=5;
		Welcome1 we=new Welcome1();
		do {
			we.printmessage();
			c--;
		}
		while(c>0);

	}

}
