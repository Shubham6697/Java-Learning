package CoreJava.Exception;

public class PlayWithException
{
    public static void main(String[] args)
    {
        try
        {
            int num = 10 / 0;
        }
        catch(ArithmeticException e)
        {
            System.out.println("ArithmeticException occurred: " + e.getMessage());
            //System.exit(0);
            //while(true);
        }
        finally
        {
            System.out.println("Finally executed");
        }
    }
}
