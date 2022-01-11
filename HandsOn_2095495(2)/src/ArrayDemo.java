
public class ArrayDemo {
	int[] number;
	void storeNumber() {
		number=new int[101];
		for(int i=0;i<=100;i++) {
			number[i]=i;
		}
	}
	void printEvent() {
		System.out.println("The even number between 1 to 100: ");
		for(int i=0;i<number.length;i++) {
			if((number[i]%2)==0)
				System.out.println(number[i]);
		}
	}

	public static void main(String[] args) {
		ArrayDemo arde= new ArrayDemo();
		arde.storeNumber();
		arde.printEvent();
		// TODO Auto-generated method stub

	}

}
