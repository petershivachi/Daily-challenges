import java.util.Scanner;

public class School
{
    private String students_id, students_name, subject[], students_DoB, year_of_exam;
    private double marks[];
    private int all, j;

    public void dataIn()
    {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("\nEnter the students registration number:> ");
        students_id = myScanner.nextLine();
        System.out.println("\nEnter the students name :>");
        students_name = myScanner.nextLine();
        System.out.println("\nEnter the students DoB :>");
        students_DoB = myScanner.nextLine();
        System.out.println("\nEnter the students year of exam");
        year_of_exam = myScanner.nextLine();
        System.out.println("\nEnter the subjects taken by the student:>");
        all = myScanner.nextInt();

        subject = new String[all];

        for (j = 0; j < all; j++)
        {
            System.out.println("\nSubject"+(j+1)+":>");
            subject[j] = myScanner.nextLine();
        }

        for (j = 0; j < all; j++)
        {
            System.out.println("\nProvide marks for subject"+(j+1)+":>");
            marks[j] = myScanner.nextDouble();
        }
    }

    public void compute()
    {
        //Scanner inputTaker = new Scanner(System.in);
        //subject = new double[all];

        /*for (j = 0; j < all; j++)
        {
            System.out.println("\nSubject"+(j+1)+":>");
            subject[j] = inputTaker.nextDouble();
        }

        /*for (j = 0; j < all; j++)
        {
            System.out.println("\nProvide marks for subject"+(j+1)+":>");
            marks = inputTaker.nextDouble();
        }*/

        /*Generating the grading system*/
        while (marks[3] > marks[4] && marks[3] > marks[5])
        {
            System.out.println(marks[3]);
            if (marks[4] > marks[5])
                System.out.println(marks[4]);
            //else if (marks[])*/
        }
    }
}
