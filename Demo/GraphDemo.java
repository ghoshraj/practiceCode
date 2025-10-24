package Demo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GraphDemo {

    static Map<Integer, List<Integer>> map = new HashMap<>();
    static boolean [] check;
    
    public static void main(String[] args) {
         int[][] arr = {
            {1, 2},
            {2, 3},
            {4, 3},
            {2, 4}
        };
        Graph graph = new Graph(4, arr);
        boolean[] visited = new boolean[5];
        graph.dfs(1,visited);
    }
}
