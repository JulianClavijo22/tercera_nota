package company.main;

import company.hr.Employee;

public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Alice", "Developer", 2000);
        Employee emp2 = new Employee("Bob", "Manager", 3000);

        emp1.increaseSalary(500);
        emp2.increaseSalary(-100); // Should not increase

        System.out.println("Employee 1: " + emp1.name + ", Role: " + emp1.getRole() + ", Salary: $" + emp1.getSalary());
        System.out.println("Employee 2: " + emp2.name + ", Role: " + emp2.getRole() + ", Salary: $" + emp2.getSalary());
    }