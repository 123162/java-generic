package generic;

public class Generic {

    public static < E> void print(E[] input) {
        // Display array elements
        for (E element : input) {
            System.out.printf("%s ", element);
        }
        System.out.println();
    }

    public static void main(String args[]) {
        // Create arrays of Integer, Double and Character
        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4};
        Character[] charArray = {'H', 'E', 'L', 'L', 'O'};

        System.out.println("Array integerArray contains:");
        print(intArray);   // pass an Integer array

        System.out.println("\nArray doubleArray contains:");
        print(doubleArray);   // pass a Double array

        System.out.println("\nArray characterArray contains:");
        print(charArray);   // pass a Character array
    }
}
