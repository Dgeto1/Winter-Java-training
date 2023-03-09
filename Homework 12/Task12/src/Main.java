import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        int[] nums = { 7, 8, 9 };
        //splice(list, 1);
        // splice(list, 1, 1);
        splice(list, 2, 2, nums);
        //splice(list, 1, 2 , nums);
        for(Integer x : list) {
            System.out.print(x + " ");
        }
    }

    public static void splice(List<Integer> elements, int start) {
        for (int i = start; i < elements.size(); i++) {
            elements.remove(i);
            i--;
        }
    }


    public static void splice(List<Integer> elements, int start, int deleteCount) {
        while (deleteCount > 0) {
            elements.remove(start);
            deleteCount--;
        }
    }

    public static void splice(List<Integer> elements, int start, int deleteCount, int item) {
        while (deleteCount > 0) {
            elements.remove(start);
            deleteCount--;
        }
        elements.add(start, item);
    }   

    public static void splice(List<Integer> elements, int start, int deleteCount, int[] nums) {
        while (deleteCount > 0) {
            elements.remove(start);
            deleteCount--;
        }
        int length = nums.length;
        while (length > 0) {
            for (int num : nums) {
                elements.add(start, num);
                start++;
                length--;
            }
        }
    }
}