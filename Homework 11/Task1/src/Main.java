public class Main {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder(new java.lang.StringBuilder("git"));
        StringBuilder sb2 = new StringBuilder(sb1);
        sb2.append("hub");
        System.out.println(sb2);
    }
}