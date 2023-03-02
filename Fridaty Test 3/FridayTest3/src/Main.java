import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Matrix matrix = new Matrix(3, 4);
        matrix.fill(2);
        System.out.println(matrix.toString());
        System.out.println(".................");
        int[] arr = matrix.getRow(1);
        int[] arr2 = matrix.getColumn(1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();

        Matrix subMatrix = matrix.subMatrix(0, 0, 1, 1);
        System.out.println(subMatrix.toString());
        System.out.println("...................");
        System.out.println("Task2");
        //Task 2
        int[] numbers = {3, 1, 5, 4};
        System.out.println(missingNumber(numbers));

        //Task 3
        System.out.println("abc133d");
        System.out.println(orderedString("alabala234"));
    }


    //Task 2
    public static int missingNumber(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int a = arr[i];
                    arr[i] = arr[j];
                    arr[j] = a;
                }
            }
        }

        int missingNumber = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (Math.abs(arr[i + 1]) - Math.abs(arr[i]) != 1) {
                missingNumber = (arr[i] + arr[i + 1]) / 2;
                break;
            }
        }
        return missingNumber;
    }

    //Task 3
    public static String orderedString(String st) {
        String output = "";
        String letters = "", numbers = "";

        for (int i = 0; i < st.length(); i++) {
            char ch = st.charAt(i);
            if (Character.isDigit(ch)) {
                numbers += ch;
            } else {
                letters += ch;
            }
        }

        int length = 0;
        if (letters.length() >= numbers.length()) {
            length = letters.length();
        } else {
            length = numbers.length();
        }

        for (int i = 0; i < length; i++) {
            if (letters.length() > i) {
                char letter = letters.charAt(i);
                output += letter;
            }
            if (numbers.length() > i) {
                char digit = numbers.charAt(i);
                output += digit;
            }
        }

        for (int i = 0; i < output.length() - 1; i++) {
            char ch = output.charAt(i);
            char ch2 = output.charAt(i + 1);
            if (Character.isDigit(ch) && Character.isDigit(ch2) || Character.isLetter(ch) && Character.isLetter(ch2)) {
                return "";
            }
        }

        return output;
    }
}