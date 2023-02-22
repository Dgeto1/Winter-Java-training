import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        //Task 1
        System.out.println("Task 1");
        Object[] numbers = {1, 0, 3, 0, 12};
        System.out.println(lastIndexOf(numbers, 0));
        System.out.println(lastIndexOf(numbers, 0, 2));

        //Task2
        System.out.println("Task 2");
        String st1 = "ala bala";
        String st2 = "la";
        System.out.println(indexOf(st1, st2));

        //Task 3
        System.out.println("Task 3");
        Object[] subarray = subarray(numbers, 2);
        Object[] secondSubarray = subarray(numbers, 2, 4);
        for (int i = 0; i < subarray.length; i++) {
            System.out.print(subarray[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < secondSubarray.length; i++) {
            System.out.print(subarray[i] + " ");
        }
        System.out.println();

        //Task 4
        System.out.println("Task 4");
        int[] firstNumbers = {1, 1, 2, 3};
        int[] secondNumbers = {1, 2, 2, 2, 3};
        System.out.println(sameElements(firstNumbers, secondNumbers));
    }

    //Task 1

    public static int lastIndexOf(Object[] arr, Object element, int startPosition) {
        if (startPosition > arr.length - 1) {
            return -1;
        }
        int lastIndex = -1;
        for (int i = startPosition; i < arr.length; i++) {
            if (arr[i] == element) {
                lastIndex = i;
            }
        }
        return lastIndex;
    }

    public static int lastIndexOf(Object[] arr, Object element) {
        return lastIndexOf(arr, element, 0);
    }

    //Task 2
    public static int indexOf(String st1, String st2) {
        int index = -1;
        int counter = 0;


        for (int i = 0; i < st1.length(); i++) {
            for (int j = 0; j < st2.length(); j++) {
                if (st1.charAt(i) == st2.charAt(j)) {
                    counter++;
                    break;
                }
            }
            if (counter == st2.length()) {
                index = i;
                break;
            }
        }

        return index;
    }

    //Task 3
    public static Object[] subarray(Object[] arr, int start, int end) {
        if (start == end) {
            return new Object[]{arr[start]};
        }
        Object[] subarray = new Object[arr.length - start + 1];
        for (int i = start, k = 0; i < arr.length; i++) {
            subarray[k] = arr[i];
            k++;
        }
        return subarray;
    }

    public static Object[] subarray(Object[] arr, int start) {
        return subarray(arr, start, arr.length - 1);
    }

    //Task 4
    public static boolean sameElements(int[] firstNumbers, int[] secondNumbers) {
        boolean areSame = true;
        Set<Integer> numbers = new HashSet<>();
        for (int i = 0; i < firstNumbers.length; i++) {
            numbers.add(firstNumbers[i]);
        }
        for (int i = 0; i < secondNumbers.length; i++) {
            if (numbers.add(secondNumbers[i])) {
                areSame = false;
            }
        }

        return areSame;
    }
}