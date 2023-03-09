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
        //splice(list, 1);
        //splice(list, 1, 1);
        splice(list, 1, 2, 5, 6);
        //splice(list, 1, 2 , nums);
        for (Integer x : list) {
            System.out.print(x + " ");
        }
    }

    public static <E> void splice(List<E> elements, int start) {
        if (start < 0 || start >= elements.size()) {
            throw new IndexOutOfBoundsException();
        }
        for (int i = start; i < elements.size(); i++) {
            elements.remove(i);
            i--;
        }
    }


    public static <E> void splice(List<E> elements, int start, int deleteCount) {
        validIndex(elements, start, deleteCount);
        while (deleteCount > 0) {
            elements.remove(start);
            deleteCount--;
        }
    }

    public static <E> void splice(List<E> elements, int start, int deleteCount, E... items) {
        validIndex(elements, start, deleteCount);
        splice(elements, start, deleteCount);
        int length = items.length;
        while (length > 0) {
            for (E num : items) {
                elements.add(start, num);
                start++;
                length--;
            }
        }
    }

    public static <E> void validIndex(List<E> elements, int start, int deleteCount) {
        if (start < 0 || start >= elements.size()) {
            throw new IndexOutOfBoundsException();
        }
        if (deleteCount > elements.size()) {
            throw new IndexOutOfBoundsException();
        }
    }
}