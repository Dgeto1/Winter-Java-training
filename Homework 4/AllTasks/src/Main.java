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

        //Task3
        System.out.println(shift(numbers));
        for(int i=0; i<numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        //Task4
        int num = 8;
        int[] pom = unshift(numbers, num);
        for(int i=0; i<pom.length; i++){
            System.out.print(pom[i] + " ");
        }
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
        if(numbers.length==0)
        {
            return Integer.MIN_VALUE;
        }

        int firstEl = numbers[0];
        //int lastEl = numbers[numbers.length-1];
        numbers[numbers.length-1] = Integer.MIN_VALUE;
        int[] pom = new int[numbers.length];
        for(int i=1, k=0; i<numbers.length; i++)
        {
            pom[k] = numbers[i];
            k++;
        }
        pom[pom.length-1] = Integer.MIN_VALUE;
        for(int i=0; i<numbers.length; i++){
            numbers[i] = pom[i];
        }

        return firstEl;
    }

    public static int[] unshift(int[] numbers, int number){
        int[] pom = new int[numbers.length+1];
        pom[0] = number;

        for(int i=0, k=1; i<numbers.length; i++){
            pom[k] = numbers[i];
            k++;
        }
        return pom;
    }
}