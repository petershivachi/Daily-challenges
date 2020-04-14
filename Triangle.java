import java.util.Scanner;

public class Triangle
{
    private double base, height, hypotenuse;
    private double area, perimeter;

    public void dataIn()
    {
        Scanner inputTaker = new Scanner(System.in);

        System.out.println("\nProvide the base of the triangle:>");
        base = inputTaker.nextDouble();
        System.out.println("\nProvide the height of the triangle:>");
        height = inputTaker.nextDouble();
    }

    public void compute()
    {
        hypotenuse = Math.sqrt(Math.pow(base,2) + Math.pow(height,2));
        area = 1/2.0 * base * height;
        perimeter = base + height + hypotenuse;
    }

    public void dataOut()
    {
        System.out.println("\nBase = "+base);
        System.out.println("\nHeight = "+height);
        System.out.println("\nHypotenuse = "+hypotenuse);
        System.out.println("\nPerimeter = "+perimeter);
    }
}
