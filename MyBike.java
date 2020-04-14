public class MyBike
{
    public static void main(String args[])
    {
        MotorCycle Bike1 = new MotorCycle();
        MotorCycle Bike2 = new MotorCycle();
        MotorCycle Bike3 = new MotorCycle();

        Bike1.setValues("Suzuki", "black");
        Bike2.setValues("BMW 560", "blue");
        Bike3.setValues("Kawasaki", "red");

        System.out.println("\nCalling showAttributes");
        System.out.println("\n----------------------------");
        Bike1.setAttributes();
        Bike2.setAttributes();
        Bike3.setAttributes();

        System.out.println("\n-----------------------------");
        Bike1.startEngine();
        Bike2.startEngine();
        Bike3.startEngine();

        System.out.println("\n----------------------------");
        Bike1.setAttributes();
        Bike2.setAttributes();
        Bike3.setAttributes();

        System.out.println("\n------------------------------");
        Bike1.startEngine();
        Bike2.startEngine();
        Bike3.startEngine();

    }
}
