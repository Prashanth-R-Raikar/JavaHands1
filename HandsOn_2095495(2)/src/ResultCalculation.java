
public class ResultCalculation{
	public Result calculateResult(Student Name) {
		int total= Student.getMark1()+Student.getMark2()+Student.getMark3();
		int avg= total/3;
		Result result= new Result();
		if(avg>40) {
			result.setGrade("Pass");
		}else {
			result.setGrade("Fail");
		}
		return result;
	}
}