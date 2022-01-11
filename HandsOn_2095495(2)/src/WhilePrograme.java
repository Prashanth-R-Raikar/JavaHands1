
class Welcome{
	void printmess() {
		System.out.println("Welcome All");
	}
}
public class WhilePrograme {

	public static void main(String[] args) {
		int c = 5;
		Welcome we= new Welcome();
		while(c>0) {
			we.printmess();
			c--;
		}

	}

}
