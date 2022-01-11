
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import com.rays.dao.Associates;
import com.rays.dao.AssociatesDao;
import com.rays.dao.AssociatesDaoImpl;

public class MainDemo {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws ParseException {

		AssociatesDao asDao = new AssociatesDaoImpl();
		do {
			System.out.println("Select the Options below :");
			System.out.println(
					" 1.Add Associates \n 2.View All Associates \n 3.View By Associate ID \n 4. Update Associates \n 5. Delete Associates \n 6. Exit");
			int option = scanner.nextInt();
			switch (option) {
			case 1:
				Associates associates = inputMet();
				int result = asDao.addAssociates(associates);
				if (result > 0) {
					System.out.println("Associates Details Added Successfully....");
				} else {
					System.out.println("Try to Add Again....");
				}
				break;
			case 2:
				List<Associates> assoList = asDao.getAllAssociates();
				for(Associates asso :assoList) {
					System.out.println(asso);
				}
				break;
			case 3:
				System.out.print("Enter Associate ID :");
				int id = scanner.nextInt();
				Associates associates2 = asDao.getAssociatesById(id);
				System.out.println(associates2);
				break;
			case 5:
				return;
			default:
				break;
			}
			System.out.println("Do you want to Continue  1. Yes \t 2. No");
		} while (scanner.nextInt() == 1);
	}

	static Associates inputMet() throws ParseException {
		System.out.println("Enter Associates Details :");
		System.out.print("ID :");
		int id = scanner.nextInt();
		System.out.println("Name : ");
		String name = scanner.next();
		System.out.println("Email : ");
		String email = scanner.next();
		System.out.println("Mobile : ");
		long mobile = scanner.nextLong();
		System.out.println("Join Date (dd/MM/yyyy): ");
		String jd = scanner.next();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date joinDate = sdf.parse(jd);
		Associates associates = new Associates(id, name, email, mobile, joinDate);
		return associates;
	}

}
