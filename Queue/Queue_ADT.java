import java.util.Scanner;

class Queue_ADT {
    int front, rear,Maxsize, q[];

    Queue_ADT(int size) {
        
        Maxsize = size;
        rear=-1;
        front=0;
        q = new int[Maxsize];
    }

    void enqueue(int e) {
        q[++rear] =e;
        
    }

    boolean isFull() {
        return (rear == Maxsize - 1);
    }

    int dequeue() {
        
        int temp = q[front];
        front++;
        return temp;
        
    }

    

    boolean isEmpty() {
        return (front>rear);
    }

    void printQueue() {
        for (int i = front; i >= rear; i++) {
            System.out.println(q[i]);
        }
    }




	public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter size of the queue: ");
            int size = sc.nextInt();
            Queue_ADT st = new Queue_ADT(size);
            
            int choice;
            do {
                System.out.println("\n--- Queue Menu ---");
                System.out.println("1. Add");
                System.out.println("2. Delete");
                System.out.println("3. Print Queue");
                System.out.println("4. Check if Empty");
                System.out.println("5. Check if Full");
                System.out.println("6. Exit");
                System.out.print("Enter your choice: ");
                choice = sc.nextInt();
                
                switch (choice) {
                    case 1 -> {
                        System.out.print("Enter element to Add: ");
                        int val = sc.nextInt();
                        st.enqueue(val);
                    }
                    case 2 -> {
                        int delete = st.dequeue();
                        if (delete != -1)
                            System.out.println("deleted item: " + delete);
                    }
                    case 3 -> st.printQueue();
                    case 4 -> System.out.println("Is queue empty? " + st.isEmpty());
                    case 5 -> System.out.println("Is queue full? " + st.isFull());
                    case 6 -> System.out.println("Exiting...");
                    default -> System.out.println("Invalid choice! Try again.");
                }
                
            } while (choice != 6);
        }
	}
}


