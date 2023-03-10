import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        System.out.println(validateString("()"));
        System.out.println(validateString("()[]{}"));
        System.out.println(validateString("(]"));
        System.out.println(validateString("([)]"));
        System.out.println(validateString("{[]}"));
    }

    public static boolean validateString(String str) {
        if (str.isEmpty() || str.length() == 1) {
            return false;
        }

        Stack<Character> chars = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                chars.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {
                if (chars.size() == 0) {
                    return false;
                }
                char symbol = chars.pop();
                if (ch == ')' && symbol != '(' || ch == '}' && symbol != '{' || ch == ']' && symbol != '[') {
                    return false;
                }
            }
        }
        return chars.isEmpty();
    }

}