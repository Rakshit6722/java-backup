import java.util.*;
public class dfsGraph {

    static void dfsGraph(int node, ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> dfs, boolean[] vis){
        vis[node] = true;
        dfs.add(node);

        for(int i : adj.get(node)){
            if(vis[i]==false){
                dfsGraph(i, adj, dfs, vis);
            }
        }
    }
    static ArrayList<Integer> dfs(int V, ArrayList<ArrayList<Integer>> adj){
        boolean vis[] = new boolean[V+1];
        vis[0] = true;
        ArrayList<Integer> dfs = new ArrayList<>();
        dfsGraph(0, adj, dfs, vis);
        return dfs;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        adj.get(0).add(2);
        adj.get(2).add(0);
        adj.get(0).add(1);
        adj.get(1).add(0);
        adj.get(0).add(3);
        adj.get(3).add(0);
        adj.get(2).add(4);
        adj.get(4).add(2);
        ArrayList<Integer> ans = dfs(n, adj);
        for(int i=0;i<ans.size();i++){
            System.out.println(ans.get(i)+" ");
        }
    }
}
