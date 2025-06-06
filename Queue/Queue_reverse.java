import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;


public class Queue_reverse {



    public static void Queue_revers(Queue<Integer> q, int k){
        
        Stack<Integer> stack = new Stack<>();



        
        for (int i = 0; i < k; i++) {
            stack.push(q.remove());
        }

        
        while (!stack.isEmpty()) {
            q.add(stack.pop());
        }

       
        int size = q.size();
        for (int i = 0; i < size - k; i++) {
            q.add(q.remove());
        }
        
    }


    
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Queue<Integer> q = new LinkedList<>();

            System.out.print("Enter number of elements in the queue: ");
            int n = sc.nextInt();

            
            
      
            for (int i = 1; i <=n; i++) {
                q.add(i);
            }

            
            System.out.println("queue: " + q);

            int k = sc.nextInt();

            

            Queue_revers(q, k);
            
            System.out.println(q);

            System.out.println("Queue after reversing " + k + " elements: " + q);
        }
    }
}
