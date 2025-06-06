import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Queue_linked{
    Queue<Integer> q;

    Queue_linked() {
        q = new LinkedList<>();
    }

    void enqueue(int e) {
        q.add(e);
    }

    int dequeue() {
        if (!q.isEmpty()) {
            return q.remove();
        } else {
            System.out.println("Queue is empty!");
            return -1;
        }
    }

    boolean isEmpty() {
        return q.isEmpty();
    }

    boolean isFull() {
        // Java LinkedList queue isn't bounded
        return false;
    }

    void printQueue() {
        System.out.println("Queue elements: " + q);
    }

    // Generate binary numbers from 1 to n
    void binaryno(int n) {
        Queue<String> b = new LinkedList<>();
        b.add("1");

        System.out.println("Binary numbers" + n + ":");
        for (int i = 0; i < n; i++) {
            String bin = b.remove();
            System.out.println(bin);
            b.add(bin + "0");
            b.add(bin + "1");
        }
    }

    public static void main(String[] args) {
        Queue_linked st = new Queue_linked();

        try (Scanner sc = new Scanner(System.in)) {
            int choice;
            do {
                System.out.println("\n--- Queue Menu ---");
                System.out.println("1. Add");
                System.out.println("2. Delete");
                System.out.println("3. Print Queue");
                System.out.println("4. Check if Empty");
                System.out.println("5. Check if Full");
                System.out.println("6. Generate Binary Numbers");
                System.out.println("7. Exit");
                System.out.print("Enter your choice: ");
                choice = sc.nextInt();

                switch (choice) {
                    case 1 -> {
                        System.out.print("Enter element to Add: ");
                        int val = sc.nextInt();
                        st.enqueue(val);
                    }
                    case 2 -> {
                        int deleted = st.dequeue();
                        if (deleted != -1)
                            System.out.println("Deleted item: " + deleted);
                    }
                    case 3 -> st.printQueue();
                    case 4 -> System.out.println("Is queue empty? " + st.isEmpty());
                    case 5 -> System.out.println("Is queue full? " + st.isFull());
                    case 6 -> {
                        System.out.print("Enter how many binary numbers to generate: ");
                        int n = sc.nextInt();
                        st.binaryno(n);
                    }
                    case 7 -> System.out.println("Exit");
                    default -> System.out.println("Invalid!");
                }

            } while (choice != 7);
        }
    }
}
