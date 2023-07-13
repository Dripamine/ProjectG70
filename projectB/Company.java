//------------------------------------------------
// ProjectB, Programming 2
// © Boudribila
// Written by: Boudribila, Mohamed Amine / 1665604
//  This Java file implements the company management system, allowing the user to manipulate employees information from the employeeList.txt file.
//------------------------------------------------

package projectB;

import java.io.*;
import java.util.*;

public class Company {

	// List to store employee information
	private static List<Employee> employeeList = new ArrayList<>();

	public static void main(String[] args) {

		System.out.println("Welcome to the Company Management System!");

		Scanner kb = new Scanner(System.in);
		int option = 0;

		do {
			// menu options
			System.out.println("\nWhat would you like to do today?");
			System.out.println("1. List employees hired after a particular date");
			System.out.println("2. Add employee information to the records");
			System.out.println("3. Display every employee information stored in the records.");
			System.out.println("4. Exit");
			System.out.println();
			System.out.print("Please enter a number: ");

			option = kb.nextInt();
			kb.nextLine();

			switch (option) {
			case 1:
				listEmployeesAfterDate();
				break;
			case 2:
				addEmployeeInformation();
				break;
			case 3:
				printAllEmployeeInformation();
				break;
			case 4:
				System.out.println("Goodbye!");
				break;
			default:
				System.out.println("Invalid option. Please try again.");
				break;
			}
		} while (option != 4);

		kb.close();
	}

	// method to display employees after specified date
	private static void listEmployeesAfterDate() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the date (format: MM/DD/YYYY):");
		String inputDate = scanner.nextLine();

		Date date = parseDate(inputDate);

		List<Employee> employeesAfterDate = new ArrayList<>();
		for (Employee employee : employeeList) {
			// checks for the wanted employees
			if (employee.getHiredDate().compareTo(date) > 0) {
				employeesAfterDate.add(employee);
			}
		}

		// print wanted employees hired after the specified date
		System.out.println("Employees hired after " + date + ":");
		for (Employee employee : employeesAfterDate) {
			System.out.println(employee);
		}

		scanner.close();
	}

	// ask the user to enter the employee details he wants to add to the employee
	// list
	private static void addEmployeeInformation() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter employee name:");
		String name = scanner.nextLine();

		System.out.println("Enter employee ID:");
		int id = scanner.nextInt();
		scanner.nextLine();

		System.out.println("Enter the hired date (format: MM/DD/YYYY):");
		String inputDate = scanner.nextLine();
		Date hiredDate = parseDate(inputDate);

		System.out.println("Enter employee position:");
		String position = scanner.nextLine();

		// Creating an Employee object and adding it to the employeeList
		Employee employee = new Employee(name, id, hiredDate, position);
		employeeList.add(employee);

		try (PrintWriter writer = new PrintWriter(new FileWriter("employeeList.txt", true))) {
			writer.println(employee);
			System.out.println("Employee information added to employeeList.txt.");
		} catch (IOException e) {
			System.out.println("Failed to write employee information to file: " + e.getMessage());
		}

		scanner.close();
	}

	// method to read and print data from the txt file
	private static void printAllEmployeeInformation() {
		try (Scanner fileScanner = new Scanner(new File("employeeList.txt"))) {
			System.out.println("Employee information:");
			while (fileScanner.hasNextLine()) {
				String employeeInfo = fileScanner.nextLine();
				System.out.println(employeeInfo);
			}
		} catch (FileNotFoundException e) {
			System.out.println("Employee information file not found: " + e.getMessage());
		}
	}

	// method to create new objects from string date
	private static Date parseDate(String inputDate) {
		String[] parts = inputDate.split("/");
		int month = Integer.parseInt(parts[0]);
		int day = Integer.parseInt(parts[1]);
		int year = Integer.parseInt(parts[2]);
		return new Date(month, day, year);
	}
}
