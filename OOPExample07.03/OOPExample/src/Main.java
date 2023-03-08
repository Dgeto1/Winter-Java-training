public class Main {
    public static void main(String[] args) {
        Stack<Integer> elementsNumbers = new Stack<>();
        elementsNumbers.push(1);
        elementsNumbers.push(2);
        System.out.println(elementsNumbers.pop());

        Stack<String> strings = new Stack<>();
        strings.push("aa");
        strings.push("bb");
        System.out.println(strings.pop());
    }
}