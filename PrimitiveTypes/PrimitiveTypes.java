package PrimitiveTypes;

public class PrimitiveTypes {

    public static void main(String... args) {
        // Whole number types
        byte byteType = 0;
        short shortType = 1;
        int intType = 2;
        long longType = 3l;

        System.out.println("Byte min value is: " + Byte.MIN_VALUE + " and Byte max value is: " + Byte.MAX_VALUE);
        System.out.println("Short min value is: " + Short.MIN_VALUE + " and Short max value is: " + Short.MAX_VALUE);
        System.out.println("int min value is: " + Integer.MIN_VALUE + " and int max value is: " + Integer.MAX_VALUE);
        System.out.println("long min value is: " + Long.MIN_VALUE + " and long max value is: " + Long.MAX_VALUE);

        // Real number types (floating point or decimal)
        float floatType = 1.2f;
        double doubleType = 1.2;

        System.out.println("float min value is: " + Float.MIN_VALUE + " and float max value is: " + Float.MAX_VALUE);
        System.out
                .println("double min value is: " + Double.MIN_VALUE + " and double max value is: " + Double.MAX_VALUE);

        // single character type
        char charType = 'x';

        // boolean type
        boolean booleanType = true; // true or false

        // Obs: Primitive Types CANNOT be null (Different than Wrappers)
    }
}
