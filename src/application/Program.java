package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Address;
import entities.Department;
import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Nome do departamento: ");
		String departamentName = sc.next();
		System.out.print("Dia do pagamento: ");
		int payDay = sc.nextInt();
		System.out.print("Email: ");
		String email = sc.next();
		System.out.print("Telefone: ");
		int phone = sc.nextInt();
		Department department = new Department(departamentName, payDay, new Address(email, phone));

		System.out.print("Quantos funcionários tem o departamento? ");
		int quantity = sc.nextInt();

		for (int i = 1; i <= quantity; i++) {
			System.out.println("Dados do funcionário " + i + ":");
			System.out.print("Nome: ");
			sc.nextLine();
			String employeeName = sc.nextLine();
			System.out.print("Salário: ");
			double salary = sc.nextDouble();
			department.addEmployee(new Employee(employeeName, salary));
		}

		showReport(department);

		sc.close();
	}

	public static void showReport(Department departament) {
		
		System.out.println("\nFOLHA DE PAGAMENTO: ");
		System.out.printf("Departamento Vendas = R$ %.2f%n", departament.payRoll());
		System.out.printf("Pagamento realizado no dia %d", departament.getPayDay());
		System.out.println("\nFuncionários: ");
		
		for (int i = 0; i < departament.getEmployees().size(); i++) {
			System.out.println(departament.getEmployees().get(i).getName());
		}
		
		System.out.println("Para dúvidas favor entrar em contato: vendas@lojatop.com ");
	}
}
