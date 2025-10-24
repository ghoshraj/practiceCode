package Demo;
import java.util.*;

public class Graph {
    Map<Integer,List<Integer>> map;
    public Graph(int n,int[][] edges){
        map = new HashMap<>();
        for(int i=0;i<=n;i++){
            map.putIfAbsent(i, new ArrayList<>());
        }

        for(int[] adList:edges){
            int u = adList[0];
            int v = adList[1];
            map.get(u).add(v);
        }
    }
    void dfs(int start, boolean[] visited){
        visited[start] = true;
        System.out.print(start+"->");
        for(int node:map.get(start)){
            if(!visited[node]){
                dfs(node,visited);
            }
        }
    }
}
