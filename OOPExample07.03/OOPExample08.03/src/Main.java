import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        /*MyList elements = new MyList();
        elements.add(2);
        elements.add(3);
        elements.add(5);

        System.out.println(elements.average());*/

        int[] numbers = {8, 12, 7, 15, 20, 5};

        ArrayList<Integer> listNumbers = new ArrayList<>();
        for(int i=0; i<numbers.length; i++) {
            listNumbers.add(numbers[i]);
        }

        System.out.println(sum(listNumbers));
        System.out.println(sumEvenElements(listNumbers));
        printElementsOfArrayList(listNumbers);
    }

    public static int sum(ArrayList<Integer> values) {
        int sum = 0;

        Iterator<Integer> iterator = values.iterator();
        while(iterator.hasNext()) {
            int value = iterator.next();
            if(value>=10) {
                sum+=value;
            }
        }
        return sum;
    }

    public static int sumEvenElements(ArrayList<Integer> values) {
        int sum = 0;
        int position = 0;

        Iterator<Integer> iterator = values.iterator();
        while (iterator.hasNext()) {
            int value = iterator.next();


            if(value>10 && position%2==0) {
                sum+=value;
            }
            position++;
        }
        return sum;
    }

    public static void printElementsOfArrayList(ArrayList<Integer> elements) {
        Iterator<Integer> iterator = elements.iterator();

        while (iterator.hasNext()) {
            int value = iterator.next();
            System.out.print(value + " ");
        }
    }
}