import java.util.Scanner;

public class Employee
{
    private String employee_id, employee_name, employee_DoB, department;
    private double basic_salary, allowances, gross_salary, tax, net_salary;

    public void dataIntake()
    {
        Scanner inputTaker = new Scanner(System.in);

        System.out.println("\n Employees name :>");
        employee_id = inputTaker.nextLine();
        System.out.println("\n Employee ID :>");
        employee_name = inputTaker.nextLine();
        System.out.println("\n Employee DoB :>");
        employee_DoB = inputTaker.nextLine();
        System.out.println("\nDepartment :>");
        department = inputTaker.nextLine();
        System.out.println("Basic salary :>");
        basic_salary = inputTaker.nextDouble();
        System.out.println("\n Allowances :>");
        allowances = inputTaker.nextDouble();
    }

    public void compute()
    {
        gross_salary = basic_salary + allowances;

        if (gross_salary < 50000)
            tax = 5/100 * gross_salary;
        else if (gross_salary > 50000 && gross_salary < 100000)
            tax = 10/100 * gross_salary;
        else if (gross_salary > 100 && gross_salary < 250000)
            tax = 15/100 * gross_salary;
        else if (gross_salary > 250000 && gross_salary < 300000)
            tax = 20/100 * gross_salary;
        else if (gross_salary > 300000)
            tax = 24/100 * gross_salary;

        net_salary = gross_salary - tax;
    }

    public void dataOutput()
    {
        System.out.println("\nEmployee's ID :>"+employee_id);
        System.out.println("\nEmployee's Name:> "+employee_name);
        System.out.println("\nEmployee's DoB :>"+employee_DoB);
        System.out.println("\nEmployee's Basic Salary :>"+basic_salary);
        System.out.println("\nEmployee's Allowances :>"+allowances);
        System.out.println("\nEmployee's Gross Salary :>"+gross_salary);
        System.out.println("\nEmployee's Tax Amount :>"+tax);
        System.out.println("\nEmployee's Net Salary :>"+net_salary);
    }

}
