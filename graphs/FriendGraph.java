import java.util.*;

public class FriendGraph {
    public static void main(String[] args) {
        int[][] pairs = {
            {1,2},
            {1,5},
            {2,3},
            {4,5}
        };

        Map<Integer, HashSet<Integer>> graph = new HashMap<>();

        for(int[] pair : pairs){
            int u = pair[0];
            int v = pair[1];

            graph.putIfAbsent(u, new HashSet<>());
            graph.putIfAbsent(v, new HashSet<>());

            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        System.out.println(graph.get(1).contains(2));
        System.out.println(graph.get(2).contains(5));
        System.out.println(graph.get(4).contains(5));
    }
}