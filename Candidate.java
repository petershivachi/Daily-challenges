import java.util.Scanner;

public class Candidate
{
    private String admin,name,date_of_birth;
    private int marks;

    public void dataOut()
    {
        System.out.println("\nStudent;s Admission Number:> ");
        System.out.println("\nStudent's Name:> ");
        System.out.println("\nMarks scored by the student:> ");
    }

    public void compute()
    {
        if(marks >= 50)
            System.out.println("\nTHe students passed.");
        else if (marks <= 50)
            System.out.println("\nSorry, you didn't attain the minimum score. ");
        else
            System.out.println("'\nINVALID ENTRY");
    }

    public void set(String adm_no, String stud_name, String dob, int marks_scored)
    {
        adm_no =admin;
        stud_name = name;
        dob = date_of_birth;
    }

    public void dataIn()
    {
        Scanner inputTaker = new Scanner(System.in);
        System.out.println("\n Admission:> ");
        admin = inputTaker.nextLine();
        System.out.println("\nName:> ");
        name =inputTaker.nextLine();
        System.out.println("\nD.o.B:> ");
        date_of_birth = inputTaker.nextLine();
    }
}

