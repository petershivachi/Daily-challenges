public class MotorCycle
{
    private String make, color;
    private boolean state;

    public void setValues(String theMake, String theColor, boolean theState)
    {
        make =  theMake;
        color = theColor;
        state = theState;
    }

    public void setValues(String theMake, String theColor)
    {
        color = theColor;
        make = theMake;
    }

    public  void startEngine()
    {
        if (state == true)
            System.out.println("\nThe engine is already on.");
        else
            {
                state = true;
                System.out.println("\nThe engine is now on.");
            }
    }

    public void setAttributes()
    {
        System.out.println("\nThe motorcycle is a "+color+" "+make);
        if (state == true)
            System.out.println("\n The engine is on.");
        else
            System.out.println("\nThe engine is off");
    }
}
