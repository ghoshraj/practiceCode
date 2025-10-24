package Demo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class TopologySort {

    Map<Integer,List<Integer>> map;
    Stack<Integer> add = new Stack<>();
    public TopologySort(int n, int [][]arr){
        map = new HashMap<>();

        for(int i = 0; i <= n; i++){
            map.putIfAbsent(i, new ArrayList<>());
        }

        for(int [] nnns : arr){
            int u = nnns[0];
            int v = nnns[1];
            map.get(u).add(v);
        }

    }
        void dfs(int start, boolean[]visited){
            visited[start] = true;
            System.out.println(start);
            for(int nums : map.get(start)){
                if (!visited[nums]) {
                    dfs(nums, visited);
                }
            }
            add.push(start);
        }

    public static void main(String[] args) {
         int[][] arr = {
            {1, 2},
            {2, 3},
            {4, 3},
            {2, 4}
        };

        TopologySort sort = new TopologySort(4, arr);
        boolean[] visited = new boolean[5];
        sort.dfs(1,visited);
        System.out.println(sort.map);
        System.out.println(sort.add);
    }
}
