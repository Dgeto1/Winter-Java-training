import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        //Task1
        System.out.println(sameLetters("abc", "cba"));
        System.out.println(sameLetters("abc", "ab"));
        System.out.println(sameLetters("ababc", "abcccc"));
        //Task2
        System.out.println(reverseString("abc"));
        System.out.println(reverseString("123"));

        //Task 3
        Range r1 = new Range(1, 3);
        Range r2 = new Range(2, 5);
        System.out.println(r1.merge(r2));
        System.out.println(r1.contains(2));
    }

    public static ArrayList<Character> addElements(String st) {
        ArrayList<Character> chars = new ArrayList<>();
        for (int i = 0; i < st.length(); i++) {
            char ch = st.charAt(i);
            chars.add(ch);
        }
        Collections.sort(chars);
        removeDuplicates(chars);
        return chars;
    }

    public static void removeDuplicates(ArrayList<Character> chList) {
        for (int i = 0; i < chList.size() - 1; i++) {
            if (chList.get(i) == chList.get(i + 1)) {
                chList.remove(i + 1);
                i--;
            }
        }
    }

    public static boolean sameLetters(String st1, String st2) {
        ArrayList<Character> chList1 = addElements(st1);
        ArrayList<Character> chList2 = addElements(st2);

        return chList1.equals(chList2);
    }

    public static String reverseString(String st) {
        StringBuilder sb = new StringBuilder();
        for (int i = st.length() - 1; i >= 0; i--) {
            char symbol = st.charAt(i);
            sb.append(symbol);
        }
        return sb.toString().trim();
    }
}