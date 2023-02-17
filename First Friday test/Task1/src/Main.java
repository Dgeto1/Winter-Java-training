import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1, 8, 0, 6, 3};
        System.out.print("[1,8,0,6,3] =>");
        int[] biggestNumbers = biggestElementsArray(nums, 3);
        for (int i = 0; i < biggestNumbers.length; i++) {
            System.out.print(biggestNumbers[i] + " ");
        }
        System.out.println();
        //Task 2
        String[] numbers = {"1", "3", "8", "1", "16", "3", "4"};
        int[] uniqueNumbers = uniqueNumbersArray(numbers);
        for (int i = 0; i < uniqueNumbers.length; i++) {
            System.out.print(uniqueNumbers[i] + " ");
        }
    }

    public static int[] biggestElementsArray(int[] numbers, int number) {
        int[] biggestElements = new int[number];

        int counter = 0;

        for (int i = 0, k = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {
                    counter++;
                }
            }
            if (counter == numbers.length - 1) {
                biggestElements[k] = numbers[i];
                numbers[i] = Integer.MIN_VALUE;
                k++;
                if (i < numbers.length - 1) {
                    i = -1;
                }
            }
            counter = 0;
        }

        return biggestElements;
    }

    public static int[] uniqueNumbersArray(String[] numbers) {
        int countLength = 0;
        for (int i = 0, k = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j] && numbers[i] != null) {
                    numbers[j] = null;
                    countLength++;
                }
            }
        }
        int[] uniqueNumbers = new int[numbers.length - countLength];
        for (int i = 0, k = 0; i < numbers.length; i++) {
            if (numbers[i] != null) {
                uniqueNumbers[k] = Integer.parseInt(numbers[i]);
                k++;
            }
        }
        return uniqueNumbers;
    }
}