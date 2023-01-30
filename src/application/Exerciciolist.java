package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entitties.Employee;

public class Exerciciolist {

	public static void main(String[] args) {

		List<Employee> List = new ArrayList<>();

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// PARTE 01

		System.out.print("How many employees will be registred? ");
		int N = sc.nextInt();
		
		for (int i = 0; i < N; i++) {
			System.out.println("Employee #" + (i + 1) + ":"); // duvida
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();

			Employee emp = new Employee(id, name, salary);

			List.add(emp);

		}
		
		System.out.println("Enter the employee i that will have salary increase: ");
		int salary = sc.nextInt();
		

		int idsalary = sc.nextInt();
		Integer pos = position(List, idsalary);
		if (pos == null) {
			System.out.print("This id does not exist!");
		} else {
			System.out.print(" Enter the percentage");
			double percent = sc.nextDouble();
			List.get(pos).increaseSalary(percent);

		}

		System.out.println();
		System.out.println("List of employees");
		for (Employee emp : List) {
			System.out.println(emp);
		}
		sc.close();

	}

	public static Integer position(List<Employee> list, int id) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}

}
