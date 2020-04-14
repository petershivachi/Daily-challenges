import java.util.Scanner;

class Statistics
{
    public static void main(String args[])
    {
        Scanner inputTaker = new Scanner(System.in);
        double num[], largest, smallest, average, sum = 0;
        int all, k;

        System.out.println("\nEnter the number of items you want to work with:>");
        all = inputTaker.nextInt();

            num = new double[all];

        for (k = 0 ; k < all ; k++)
        {
            System.out.println("item "+(k+1)+" :> ");
            num[k] = inputTaker.nextDouble();
        }

        largest = smallest = num[0];

        for (k = 0 ; k < all ; k++)
        {
            sum = sum + num[k];
            if (smallest < num[0])
                smallest = num[0];
            else if (largest > num[0])
                largest = num[0];
        }

        average = sum / all;

        System.out.println("The items you entered are:>");
        for(k = 0; k < all; k++)
        {
            System.out.println(num[k]+"");
        }

        System.out.println("\n The smallest number from your entry is :>"+smallest);
        System.out.println("\n The largest number from your entry is:> "+largest);
        System.out.println("\n The sum of numbers from your entry  is:> "+sum);
        System.out.println("\n The average of the numbers from your entry is:> "+average);
    }
}
