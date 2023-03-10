package task2;

public class Main {
    public static void main(String[] args) {
        Average avg = new Average(3);
        float val;

        val = avg.next(1); // 1
        System.out.println(val);
        val = avg.next(2); // 1.5
        System.out.println(val);
        val = avg.next(3); // 2
        System.out.println(val);
        val = avg.next(4); // 3
        System.out.println(val);
        val = avg.next(5); // 4
        System.out.println(val);
        val = avg.next(0); // 3
        System.out.println(val);
    }
}
