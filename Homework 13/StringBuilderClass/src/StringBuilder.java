public class StringBuilder {
    private char[] buffer;
    private int length;

    public StringBuilder() {
        buffer = new char[16];
        length = 0;
    }

    public StringBuilder(StringBuilder sb) {
        length = sb.length;
        buffer = new char[sb.length];
        for (int i = 0; i < sb.length; i++) {
            buffer[i] = sb.toString().charAt(i);
        }

    }

    public StringBuilder(int capacity) {
        if (capacity < 0) {
            throw new StringIndexOutOfBoundsException();
        }
        buffer = new char[capacity];
    }

    public StringBuilder(String str) {
        length = str.length();
        buffer = new char[16 + length];
        for (int i = 0; i < str.length(); i++) {
            buffer[i] = str.charAt(i);
        }
    }

    public void append(String str) {
        if (str == null) {
            return;
        }

        if (str.length() + length > buffer.length) {
            char[] tempCharArr = new char[str.length() + length];
            for (int i = 0; i < buffer.length; i++) {
                tempCharArr[i] = buffer[i];
            }

            buffer = tempCharArr;
        }
    }

    public void append(int num) {
        append(String.valueOf(num));
    }

    public int capacity() {
        return buffer.length;
    }

    public int length() {
        return length;
    }

    public void ensureCapacity(int minimumCapacity) {
        if (buffer.length > minimumCapacity) {
            return;
        }
        int maxCapacity = buffer.length * 2 + 2;
        minimumCapacity = (Math.max(maxCapacity, minimumCapacity));

        char[] newBuffer = new char[minimumCapacity];
        for (int i = 0; i < length; i++) {
            newBuffer[i] = buffer[i];
        }
        buffer = newBuffer;
    }

    public int indexOf(String str) {
        return indexOf(str, 0);
    }

    public int indexOf(String str, int fromIndex) {
        if (str.isEmpty()) {
            throw new NullPointerException();
        }
        int index = -1;
        for (int i = fromIndex; i < buffer.length; i++) {
            boolean isFounded = true;
            for (int j = 0; j < str.length(); j++) {
                if (String.valueOf(buffer).charAt(i + j) != str.charAt(j)) {
                    isFounded = false;
                    break;
                }
            }
            if (isFounded) {
                index = i;
                break;
            }
        }
        return index;
    }

    public int lastIndexOf(String str, int fromIndex) {
        if (str.isEmpty()) {
            throw new NullPointerException();
        }

        int index = -1;
        for (int i = fromIndex; i < buffer.length; i++) {
            boolean isFounded = true;
            for (int j = 0; j < str.length(); j++) {
                if (String.valueOf(buffer).charAt(i + j) != str.charAt(j)) {
                    isFounded = false;
                    break;
                }
            }
            if (isFounded) {
                index = i;
            }
        }
        return index;
    }

    public void setCharAt(int index, char ch) {
        buffer[index] = ch;
    }

    public void insert(int offset, String str) {
        char[] firstBuffer = new char[offset];
        char[] secondBuffer = new char[buffer.length - offset];
        char[] newBuffer = new char[str.length()];

        for (int i = 0; i < firstBuffer.length; i++) {
            firstBuffer[i] = buffer[i];
        }
        for (int i = 0; i < newBuffer.length; i++) {
            char ch = str.charAt(i);
            newBuffer[i] = ch;
        }
        for (int i = offset, k = 0; i < secondBuffer.length; i++) {
            secondBuffer[k] = buffer[i];
            k++;
        }

        int pos = 0;
        for (char ch : firstBuffer) {
            buffer[pos] = ch;
            pos++;
        }
        for (char ch : newBuffer) {
            buffer[pos] = ch;
            pos++;
        }
        for (char ch : secondBuffer) {
            buffer[pos] = ch;
            pos++;
        }
    }

    public void replace(int start, int end, String str) {
        if (start < 0 || start > buffer.length || start > end || end > str.length()) {
            throw new StringIndexOutOfBoundsException();
        }
        for (int i = start; i < end; i++) {
            char ch = str.charAt(i);
            buffer[i] = ch;
        }
    }

    public void reverse() {
        char[] reversed = new char[buffer.length];
        int j = buffer.length;
        for (int i = buffer.length - 1, k = 0; i > 0; i++) {
            reversed[k] = buffer[i];
            k++;
        }
        buffer = reversed;
    }

    public String substring(int start) {
        if (start < 0 || start >= buffer.length) {
            throw new StringIndexOutOfBoundsException();
        }

        String output = "";

        for (int i = start; i < buffer.length; i++) {
            String st = String.valueOf(buffer[i]);
            output += st;
        }
        return output;
    }

    public String substring(int start, int end) {
        if (start < 0 || start >= buffer.length || start > end) {
            throw new StringIndexOutOfBoundsException();
        }

        String output = "";

        for (int i = start; i < end; i++) {
            String st = String.valueOf(buffer[i]);
            output += st;
        }
        return output;
    }

    public void delete(int start, int end) {
        if (start < 0 || start > end || start > buffer.length) {
            throw new StringIndexOutOfBoundsException();
        }

        char[] firstElements = new char[start];
        char[] secondElements = new char[buffer.length - end];
        for (int i = 0; i < start; i++) {
            firstElements[i] = buffer[i];
        }
        for (int i = end, k = 0; i < buffer.length; i++) {
            secondElements[k] = buffer[i];
            k++;
        }

        int pos = 0;
        for (char ch : firstElements) {
            buffer[pos] = ch;
            pos++;
        }
        for (char ch : secondElements) {
            buffer[pos] = ch;
            pos++;
        }
    }

    public void delete(int start) {
        char[] pom = new char[start];

        for (int i = 0; i < start; i++) {
            pom[i] = buffer[i];
        }

        buffer = pom;
    }
}
