import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Task 3
        System.out.println(decimalToHex(10));
    }

    public static String decimalToHex(int number) {
        String digits = "0123456789abcdef";
        StringBuilder sb = new StringBuilder();
        while (number > 0) {
            int ost = number % 16;
            sb.append(digits.charAt(ost) + String.valueOf(sb));
            number /= 16;
        }
        return String.valueOf(sb).trim();
    }
}