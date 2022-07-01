public class Recursion {
    public static void main(final String[] args) {
        System.out.println(factorial(10));
    }

    public static Integer factorial(final Integer i) {
        if(i <= 1) {
            return i;
        }
        else {
            return i * factorial(i - 1);
        }
    }
}
