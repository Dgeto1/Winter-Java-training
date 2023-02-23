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
        System.out.println();

        //Task 2
        String st = "a##bc";
        System.out.println(originalString(st));
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
        char[] chars = new char[st.length()];
        for(int i=0; i<chars.length; i++){
            chars[i] = st.charAt(i);
        }
        for(int i = 0; i<chars.length; i++) {
            if(chars[i] == '#') {
                chars[i-1] = ' ';
                chars[i] = ' ';
            }
        }
        String output = "";
        for(int i=0; i<chars.length; i++){
            if(chars[i]!=' '){
                output+=chars[i];
            }
        }
        return output;
    }
}