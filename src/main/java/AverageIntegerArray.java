import java.util.Arrays;
import java.util.Iterator;

public class AverageIntegerArray {

    public static void main(String[] args) {
        int[] numbers = {1,2,54, 6, 7};

        System.out.println("Average not using Stream() = " + averageNotUsingStream(numbers));
        System.out.println("Average using Stream() = " + averageUsingStream(numbers));
    }

    public static String averageNotUsingStream(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        double average = sum / numbers.length;

        Arrays.sort(numbers);
        return "Average of "+ Arrays.toString(numbers) + ": "+ average;
    }

    public static String averageUsingStream(int[] numbers) {
        Arrays.sort(numbers);
        return "Average of "+ Arrays.toString(numbers) + ": " + Arrays.stream(numbers).average();
    }
}
