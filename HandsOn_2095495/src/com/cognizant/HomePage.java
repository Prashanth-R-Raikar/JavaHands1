package com.cognizant;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;


public class HomePage {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws ParseException {
		CustomerFunction cuFun = new CustomerImpl();
		do {
			System.out.println("Select the Options below :");
			System.out.println(
					" 1. Register – registers a customer \n 2. Book – Book a room \n 3. Check Status – check for the rooms present status \n 4. Email – Change/update an email address of the customer \n "
					+ "5. All Bookings in a particular date \n 6. All customers details \n 7. Exit \n");
			int option = scanner.nextInt();
			switch (option) {
			case 1:
				CustomerDetails customer = inputMet();
				int result = cuFun.addCustomerDetails(customer);
				if (result > 0) {
					System.out.println("Customer Details Added Successfully....");
				} else {
					System.out.println("Try to Add Again....");
				}
				break;
			case 2:
				int p= cuFun.bookCustomerRoom();
				System.out.println("The total cost u have to pay is:"+p);
				break;
			case 3:
				int i=0;
				List<CustomerDetails> cList = cuFun.getAllCustomerDetails();
				for(CustomerDetails people :cList) {
					i++;
				}
				int room=9-i;
				if(room>0)
					System.out.println("Number of vacant room are: "+room);
				else
					System.out.println("No vacant room is available");
				break;
			case 4:
				CustomerDetails cus = update();
				int result1 = cuFun.updateCustomerDetails(cus);
				if (result1 > 0) {
					System.out.println("Customer Details Added Successfully....");
				} else {
					System.out.println("Try to Add Again....");
				}
				break;
			case 5:
				List<CustomerDetails> cuList = cuFun.getCustomerDetailsByDate();
				for(CustomerDetails r :cuList) {
					System.out.println(r);
				}
				break;
			case 6:
				List<CustomerDetails> custList = cuFun.getAllCustomerDetails();
				for(CustomerDetails people :custList) {
					System.out.println(people);
				}
				break;
			case 7:
				break;
			}System.out.println("Do you want to Continue  1. Yes \t 2. No");
		}while (scanner.nextInt() == 1);
	}
	static CustomerDetails inputMet() throws ParseException {
		System.out.println("Enter Associates Details :");
		System.out.print("ID :");
		int id = scanner.nextInt();
		System.out.println("Name : ");
		String name = scanner.next();
		System.out.println("Email : ");
		String email = scanner.next();
		System.out.println("Mobile : ");
		long mobile = scanner.nextLong();
		System.out.println("Entry Date (dd/MM/yyyy): ");
		String jd = scanner.next();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date entryDate = sdf.parse(jd);
		System.out.println("Enter the location: ");
		String location=scanner.next();
		CustomerDetails customer = new CustomerDetails(id, name, email, mobile, entryDate, location);
		return customer;
	}
	static CustomerDetails update() {
		System.out.println("Enter the id:");
		int id= scanner.nextInt();
		System.out.println("Enter the new email:");
		String email= scanner.next();
		CustomerDetails cus= new CustomerDetails(id, email);
		return cus;
	}

}
