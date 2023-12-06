
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

class Nodex {
    public int data;
    public Nodex left, right;

    public Nodex(int data) {
        this.data = data;
    }
}

public class Trees {
    static Scanner sc = null;

    public static void main(String args[]) {
        sc = new Scanner(System.in);

        Nodex root = new Nodex(1);
        root.left = new Nodex(2);
        root.right = new Nodex(3);
        root.left.left = new Nodex(4);
        root.left.right = new Nodex(5);
        root.right.left = new Nodex(6);
        root.right.right = new Nodex(7);

        // preOrder(root); // pre order traversal
        // preOrderTraversalUsingStack(root);
        inOrderTraversalRecurrsion(root);

    }

    static Nodex createTree() {
        Nodex root = null;
        System.out.println("Enter data");

        int data = sc.nextInt();
        if (data == 0)
            return null;

        root = new Nodex(data);

        System.out.println("Enter left for data " + data);
        root.left = createTree();

        System.out.println("Enter Right for data " + data);
        root.right = createTree();

        return root;
    }

    static void preOrder(Nodex root) {
        if (root != null) {
            System.out.println(root.data);
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    static void preOrderTraversalUsingStack(Nodex root) {
        Stack<Nodex> stack = new Stack<Nodex>();

        if (root == null) {
            System.out.println("Tree is empty");
        }

        stack.push(root);

        while (!stack.isEmpty()) {
            Nodex currentNode = stack.pop();

            System.out.print(currentNode.data);

            if (currentNode.right != null) {
                stack.push(currentNode.right);
            }
            if (currentNode.left != null) {
                stack.push(currentNode.left);
            }
            System.out.print(" -> ");
        }

    }

    static void inOrderTraversalRecurrsion(Nodex root) {
        if (root != null) {
            // System.out.println("Tree is empty");
            // return;

            inOrderTraversalRecurrsion(root.left);
            System.out.print(root.data + " -> ");
            inOrderTraversalRecurrsion(root.right);
        }
    }

    static void inOrderTraversalUsingStack(Nodex root) {
        
    }
    static ArrayList<Integer> postOrderTraversalUsingStack(Nodex root) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Stack<Nodex> stack = new Stack<Nodex>();

        if (root == null)
            return list;

        stack.push(root);
        Nodex prev = null;

        while (!stack.isEmpty()) {
            Nodex current = stack.peek();

            if (prev == null || prev.left == current || prev.right == current) {
                if (current.left != null) {
                    stack.push(current.left);
                } else if (current.right != null) {
                    stack.push(current.right);
                }
            }

            else if (current.left == prev) {
                if (current.right != null) {
                    stack.push(current.right);
                }
            }

            else {
                list.add(current.data);
                stack.pop();
            }
            prev = current;
        }

        return list;

    }
}

// 1. Right child of 1 exists.
// Push 3 to stack. Push 1 to stack. Move to left child.
// Stack: 3, 1

// 2. Right child of 2 exists.
// Push 5 to stack. Push 2 to stack. Move to left child.
// Stack: 3, 1, 5, 2

// 3. Right child of 4 doesn't exist. '
// Push 4 to stack. Move to left child.
// Stack: 3, 1, 5, 2, 4

// 4. Current node is NULL.
// Pop 4 from stack. Right child of 4 doesn't exist.
// Print 4. Set current node to NULL.
// Stack: 3, 1, 5, 2

// 5. Current node is NULL.
// Pop 2 from stack. Since right child of 2 equals stack top element,
// pop 5 from stack. Now push 2 to stack.
// Move current node to right child of 2 i.e. 5
// Stack: 3, 1, 2

// 6. Right child of 5 doesn't exist. Push 5 to stack. Move to left child.
// Stack: 3, 1, 2, 5

// 7. Current node is NULL. Pop 5 from stack. Right child of 5 doesn't exist.
// Print 5. Set current node to NULL.
// Stack: 3, 1, 2

// 8. Current node is NULL. Pop 2 from stack.
// Right child of 2 is not equal to stack top element.
// Print 2. Set current node to NULL.
// Stack: 3, 1

// 9. Current node is NULL. Pop 1 from stack.
// Since right child of 1 equals stack top element, pop 3 from stack.
// Now push 1 to stack. Move current node to right child of 1 i.e. 3
// Stack: 1

// 10. Repeat the same as above steps and Print 6, 7 and 3.
// Pop 1 and Print 1.