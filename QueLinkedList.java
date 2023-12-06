class ListNode {
    int data;
    ListNode head;
    ListNode next;

    public ListNode(int data) {
        this.data = data;
    }
}

public class QueLinkedList {



    int length;
    ListNode front, rear;

    public void enQueue(int data) {
        ListNode newNode = new ListNode(data);
        
        if (isEmpty()) {
            front = newNode;
            rear = newNode;
        }

        rear.next = newNode;
        rear = newNode;
        length++;
    }

    public int deQueue() throws Exception{
        if (isEmpty()) {
            throw new Exception("List is emmpty");
        }

        ListNode tempNode = front.next;
        int result = front.data;
        front = tempNode;
        length--;

        return result;
    }

    public boolean isEmpty() {
        return this.length == 0;
    }

    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode temp = list1;


        ListNode result = new ListNode(list1.data);
        int numb = 0;
        while (numb < a) {
            result.next = list1.next;
            list1 = list1.next;

            numb++;
        }
        
        while (list2.next == null) {
            
        }


        return temp;
    }
}
