public class Main {
    public static void main(String[] args) {
        //Task 1
        int[] nums = {1, 2, 3, 4};
        nums = ReverseArray(nums);

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();

        //Task 2
        int[] numbers = {2, -1, 8};
        int[] reverseArray = SumArray(numbers);

        for (int i = 0; i < reverseArray.length; i++) {
            System.out.print(reverseArray[i] + " ");
        }
        System.out.println();

        //Task 3
        String word = "zab";
        int count = 2;

        System.out.println(encryptedString(word, count));
    }

    public static int[] ReverseArray(int[] numbers) {
        int[] reverseNums = new int[numbers.length];

        int counter = 0;
        for (int i = numbers.length - 1; i >= 0; i--) {
            reverseNums[counter] = numbers[i];
            counter++;
        }
        return reverseNums;
    }

    public static int[] SumArray(int[] numbers) {
        int[] sumArray = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            int sum = 0;
            for (int j = 0; j <= i; j++) {
                sum += numbers[j];
            }
            sumArray[i] = sum;
        }
        return sumArray;
    }

    public static String encryptedString(String word, int count) {
        String output = "";

        for (int i = 0; i < word.length(); i++) {
            int index = word.charAt(i) + count;
            if (index > 122) {
                index -= 26;
            }
            char letter = (char) (index);

            output += letter;
        }
        return output;
    }
}