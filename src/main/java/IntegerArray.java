import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class IntegerArray {

    public static void main(String[] args) {
        int[] example = {2,4,1,0,5};

        System.out.println("The highest is: "+ getHighest(example));
        System.out.println("The second highest is: "+ getSecondHighest(example));

        IntegerArray.iteratorStreams(example);

        IntegerArray.summaryOfInputOnArray();
    }

    public static int getHighest(int[] array) {
        boolean continueConditional;

        do {
            continueConditional = false;
            for (int repeat = 0; repeat < array.length-1; repeat++) {
                if(array[repeat] > array[repeat + 1]){
                    int temp = array[repeat];
                    array[repeat] = array[repeat + 1];
                    array[repeat + 1] = temp;
                    continueConditional = true;
                }
            }
        } while (continueConditional);

        System.out.println(Arrays.toString(array));
        return array[array.length - 1];
    }

    public static int getSecondHighest(int[] array) {
        Arrays.sort(array);
        return array[array.length - 2];
    }

    public static void iteratorStreams(int[] array) {

        if (array instanceof int[]){

            Arrays.stream(array).forEach(System.out::println);
            System.out.println("SUMA: "+Arrays.stream(array).sum());

        }

        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(4);
        list.add(3);

        list.forEach(System.out::println);
    }

    public static void summaryOfInputOnArray() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Insert the size of array: ");
        int test = sc.nextInt();

        int[] testing = new int[test];

        for (int index = 0; index < test - 1; index++) {
            System.out.println("Insert number "+ index +" of the array: ");
            testing[index] = sc.nextInt();
        }

        System.out.println("Array: "+ Arrays.toString(testing));
        System.out.println("The summary is: " + Arrays.stream(testing).summaryStatistics().getSum());
    }

}
