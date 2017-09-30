import java.util.ArrayList;
import java.util.Stack;


public class TopologicalSort {
    
    private int E, V;
    private ArrayList<ArrayList<Integer>> al;
    private boolean marked[];
    private Stack<Integer> stack;
    
    TopologicalSort(int V){ //constructor
        this.V = V;
        al = new ArrayList<>();
        marked = new boolean[V];
        stack = new Stack<>();
        for(int i=0;i<V;++i){
            al.add(new ArrayList<>());
        }
    }
    
    // search
    public void dfs(int vertex){ 
        if(!marked[vertex]){
            marked[vertex] = true;
            for(int v:al.get(vertex)){
                dfs(v);
            }
            stack.push(vertex);
        }
    }
    // update method
    public void addEdge(int from, int to){
        al.get(from).add(to);
    }
    // main method
    public static void main(String[] args){
        //7 vertices in example digraph
        TopologicalSort ts = new TopologicalSort(7);
        ts.addEdge(0, 2);
        ts.addEdge(0, 5);
        ts.addEdge(0, 1);
        
        ts.addEdge(3, 2);
        ts.addEdge(3, 5);
        ts.addEdge(3, 6);
        
        ts.addEdge(6, 4);
        ts.addEdge(6, 0);
        
        ts.addEdge(1, 4);
        
        for(int i=0;i<ts.V;++i) ts.dfs(i);
        
        System.out.println("Topological Order : ");
        while(!ts.stack.isEmpty()){
            System.out.print(ts.stack.pop()+" ");
        }
    }
}

