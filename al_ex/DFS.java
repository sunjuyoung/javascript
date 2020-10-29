import java.util.LinkedList;

public class DFS {
    public static void main(String[] args) {
        
    }
}

class Queue<T>{

}

class Graph{
    class Node{
        int data;
        LinkedList<Node> list;
        boolean visited;
        Node(int data){
            this.data = data;
            this.visited = false;
            list = new LinkedList<>();
        }
    }

    Node[] nodes;
    Graph(int size){
        nodes = new Node[size];
        for(int i=0; i<size; i++){
            nodes[i] = new Node(1);
        }

    }

    
}
