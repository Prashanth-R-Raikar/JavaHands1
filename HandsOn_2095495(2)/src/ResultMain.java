
public class ResultMain {

	public static void main(String[] args) {
		Student stu = new Student();
		stu.setRollNo("63");
		stu.setMark1(87);
		stu.setMark2(97);
		stu.setMark3(70);
		ResultCalculation cal= new ResultCalculation();
		Result res = cal.calculateResult(stu);
		System.out.println("Student RollNo:  "+res.getRollNo()+"  Result:" +res.getGrade());

	}

}
