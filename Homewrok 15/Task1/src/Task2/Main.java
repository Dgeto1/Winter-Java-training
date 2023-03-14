package Task2;

public class Main {
    public static void main(String[] args) {
        System.out.println(setBit(1, 1));
        System.out.println(setBit(0, 2));

        System.out.println(clearBit(3, 0));
        System.out.println(clearBit(7, 1));

        System.out.println(toggleBit(0, 1));
        System.out.println(toggleBit(5, 0));

        System.out.println(getBit(5, 0));
        System.out.println(getBit(4, 0));
    }

    public static int setBit(int num, int index) {
        int mask = 1 << index;
        return num | mask;
    }

    public static int clearBit(int num, int index) {
        int mask = ~(1 << index);
        return num & mask;
    }

    public static int toggleBit(int num, int index) {
        int mask = 1 << index;
        return num ^ mask;
    }

    public static boolean getBit(int num, int index) {
        int mask = 1 << index;
        return (num & mask) != 0;
    }
}
