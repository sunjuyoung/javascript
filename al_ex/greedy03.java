import java.util.*;
public class greedy03 {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        Queue<Integer> q = new LinkedList<>();

        s.push(1);
        s.push(2);
        s.push(3);
        s.pop();
        s.push(4);
        s.push(5);
        s.push(6);

        q.offer(1);
        q.offer(2);
        q.offer(3);
        q.poll();
        q.offer(4);
        q.offer(5);
        q.offer(6);

        while(!s.empty()){
            System.out.println(s.peek());
            s.pop();
        }

        while(!q.isEmpty()){
            System.out.println(q.poll());
        }
        
        

    }
}
