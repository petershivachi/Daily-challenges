import java.util.Scanner;

public class MyPerson
{
    public static void main(String args[])
    {
        Scanner inputTaker = new Scanner(System.in);

        Age age1 = new Age();
        Age age2 = new Age();
        int theAge1, theAge2;

        age1.setAge(23);

        System.out.println("\nEnter the age of the second person:> ");
        theAge2 = inputTaker.nextInt();

        age2.setAge(theAge2);

        theAge1 = age1.getAge();

        System.out.println("\nThe first person is "+theAge1+" years old.");
        System.out.println("\nThe second person is "+age2.getAge()+"  years old.");


    }
}
