package Day6;

public class Wrapperclas {
    public static void main(String[] args) {
        
        // Primitive data types
        int primitiveInt = 10;
        double primitiveDouble = 5.5;
        char primitiveChar = 'A';
        boolean primitiveBoolean = true;

        // Autoboxing: converting primitives to wrapper class objects
        Integer wrappedInt = primitiveInt;          // int -> Integer
        Double wrappedDouble = primitiveDouble;     // double -> Double
        Character wrappedChar = primitiveChar;      // char -> Character
        Boolean wrappedBoolean = primitiveBoolean;  // boolean -> Boolean

        // Displaying wrapper class objects
        System.out.println("Wrapped Integer: " + wrappedInt);
        System.out.println("Wrapped Double: " + wrappedDouble);
        System.out.println("Wrapped Character: " + wrappedChar);
        System.out.println("Wrapped Boolean: " + wrappedBoolean);

        // Unboxing: converting wrapper class objects back to primitives
        int unboxedInt = wrappedInt;          
        double unboxedDouble = wrappedDouble;
        char unboxedChar = wrappedChar;
        boolean unboxedBoolean = wrappedBoolean;

        // Displaying unboxed primitive values
        System.out.println("Unboxed int: " + unboxedInt);
        System.out.println("Unboxed double: " + unboxedDouble);
        System.out.println("Unboxed char: " + unboxedChar);
        System.out.println("Unboxed boolean: " + unboxedBoolean);
    }
}
