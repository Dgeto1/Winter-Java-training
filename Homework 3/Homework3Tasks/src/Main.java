import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int number = 256;
        ByteBuffer buffer = ByteBuffer.allocate(Long.BYTES);
        buffer.putLong(number);
        byte[] arr = buffer.array();
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]+".");
        }
        System.out.println();
        System.out.println(longToByte(number));

        //Task 2


        //Task 3
        int num = 255;
        System.out.println(decimalToHexademical(255));
    }

    public static String longToByte(long number) {
        ByteBuffer buffer = ByteBuffer.allocate(Long.BYTES);
        buffer.putLong(number);
        byte[] arr = buffer.array();
        String output = "";
        for(int i=0; i<arr.length; i++)
        {
            output += arr[i];
        }

        String s = new String(arr);
        //String output = buffer.array()[0] + "." + buffer.array()[1] + "." + buffer.array()[2] + "." + buffer.array()[3];
        return s;
    }

    public static long byteToLong(String bytes){
        ByteBuffer buffer = ByteBuffer.allocate(Long.BYTES);
        String[] segments = bytes.split(".");
        byte[] bts = new byte[segments.length];
        for(int i=0; i<bytes.length(); i++){
            bts[i] = Byte.parseByte(segments[i]);
        }
        buffer.put(bts);
        buffer.flip();//need flip
        return buffer.getLong();
    }

    public static String decimalToHexademical(int number) {
        String digits = "0123456789ABCDEF";
        String output = "";

        while (number > 0) {
            int ost = number % 16;
            output = digits.charAt(ost) + output;
            number /= 16;
        }
        return output;
    }
}