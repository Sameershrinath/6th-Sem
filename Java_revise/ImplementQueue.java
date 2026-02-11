public class ImplementQueue {

    int left = 0;
    int right = -1;
    int maxlen = 5;
    int size= 0;

    int[] queuearr = new int[maxlen];

    public void enque(int num) {
        if (size == maxlen) {
            System.out.println("Queue is full");
        } else {
            right += 1;
            queuearr[right] = num;
            size += 1;
            System.out.println("Element is inserted :" + queuearr[right]);
        }
    }

    public void deque() {
        if (size == 0) {
            System.out.println("there is no element in the queue");
        } else {
            System.out.println("removing the element from queue" + queuearr[left]);
            left += 1;
            size -= 1;
        }

    }

    public void peek() {
        if (size == 0) {
            System.out.println("There is no element in the queue");
        } else {
            System.out.println("The peek element is " + queuearr[left]);
        }
    }

    static void main(String[] args) {

        ImplementQueue q = new ImplementQueue();

        q.enque(45);
        q.enque(95);
        q.peek();
        q.enque(85);
        q.peek();
        q.enque(98);
        q.peek();
        q.enque(100);
        q.peek();
        q.enque(100);
        q.deque();
        q.deque();
        q.deque();
        q.deque();
        q.deque();
        q.deque();



    }
}
