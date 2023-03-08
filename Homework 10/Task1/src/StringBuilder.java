public class StringBuilder {
    private char[] chArr;
    private int numOfChars;
    private static final int DEFAULT_CAPACITY = 16;

    public StringBuilder(){
        this(DEFAULT_CAPACITY);
    }

    public StringBuilder(StringBuilder sb) {
        numOfChars = sb.length();
        chArr = new char[sb.length()];
        for(int i=0; i<sb.length(); i++) {
            chArr[i] = sb.toString().charAt(i);
        }
    }
}
