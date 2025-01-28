
    public class DataTypesDemo {
        public static void main(String[] args) {
            // byte: 8-bit integer
            byte byteVar = 100;
            System.out.println("byte value: " + byteVar);
    
            // short: 16-bit integer
            short shortVar = 10000;
            System.out.println("short value: " + shortVar);
    
            // int: 32-bit integer
            int intVar = 100000;
            System.out.println("int value: " + intVar);
    
            // long: 64-bit integer
            long longVar = 10000000000L;
            System.out.println("long value: " + longVar);
    
            // float: 32-bit floating-point
            float floatVar = 10.5f;
            System.out.println("float value: " + floatVar);
    
            // double: 64-bit floating-point
            double doubleVar = 10.55555;
            System.out.println("double value: " + doubleVar);
    
            // char: 16-bit Unicode character
            char charVar = 'A';
            System.out.println("char value: " + charVar);
    
            // boolean: true or false
            boolean booleanVar = true;
            System.out.println("boolean value: " + booleanVar);
    
            // Demonstrating type casting
            int castedVar = (int) floatVar; // Casting float to int
            System.out.println("Casted float to int: " + castedVar);
    
            // Demonstrating String usage (not a primitive type, but commonly used)
            String stringVar = "Hello, World!";
            System.out.println("String value: " + stringVar);
    
            // Array (not a primitive type, but essential in Java)
            int[] arrayVar = {1, 2, 3, 4, 5};
            System.out.print("Array values: ");
            for (int num : arrayVar) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

