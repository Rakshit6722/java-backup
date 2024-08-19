import java.util.*;
public class bfsGraph {

    static ArrayList<Integer> bfsGraph(int V, ArrayList<ArrayList<Integer>> adj){
        ArrayList<Integer> bfs = new ArrayList<>();
        Queue<Integer> q = new  LinkedList<>();
        boolean va[] = new boolean[V];
        q.add(0);
        va[0] = true;
        while(!q.isEmpty()){
            int node = q.poll();
            bfs.add(node);

            for(int i : adj.get(node)){
                if(va[i]==false){
                    va[i] = true;
                    q.add(i);
                }
            }


        }
        return bfs;
    }
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0;i<5;i++){
            adj.add(new ArrayList<>());
        }
        adj.get(0).add(1);
        adj.get(1).add(0);
        adj.get(0).add(4);
        adj.get(4).add(0);
        adj.get(1).add(2);
        adj.get(2).add(1);
        adj.get(1).add(3);
        adj.get(3).add(1);

        ArrayList<Integer> ans = bfsGraph(5,adj);
        int size = ans.size();
        for(int i=0;i<size;i++){
            System.out.println(ans.get(i)+" ");
        }
    }
}
