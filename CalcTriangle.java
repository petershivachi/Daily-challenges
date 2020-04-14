public class CalcTriangle
{
    public static void main(String args[])
    {
        Triangle triangle1 = new Triangle();
        Triangle triangle2 = new Triangle();
        Triangle triangle3 = new Triangle();
        Triangle triangle4 = new Triangle();
        Triangle triangle5 = new Triangle();

        System.out.println("\nData entry for the first triangle:>");
        System.out.println("--------------------------------------");
        triangle1.dataIn();
        System.out.println("\n--------------------------------------");
        System.out.println("\nData entry for the second triangle:>");
        System.out.println("--------------------------------------");
        triangle2.dataIn();
        System.out.println("\n--------------------------------------");
        System.out.println("\nData entry for the third triangle:>");
        System.out.println("--------------------------------------");
        triangle3.dataIn();
        System.out.println("\n--------------------------------------");
        System.out.println("\nData entry for the fourth triangle:>");
        System.out.println("--------------------------------------");
        triangle4.dataIn();
        System.out.println("\n--------------------------------------");
        System.out.println("\nData entry for the fifth triangle:>");
        System.out.println("--------------------------------------");
        triangle4.dataIn();
        System.out.println("--------------------------------------");

        System.out.println("\n The output for the first triangle:>");
        System.out.println("--------------------------------------");
        triangle1.compute();
        triangle1.dataOut();
        System.out.println("\n--------------------------------------");
        System.out.println("\n The output for the second triangle:>");
        System.out.println("--------------------------------------");
        triangle2.compute();
        triangle2.dataOut();
        System.out.println("\n--------------------------------------");
        System.out.println("\n The output for the third triangle:>");
        System.out.println("--------------------------------------");
        triangle3.compute();
        triangle3.dataOut();
        System.out.println("\n--------------------------------------");
        System.out.println("\n The output for the fourth triangle:>");
        System.out.println("--------------------------------------");
        triangle4.compute();
        triangle4.dataOut();
        System.out.println("\n--------------------------------------");
        System.out.println("\n The output for the fifth triangle:>");
        System.out.println("--------------------------------------");
        triangle5.compute();
        triangle5.dataOut();

    }
}
