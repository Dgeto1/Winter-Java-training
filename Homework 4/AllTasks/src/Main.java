public class Main {
    public static void main(String[] args) {
        //Task 1
        int[] numbers = {1,2,3,0,12};
        int number = 3;
        int position = 2;
        System.out.println(indexOf(numbers, number));
        System.out.println(indexOf(numbers, number, position));

        //Task2
        System.out.println(includes(numbers, number));
        System.out.println(includes(numbers, number, position));
    }

    public static int indexOf(int[] numbers, int number) {
        int position = -1;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == number) {
                position = i;
            }
        }
        return position;
    }
    public static int indexOf(int[] numbers, int number, int startPosition){
        int position = -1;

        for (int i = startPosition; i < numbers.length; i++) {
            if (numbers[i] == number) {
                position = i;
            }
        }
        return position;
    }

    public static boolean includes(int[] numbers, int number){
        boolean isIncludes = false;
        for(int i = 0; i<numbers.length; i++){
            if(numbers[i] == number){
                isIncludes = true;
                break;
            }
        }
        return isIncludes;
    }
    public static boolean includes(int[] numbers, int number, int startPosition) {
        boolean isIncludes = false;
        for (int i = startPosition; i < numbers.length; i++) {
            if (numbers[i] == number) {
                isIncludes = true;
                break;
            }
        }
        return isIncludes;
    }

    public static int shift(int[] numbers){
        int firstEl = numbers[0];
        int lastEl = numbers[numbers.length-1];

        for(int i=1; i<numbers.length; i++)
        {
            for(int j=2; j<numbers.length; j++)
            {
                int number = numbers[i];
                numbers[i] = 
            }
        }

        return firstEl;
    }
}