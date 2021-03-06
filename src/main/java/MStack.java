import java.util.ArrayList;
import java.util.Collection;

public class MStack {
    private final ArrayList<Pancake> stack = new ArrayList<>();
    private int top = -1;

    public MStack() {
    }

    public void add(Pancake el) {
        this.stack.add(el);
        this.top++;
    }

    public void addSeveral(Collection<Pancake> el) {
        for (Pancake e : el) {
            this.add(e);
        }
    }

    public void pop() {
        this.peek();
        this.stack.remove(this.top);
        this.top--;
    }

    public void peek() {
        if (this.top != -1) {
            this.stack.get(this.top).printer();
        } else {
            System.out.println("The stack is empty");
        }
    }

    public boolean empty() {
        return (this.top == -1);
    }
}
