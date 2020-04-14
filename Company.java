public class Company
{
    public static void main(String[] args)
    {
       Employee employee1 = new Employee();
       Employee employee2 = new Employee();
       Employee employee3 = new Employee();
       Employee employee4 = new Employee();
       Employee employee5 = new Employee();

       System.out.println("\nData Entry for the first Employee :>");
       System.out.println("\n-------------------------------------");
       employee1.dataIntake();
       employee1.compute();

       System.out.println("Data entry for the second employee :>");
       System.out.println("\n------------------------------------");
       employee2.dataIntake();
       employee2.compute();

       System.out.println("Data entry for the third employee :>");
       System.out.println("\n------------------------------------");
       employee3.dataIntake();
       employee3.compute();

       System.out.println("Data entry for the fourth employee :>");
       System.out.println("\n------------------------------------");
       employee4.dataIntake();
       employee4.compute();

       System.out.println("Data entry for the fifth employee :>");
       System.out.println("\n------------------------------------");
       employee5.dataIntake();
       employee5.compute();

       System.out.println("\nData Analysis for the first employee :>");
       System.out.println("\n---------------------------------------");
       employee1.dataOutput();

       System.out.println("\nData Analysis for the second employee :>");
       System.out.println("\n---------------------------------------");
       employee2.dataOutput();

       System.out.println("\nData Analysis for the third employee :>");
       System.out.println("\n---------------------------------------");
       employee3.dataOutput();

       System.out.println("\nData Analysis for the fourth employee :>");
       System.out.println("\n---------------------------------------");
       employee4.dataOutput();

       System.out.println("\nData Analysis for the fifth employee :>");
       System.out.println("\n---------------------------------------");
       employee5.dataOutput();

    }
}
