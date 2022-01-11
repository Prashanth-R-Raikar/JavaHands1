package com.cognizant;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class CustomerImpl implements CustomerFunction {
	Connection connection;
	static int price;
	
	public CustomerImpl() {
		this.connection = ConnectDemo.createConn();
	}


	@Override
	public int addCustomerDetails(CustomerDetails customer) {
		int result = 0;
		try {
			PreparedStatement ps = connection.prepareStatement("insert into associates values(?,?,?,?,?,?)");
			ps.setInt(1, customer.getId());
			ps.setString(2, customer.getName());
			ps.setString(3, customer.getEmail());
			ps.setLong(4, customer.getMobile());
			java.sql.Date jd = new java.sql.Date(customer.getEntryDate().getTime());
			ps.setDate(5, jd);
			ps.setString(6,customer.getLocation());
			result = ps.executeUpdate();
		} catch (Exception e) {
			System.out.println("Error in Add Associates...: " + e);
		}
		return result;
	}

	@Override
	public List<CustomerDetails> getAllCustomerDetails() {
		List<CustomerDetails> cList = new ArrayList<>();
		try {
			Statement st = connection.createStatement();
			ResultSet rs = st.executeQuery("select * from associates");
			while (rs.next()) {
				CustomerDetails customer = new CustomerDetails(0, null, null, 0, null, null);
				customer.setId(rs.getInt(1));
				customer.setName(rs.getString(2));
				customer.setEmail(rs.getString(3));
				customer.setMobile(rs.getLong(4));
				customer.setEntryDate(rs.getDate(5));
				customer.setLocation(rs.getString(6));
				cList.add(customer);
			}
		} catch (Exception e) {
			System.out.println("Error in Get All : " + e);
		}
		return cList;
	}

	@Override
	public List<CustomerDetails> getCustomerDetailsByDate() {
		List<CustomerDetails> cList = new ArrayList<>();
		String date1;
		String date2;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the first date:");
		date1=sc.nextLine();
		System.out.println("Enter the second date:");
		date2=sc.nextLine();
		CustomerDetails customer = new CustomerDetails();
		try {
			PreparedStatement pst = connection.prepareStatement("select * from customer where entryDate between ? and ?;");
			java.sql.Date jd = new java.sql.Date(customer.getEntryDate().getTime());
			pst.setDate(1, jd);
			java.sql.Date jd1 = new java.sql.Date(customer.getEntryDate().getTime());
			pst.setDate(2, jd1);
			ResultSet rs = pst.executeQuery();
			if (rs.next()) {
				customer.setId(rs.getInt(1));
				customer.setName(rs.getString(2));
				customer.setEmail(rs.getString(3));
				customer.setMobile(rs.getLong(4));
				customer.setEntryDate(rs.getDate(5));
				customer.setLocation(rs.getString(6));
				cList.add(customer);
			}
		} catch (Exception e) {
			System.out.println("Error in Get By Date : " + e);
		}
		return cList;
	}

	@Override
	public int updateCustomerDetails(CustomerDetails cus) {
		int result = 0;
		try {
			String qry = "update associates set email=? where id=?";
			PreparedStatement ps = connection.prepareStatement(qry);
			ps.setString(1, cus.getEmail());
			ps.setInt(2, cus.getId());
		} catch (Exception e) {
			System.out.println("Error in Update Associates...: " + e);
		}
		return result;
	}

	@Override
	public int bookCustomerRoom() {
		System.out.println("Choose a type of room: \n 1. AC Rooms \n 2. Non-AC Rooms");
		Scanner sc =new Scanner(System.in);
		int a=sc.nextInt();
		switch(a) {
		case 1:
			price=1000;
			System.out.println("Choose the service you want: \n 1. Wifi \n 2. Hot_Water \n 3. T.V. \n 4. Laundry service");
			int b=sc.nextInt();
			switch(b) {
			case 1:
				System.out.println("Wifi service will be provided to you.");
				price=price+150;
				break;
			case 2:
				System.out.println("Hot water service will be provided to you.");
				price=price+150;
				break;
			case 3:
				System.out.println("T.V. service will be provided to you.");
				price=price+150;
				break;
			case 4:
				System.out.println("Laundry service will be provided to you.");
				price=price+250;
				break;
			}
			break;
		case 2:
			price=700;
			System.out.println("Choose the service you want: \n 1. Wifi \n 2. Hot_Water \n 3. T.V. \n 4. Laundry service");
			int c=sc.nextInt();
			switch(c) {
			case 1:
				System.out.println("Wifi service will be provided to you.");
				price=price+150;
				break;
			case 2:
				System.out.println("Hot water service will be provided to you.");
				price=price+150;
				break;
			case 3:
				System.out.println("T.V. service will be provided to you.");
				price=price+150;
				break;
			case 4:
				System.out.println("Laundry service will be provided to you.");
				price=price+250;
				break;
			}
			break;
		}
		return price;
	}
	

}
