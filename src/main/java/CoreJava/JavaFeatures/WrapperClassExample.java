package CoreJava.JavaFeatures;

import java.math.BigDecimal;
import java.math.BigInteger;

public class WrapperClassExample {
    public static void main(String[] args) {
        // Autoboxing: Converting primitives into wrapper objects
        int intPrimitive = 5;
        Integer intWrapper = intPrimitive; // Autoboxing
        System.out.println("Integer wrapper: " + intWrapper); // Output: Integer wrapper: 5

        // Unboxing: Converting wrapper objects into primitives
        //Integer anotherIntWrapper = new Integer(10); -> Deprecated
        Integer anotherIntWrapper = Integer.valueOf(10);
        int anotherIntPrimitive = anotherIntWrapper; // Unboxing
        System.out.println("Primitive int: " + anotherIntPrimitive); // Output: Primitive int: 10

        //Integer Cached -128 to 127 object
        Integer a = 127;
        Integer b = 127;
        System.out.println("a == b -> " + (a == b));

        //So better if you want value comparison then use .equals()
        Integer c = 1201;
        Integer d = 1201;
        System.out.println("Value comparison c == d -> " + c.equals(d));

        //Null Wrapper Error: But what if Wrapper class hold null value and we do unboxing
        int e;
        Integer nullVar = null;
        try
        {
            e = nullVar;
        }
        catch (NullPointerException ex)
        {
            System.out.println("Null pointer Exception Caught:" + ex.getMessage());
        }

        // Using wrapper class methods
        String str = "123";
        int parsedInt = Integer.parseInt(str);
        System.out.println("Parsed int: " + parsedInt); // Output: Parsed int: 123

        // Using constants from wrapper classes
        System.out.println("Integer MAX_VALUE: " + Integer.MAX_VALUE); // Output:Integer MAX_VALUE: 2147483647
        System.out.println("Double MIN_VALUE: " + Double.MIN_VALUE); // Double MIN_VALUE: 4.9E-324

        //
        BigDecimal x = new BigDecimal("123456789123456789123456789.123456789");
        BigDecimal y = new BigDecimal("123456789123456789123456789.123456789");

        System.out.println("Sum of big Decimal is " + x.add(y));

        BigInteger x1 = new BigInteger("123456789123456789123456789");
        BigInteger y1 = new BigInteger("123456789123456789123456789");

        System.out.println("Sum of big Integer is " + x1.add(y1));
    }
}
