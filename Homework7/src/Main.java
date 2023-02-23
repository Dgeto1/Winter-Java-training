public class Main {
    public static void main(String[] args) {
        //Task 1
        System.out.println(isAbsent("ППОЗЗП"));
        System.out.println(isAbsent("PPОЗЗЗ"));

        //Task 2
            System.out.println(compareStrings("  abc  ", "abc"));
            System.out.println(compareStrings("ABC", "abc"));
            System.out.println(compareStrings(" ala   bala", "ala bala"));
            System.out.println(compareStrings(" ала bala  ", "alabala"));
        }

    public static boolean isAbsent(String st) {
        int counter = 0;
        for (int i = 0; i < st.length(); i++) {
            if (counter >= 3) {
                return false;
            }
            if (st.charAt(i) == 'О') {
                counter++;
            }
            if (st.charAt(i) == 'З' && st.charAt(i + 1) == 'З' && st.charAt(i + 2) == 'З') {
                return false;
            }
        }
        return true;
    }

    public static boolean compareStrings(String st1, String st2) {
        st1 = st1.toLowerCase();
        st2 = st2.toLowerCase();
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < st1.length(); i++) {
            char ch = st1.charAt(i);
            if (ch != ' ') {
                sb1.append(ch);
            }
        }
        for (int i = 0; i < st2.length(); i++) {
            char ch = st2.charAt(i);
            if (ch != ' ') {
                sb2.append(ch);
            }
        }
        if (sb1.toString().equals(sb2.toString())) {
            return true;
        } else {
            return false;
        }
    }
}