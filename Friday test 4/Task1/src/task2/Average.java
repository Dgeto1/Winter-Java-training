package task2;

import java.util.ArrayList;

public class Average {
    private int n;
    private ArrayList<Integer> numbers;

    public Average(int n) {
        this.n = n;
        numbers = new ArrayList<>();
    }

    public float next(int number) {
        numbers.add(number);
        float average = 0;
        float sum = 0;

        if (numbers.size() < n) {
            for (Integer integer : numbers) {
                sum += integer;
            }
            average = sum / numbers.size();
            return average;
        } else {
            for (int i = numbers.size() - 1; i >= numbers.size() - n; i--) {
                sum += numbers.get(i);
            }
            average = sum / n;
            return average;
        }
    }
}
