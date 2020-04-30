package com.cognizant.main;

import java.util.Scanner;

import com.cognizant.accessory.repair.AccessoryRepair;
import com.cognizant.accessory.repair.AccessoryRepairImpl;
import com.cognizant.order.Order;
import com.cognizant.order.OrderImpl;
import com.cognizant.phone.repair.PhoneRepair;
import com.cognizant.phone.repair.PhoneRepairImpl;

public class Main {
	private static AccessoryRepair accessoryRepair = new AccessoryRepairImpl();
	private static Order order = new OrderImpl();
	private static PhoneRepair phoneRepair = new PhoneRepairImpl();

	public static void main(String[] args) {
		System.out.println("Welcome to Our Site....Would you like to order or repair??");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String option = sc.nextLine();
		if (option.equalsIgnoreCase("Order")) {
			System.out.println("Please provide the phone model name");
			String model = sc.nextLine();
			order.processOrder(model);

		} else if (option.equalsIgnoreCase("Repair")) {
			System.out.println("Is it the phone or accessory what you want to repair???");
			String productType = sc.nextLine();
			if (productType.equalsIgnoreCase("Accessory")) {

				System.out.println("Please provide the Accessory Name");
				String accessory = sc.nextLine();
				accessoryRepair.processAccessoryRepair(accessory);
			} else if (productType.equalsIgnoreCase("Phone")) {
				System.out.println("Please provide the phone model name");
				String phoneModel = sc.nextLine();
				phoneRepair.processPhoneRepair(phoneModel);
			}
		}

	}

}
