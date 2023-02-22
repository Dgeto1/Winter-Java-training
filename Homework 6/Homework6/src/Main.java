import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        //Task 1
        int[] numbers = {1, 2, 3, 3, 4, 4, 5};
        Object[] nums = uniqueArray(numbers);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }

        //Task 2
    }

    //Task 1
    public static Object[] uniqueArray(int[] numbers) {
        Set<Integer> nums = new HashSet<Integer>();
        for (int i = 0; i < numbers.length; i++) {
            nums.add(numbers[i]);
        }
        return nums.toArray();
    }

    //Task 2
    public static String originalString(String st) {
        for(int i = 0; i<st.length(); i++) {
            if(st.charAt(i) == '#') {
                char result = st.charAt(i-1);
            }
        }
    }
}