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
        String st = "abc#";
        String st1 = "a##bc";
        String st2 = "a#bc";
        System.out.println(originalString(st));
        System.out.println(originalString(st1));
        System.out.println(originalString(st2));

        //Task 3
        System.out.println(uniqueSymbols("abca", "deaf"));
        System.out.println(uniqueSymbols("abc", "dafcc"));
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
    public static String originalString(String st)  {
        char[] chars = new char[st.length()];
        for (int i = 0; i < chars.length; i++) {
            chars[i] = st.charAt(i);
        }
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '#') {
                chars[i - 1] = ' ';
                //chars[i] = ' ';
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != ' ' && chars[i] != '#') {
                sb.append(chars[i]);
            }
        }
        return sb.toString().trim();
    }

    //Task 3
    public static String uniqueSymbols(String st1, String st2) {
        Set<Character> unique = new HashSet<>();
        for(int i = 0; i<st1.length(); i++) {
            char ch = st1.charAt(i);
            unique.add(ch);
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<st2.length(); i++) {
            char ch = st2.charAt(i);
            if(unique.contains(ch)) {
                sb.append(ch);
                unique.remove(ch);
            }
        }
        return sb.toString().trim();
    }
}