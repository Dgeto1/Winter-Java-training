package number_set;

public class Main {
    public static void main(String[] args) {
        NumberSet set = new NumberSet(256);
        set.add(1);
        set.add(2);
        int[] a = set.values(); // [1, 2]
        System.out.println(set.toString());
        // {1, 2}
        set.delete(2);
        System.out.println(set.toString());
        // {1}
        set.clear();
        System.out.println(set.toString());
        // {}
    }
}
