import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Integer[] a = {1, 2, 3,  4};
        List<Integer> list = Arrays.asList(a);
        splice(list, 1, 1);
        // [1, 3, 4]
        int[] nums = {5,6};
        splice(list, 1, 2, nums);
        // [1, 5, 6, 4]
        splice(list, 1);
        // [1]
        int[] items = {7,8,9};
        splice(list, 2, 2, items);
        // [1, 2, 7, 8, 9]
    }

    public static void splice(List<Integer> arr, int start) {
        for(int i=start; i<arr.size(); i++) {
            arr.remove(arr.get(i));
        }
    }

    public static void splice(List<Integer> arr, int start, int deleteCount) {
        int count = deleteCount;
        int index = start;

        while(deleteCount>0) {
            arr.remove(arr.get(start));
            start++;
            count--;
        }
    }

    public static void splice(List<Integer> arr, int start, int deleteCount, int item) {
        int count = deleteCount;
        int index = start;

        while (deleteCount>0) {
            if(deleteCount==1) {
                arr.remove(arr.get(index));
                arr.add(start, item);
            }
            arr.remove(arr.get(index));
            start++;
            count--;
        }
    }

    public static void splice(List<Integer> arr, int start, int deleteCount, int[] items) {
        int count = deleteCount;
        int index = start;

        while (deleteCount>0) {
            if(deleteCount==1) {
                arr.remove(arr.get(index));
                for(int i=start, k=0; i<deleteCount; i++) {
                    arr.add(i, items[k]);
                    k++;
                }
            }
            arr.remove(arr.get(index));
            start++;
            count--;
        }
    }
}