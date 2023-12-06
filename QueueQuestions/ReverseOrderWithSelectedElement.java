package QueueQuestions;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseOrderWithSelectedElement {
    protected int k;
    protected Queue<Integer> q;
    private Queue<Integer> list = new LinkedList<Integer>();
    private Stack<Integer> stack = new Stack<Integer>();

    public ReverseOrderWithSelectedElement(int k, Queue<Integer> q) {
        this.k = k;
        this.q = q;
    }
    

    public Queue<Integer> reverseWithQ() {

        for (int i = 0; i < this.k; i++) {
            stack.push(this.q.remove());
        }

        while (!this.stack.empty()) {
            list.add(this.stack.pop());
        }

        for (int i = 0; i < this.q.size() - this.k; i++) {
            list.add(this.q.remove());
        }
        return this.list;
    }

}