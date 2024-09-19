import java.util.*;

public class QueueProblem {
    public static void main(String[] args) {
        //10
        Deque<Integer> deque = new LinkedList<>();
        deque.addFirst(1);
        deque.addLast(2);
        deque.addFirst(0);
        System.out.println(deque);

        //5
        System.out.println("Generate Binary Numbers:");
        generateBinaryNumbers(5);
    }
    // 5. Generate Binary Numbers
    public static void generateBinaryNumbers(int n) {
        Queue<String> q = new LinkedList<>();
        q.offer("1");
        while (n-- > 0) {
            String s = q.poll();
            System.out.print(s );
            q.offer(s + "0");
            q.offer(s + "1");
        }
        System.out.println();
    }
    // 10. Implement Deque
    public static class MyDeque {
        LinkedList<Integer> deque = new LinkedList<>();

        public void addFirst(int x) {
            deque.addFirst(x);
        }

        public void addLast(int x) {
            deque.addLast(x);
        }

        public int removeFirst() {
            return deque.removeFirst();
        }

        public int removeLast() {
            return deque.removeLast();
        }
    }
}