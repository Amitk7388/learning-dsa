package QueueQuestions;
import java.util.Stack;

public class TwoStacksWithOneQueue<T> {
    private Stack<Integer> s1 = new Stack<Integer>();
    private Stack<Integer> s2 = new Stack<Integer>();

    public void enQueue(int data) {
        s1.push(data);
    }
    
    public int deQueue(){
        if (s2.empty()) {
            while (!s1.empty()) {
                int data = s1.pop();
                s2.push(data);
            } 
        }
        return s2.pop();
    }
}
