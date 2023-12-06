public class Stack {

    protected int capacity;
    protected int[] StackRep;
    protected int top = -1;

    public static final int CAPACITY = 10;

    public Stack() {
        this(CAPACITY);
    }

    public Stack(int cap) {
        capacity = cap;
        StackRep = new int[capacity];
    }

    public int size() {
        return (top + 1);
    }

    public boolean isEmpty() {
        return (top < 0);
    }

    public int top() {
        return StackRep[top];
    }

    public boolean isStackFull() {
        System.out.println(top);
        System.out.println(capacity);
        return ((top+1) == capacity);
    }

    public void push(Nodex root) throws Exception {
        if (isStackFull()) {
            throw new Exception("Stack is FULL");
        }

        // StackRep[++top] = root;
    }

    public int pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack is Empty");
        }

        int data = StackRep[top];
        StackRep[top--] = Integer.MIN_VALUE;
        return data;
    }

    public String toString() {
        String s;
        s = "[";


        if (size() > 0) {
            s += StackRep[0];
        }
        if (size() > 1) {
            for (int i = 1; i < size(); i++) {
                s += ", " + StackRep[i];
            }
        }

        s += "]";
        return s;
    }

}