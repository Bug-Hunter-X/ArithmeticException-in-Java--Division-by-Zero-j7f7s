public class MyClass {
    public static void main(String[] args) {
        int i = 10;
        int j = 0;
        int k = 0;
        try {
            k = i / j;
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero.");
            k = Integer.MAX_VALUE; // Or handle in another way
        }
        System.out.println(k);
    }
}