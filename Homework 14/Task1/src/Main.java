public class Main {
    public static void main(String[] args) {
        System.out.println(max(1)); // 1
        System.out.println(max(1, 2, 3)); // 3
        System.out.println(max(5, -1, 2, 3)); // 5
    }

    public static int max(int... nums) {
        int maxNum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > maxNum) {
                maxNum = nums[i];
            }
        }
        return maxNum;
    }
}