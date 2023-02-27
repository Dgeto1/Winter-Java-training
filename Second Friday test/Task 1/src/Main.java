import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        System.out.println(sameLetters("abc", "cba"));
        System.out.println(sameLetters("abc", "ab"));
        System.out.println(sameLetters("ababc", "abcccc"));

        System.out.println(followingString("abc"));
        System.out.println(followingString("1212"));
        System.out.println(followingString("alaala"));
        System.out.println(followingString("alaal"));
        System.out.println(followingString("zzzzz"));
        System.out.println(followingString("acacac"));
        System.out.println(followingString("acaca"));
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

    public static boolean followingString(String st) {
        for (int i = 1; i <= st.length() / 2; i++) {
            String subst = st.substring(0, i);
            int j = i+1;
            String subst2 = st.substring(j, j + i);
            while (subst.equals(subst2) && i + j <= st.length()) {
                j += i;
                subst2 = st.substring(j, j+i);
            }
            if (j == st.length()) {
                return true;
            }
        }
        return false;
    }
}