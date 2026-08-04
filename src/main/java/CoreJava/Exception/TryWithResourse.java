package CoreJava.Exception;

import java.io.FileReader;

public class TryWithResourse
{
    public static void main(String[] args)
    {
        try(FileReader fr = new FileReader("src/main/java/CoreJava/Exception/test.txt"))
        {
            char[] a = new char[500];
            fr.read(a);
            int i = 0;
            while(a[i] != '\0')
                System.out.print(a[i++]);
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
