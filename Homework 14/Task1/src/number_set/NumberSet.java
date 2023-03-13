package number_set;

import java.util.ArrayList;
import java.util.List;

public class NumberSet {
    private int capacity;
    private List<Integer> numbers;

    public NumberSet(int capacity) {
        this.capacity = capacity;
        numbers = new ArrayList<>();
    }

    public void add(int n) {
        numbers.add(n);
    }

    public void delete(int n) {
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) == n) {
                numbers.remove(numbers.get(i));
                break;
            }
        }
    }

    public boolean has(int n) {
        return numbers.contains(n);
    }

    public int size() {
        return numbers.size();
    }

    public void clear() {
        numbers.removeAll(numbers);
    }

    public int[] values() {
        int[] values = new int[numbers.size()];
        for (int i = 0; i < values.length; i++) {
            int n = numbers.get(i);
            values[i] = n;
        }
        return values;
    }

    //public boolean equals()
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < numbers.size(); i++) {
            if (i == numbers.size() - 1) {
                sb.append(numbers.get(i));
            } else {
                sb.append(numbers.get(i)).append(", ");
            }
        }
        sb.append("]");
        return sb.toString().trim();
    }
}
