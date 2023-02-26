import java.util.Arrays;

public class SortArray {

    public static void main(String[] args) {

        int[] example = {2,4,1,0,5};

        System.out.println("This repeatedly compare each pair of adjacent elements and swaps them if the are in the wrong " +
                "order");
        System.out.println(Arrays.toString(example)+" >>> "+ bubble(example));
        System.out.println(Arrays.toString(example)+" >>> "+ bubbleEfficient(example));
    }

    public static String bubble(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length - 1; j++) {
//                System.out.println("Arrays.toString(numbers[j]) = " + numbers[j] + " > " + numbers[j + 1]);
                if ( numbers[j] > numbers[j + 1]) {
                    Integer temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }

        return "Bubble Sort:            " + Arrays.toString(numbers);
    }

    public static String bubbleEfficient(int[] array) {
        int arrayLength = array.length;
        boolean intercambiado;

        do {
            intercambiado = false;
            for (int i = 0; i < arrayLength - 1; i++) {
                if (array[i] > array[i + 1]) {
                    // Intercambiamos los elementos
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    intercambiado = true;
                }
            }
        } while (intercambiado);

        return "Bubble Sort Efficient:  " + Arrays.toString(array);
    }
}
