
public class JavaInhe {
	    public static void main(String args[]) {
	        Son obj1 = new Son();
	        Son2 obj2 = new Son2();
	        // All classes can access the method of class father
	        obj1.methodA();
	        obj2.methodA();
	        obj1.methodB();
	        obj2.methodC();
	    }
}
