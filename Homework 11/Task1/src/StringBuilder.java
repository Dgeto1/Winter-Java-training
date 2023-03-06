public class StringBuilder {
    private java.lang.StringBuilder sb;

    public StringBuilder(StringBuilder sb){

    }
    public StringBuilder(java.lang.StringBuilder sb) {
        this.sb = sb;
    }
    public void append(String str) {
        this.sb.append(str);
    }

    public void append(int num) {
        String n = String.valueOf(num);
        this.sb.append(n);
    }

    public int capacity() {
        return this.sb.capacity();
    }

    public int length() {
        return this.sb.length();
    }

    public void ensureCapacity(int minimumCapacity) {
        this.sb.ensureCapacity(minimumCapacity);
    }

    public int indexOf(String str) {
        return this.sb.indexOf(str);
    }

    public int indexOf(String str, int fromIndex) {
        return this.sb.indexOf(str, fromIndex);
    }

    public int lastIndexOf(String str) {
        return this.sb.lastIndexOf(str);
    }

    public int lastIndexOf(String str, int fromIndex) {
        return this.sb.lastIndexOf(str, fromIndex);
    }

    public void setCharAt(int index, char ch) {
        this.sb.setCharAt(index, ch);
    }

    public void insert(int offset, String str) {
        this.sb.insert(offset, str);
    }

    public void insert(int index, String str, int offset, int len) {
        this.sb.insert(index, str, offset, len);
    }

    public void replace(int start, int end, String str) {
        this.sb.replace(start, end, str);
    }

    public void trimToSize() {
        this.sb.trimToSize();
    }

    public void reverse() {
        this.sb.reverse();
    }

    public String substring(int start) {
        return this.sb.substring(start);
    }

    public void delete(int start, int end) {
        this.sb.delete(start, end);
    }

    public void delete(int start) {
        this.sb.delete(start, this.sb.length()-1);
    }
}
