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
        for (Integer x : list) {
            System.out.print(x + " ");
        }
    }

    public static <E> List<E> splice(List<E> elements, int start) {
        if (start < 0 || start >= elements.size()) {
            throw new IndexOutOfBoundsException();
        }
        List<E> deletedItems = new ArrayList<>();
        for (int i = elements.size() - 1; i >= 0; i--) {
            elements.remove(i);
            deletedItems.add(elements.get(i));
            i++;
        }

        return deletedItems;
    }


    public static <E> List<E> splice(List<E> elements, int start, int deleteCount) {
        validIndex(elements, start, deleteCount);
        List<E> deletedItems = new ArrayList<>();
        for (int i = start; i < elements.size() - deleteCount; i++) {
            E lastElement = elements.get(elements.size() - i);
            elements.set(elements.size() - 1, elements.get(i));
            elements.set(i, lastElement);
        }
        while (deleteCount > 0) {
            deletedItems.add(elements.remove(elements.size() - 1));
            deleteCount--;
        }
        return deletedItems;
    }

    public static <E> List<E> splice(List<E> elements, int start, int deleteCount, E... items) {
        validIndex(elements, start, deleteCount);
        List<E> deletedItems = splice(elements, start, deleteCount);
        int length = items.length;
        while (length > 0) {
            for (E num : items) {
                elements.add(start, num);
                start++;
                length--;
            }
        }
        return deletedItems;
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