import java.util.ArrayList;
import java.util.EmptyStackException;

public class Stack<T> {
    private ArrayList<T> elements;

    public Stack() {
        elements = new ArrayList<>();
    }

    public void push(T element) {
        elements.add(element);
    }

    public T pop() {
        if(elements.isEmpty()) {
            throw new EmptyStackException();
        }
        return elements.remove(elements.size()-1);
    }

    public boolean isEmpty() {
        return elements.isEmpty();
    }
}
