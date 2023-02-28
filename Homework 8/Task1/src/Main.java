public class Main {
    public static void main(String[] args) {
        //Task2
        System.out.println(removeElement("alabala", 2));

        //Task3
        System.out.println(replaceSymbol("alabala", 'a', 'c'));
    }

    //Task 1
    public static int daysBetweenDates(String date1, String date2) {
        String[] segments = date1.split("-");
        int day1 = Integer.parseInt(segments[0]);
        String month1 = segments[1];
        int year1 = Integer.parseInt(segments[2]);

        segments = date2.split("-");
        int day2 = Integer.parseInt(segments[0]);
        String month2 = segments[1];
        int year2 = Integer.parseInt(segments[2]);

    }

    //Task2
    public static String removeElement(String st, int index) {
        String output = "";
        for (int i = 0; i < st.length(); i++) {
            if (i == index) {
                continue;
            }
            output += st.charAt(i);
        }
        return output;
    }

    //Task3
    public static String replaceSymbol(String st, char ch1, char ch2) {
        StringBuilder sb = new StringBuilder();
        char[] chars = new char[st.length()];
        for (int i = 0; i < st.length(); i++) {
            char ch = st.charAt(i);
            if (ch == ch1) {
                sb.append(ch2);
            } else {
                sb.append(ch);
            }
        }
        return sb.toString().trim();
    }
}