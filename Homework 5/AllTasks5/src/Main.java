import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Task 1
        int[] numbers = {1, 0, 3, 0, 12};
        System.out.println(lastIndexOf(numbers, 0));
        System.out.println(lastIndexOf(numbers, 0, 2));

        //Task2
        String st1 = "gibhub";
        String st2 = "hub";
        System.out.println(indexOf(st1, st2));

        //Task 3
        int[] subarray = subarray(numbers, 2);
        int[] secondSubarray = subarray(numbers, 2, 4);
        for (int i = 0; i < subarray.length; i++) {
            System.out.print(subarray[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < secondSubarray.length; i++) {
            System.out.print(subarray[i] + " ");
        }
        System.out.println();

        //Task 4
        int[] firstNumbers = {1, 1, 2, 3};
        int[] secondNumbers = {1, 2, 2, 2, 3};
        System.out.println(sameElements(firstNumbers, secondNumbers));
    }

    //Task 1
    public static int lastIndexOf(int[] numbers, int number) {
        int lastIndex = -1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == number) {
                lastIndex = i;
            }
        }
        return lastIndex;
    }

    public static int lastIndexOf(int[] numbers, int number, int startPosition) {
        int lastIndex = -1;
        for (int i = startPosition; i < numbers.length; i++) {
            if (numbers[i] == number) {
                lastIndex = i;
            }
        }
        return lastIndex;
    }

    //Task 2
    public static int indexOf(String st1, String st2) {
        int index = -1;
        int counter = 0;


        for (int i = 0; i < st1.length(); i++) {
            for (int j = 0; j < st2.length(); j++){
                if(st1.charAt(i) == st2.charAt(j)){
                    counter++;
                    break;
                }
            }
            if(counter == st2.length()){
                index = i;
                break;
            }
        }

        return index;
    }

    //Task 3
    public static int[] subarray(int[] numbers, int start) {
        int[] subarray = new int[numbers.length - start + 1];
        for (int i = start, k = 0; i < numbers.length; i++) {
            subarray[k] = numbers[i];
            k++;
        }
        return subarray;
    }

    public static int[] subarray(int[] numbers, int start, int end) {
        int[] subarray = new int[end - start + 1];
        for (int i = start, k = 0; i <= end; i++) {
            subarray[k] = numbers[i];
            k++;
        }
        return subarray;
    }

    //Task 4
    public static boolean sameElements(int[] firstNumbers, int[] secondNumbers) {
        boolean areSame = false;
        for (int i = 0; i < firstNumbers.length; i++) {
            for (int j = 0; j < secondNumbers.length; j++) {
                if (firstNumbers[i] == secondNumbers[j]) {
                    areSame = true;
                    break;
                } else {
                    areSame = false;
                }
            }
        }
        return areSame;
    }
}