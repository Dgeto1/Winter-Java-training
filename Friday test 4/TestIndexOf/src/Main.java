public class Main {
    public static void main(String[] args) {
        System.out.println(indexOf("aertter", "er"));
    }
    public static int indexOf(String buffer, String str) {
        if(str.isEmpty()) {
            throw new NullPointerException();
        }
        int index = -1;
        for(int i=0; i<buffer.length(); i++) {
            boolean isFounded = true;
            for(int j=0; j<str.length(); j++) {
                if(buffer.charAt(i+j) != str.charAt(j)) {
                    isFounded = false;
                    break;
                }
            }
            if(isFounded){
                index = i;
                break;
            }
        }
        return index;
    }
}