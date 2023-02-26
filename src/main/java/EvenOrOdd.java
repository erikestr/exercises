public class EvenOrOdd {
    public static void main(String[] args) {
        System.out.println("checkNumber(12) = " + checkNumber(12));
        System.out.println("checkNumber(10) = " + checkNumber(10));
        System.out.println("checkNumber(1) = " + checkNumber(1));
    }

    public static String checkNumber(int number) {
        return number % 2 == 0 ? "Odd" : "Even";
    }
}
