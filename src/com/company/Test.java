package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.company.controllers.GeneralController;
import com.company.data.PostgresDB;
import com.company.data.interfaces.IDB;
import com.company.entity.trains.Passenger;

public class Test {

	public static void main(String[] args) {
		 IDB con = new PostgresDB(); // created our database
		 GeneralController controller = new GeneralController(con);
		 Scanner scanner = new Scanner(System.in);
		 System.out.println("Select id of your company");
		 int n = scanner.nextInt();
		 System.out.println(controller.getTotalPriceOfCompany(n));
     
		 
	}

}
