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

    public static void addElements(ArrayList<Character> chars, String st) {
        for (int i = 0; i < st.length(); i++) {
            char ch = st.charAt(i);
            chars.add(ch);
        }
    }

    public static void compareElements(ArrayList<Character> chList) {
        for (int i = 0; i < chList.size() - 1; i++) {
            if (chList.get(i) == chList.get(i + 1)) {
                chList.remove(i + 1);
                i--;
            }
        }
    }

    public static boolean sameLetters(String st1, String st2) {
        ArrayList<Character> chList1 = new ArrayList<>();
        ArrayList<Character> chList2 = new ArrayList<>();

        addElements(chList1, st1);
        addElements(chList2, st2);

        Collections.sort(chList1);
        Collections.sort(chList2);

        compareElements(chList1);
        compareElements(chList2);

        if (chList1.size() != chList2.size()) {
            return false;
        } else if (chList1 == chList2) {
            return true;
        }
        return true;
    }

    public static boolean followingString(String st) {
        for (int i = 1; i <= st.length() / 2; i++) {
            String subst = st.substring(0, i);
            int j = i;
            String subst2 = st.substring(j, j + i);
            while (subst.equals(subst2) && i + j <= st.length()) {
                j += i;
            }
            if (j == st.length()) {
                return true;
            }
        }
        return false;
    }
}