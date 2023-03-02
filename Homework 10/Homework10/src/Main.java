import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Task 1
        Matrix m = new Matrix(2, 2, -1);
        m.set(0, 1, 15);
        int v1 = m.get(0, 1);
        int v2 = m.get(0, 0);
        System.out.println(v1);
        System.out.println(v2);

        //Task 2

        //Task 4
        char[] symbols = {'1', '2', '3'};

        System.out.println(reverse(symbols));
    }

    //Task 3


    //Task 4
    public static char[] reverse(char[] symbols) {
        char[] reversedSymbols = new char[symbols.length];
        for(int i=symbols.length-1,k = 0; i>=0; i--) {
            reversedSymbols[k] = symbols[i];
            k++;
        }
        return reversedSymbols;
    }
}