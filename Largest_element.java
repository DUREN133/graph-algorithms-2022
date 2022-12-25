import com.mathsystem.api.graph.model.Edge;
import com.mathsystem.api.graph.model.Graph;
import com.mathsystem.api.graph.model.Vertex;
import com.mathsystem.domain.graph.repository.Color;
import com.mathsystem.domain.plugin.plugintype.GraphProperty;

import java.util.*;

public class Largestelement implements GraphProperty {

    private int V;
    UUID[] vert;
    private ArrayList<ArrayList<Integer>> adj;


    void topologicalSortUtil(int v, boolean[] visited,
                             Stack<Integer> stack)
    {

        visited[v] = true;
        Integer i;

        for (Integer integer : adj.get(v)) {
            i = integer;
            if (!visited[i])
                topologicalSortUtil(i, visited, stack);
        }

        stack.push(v);
    }

    UUID topologicalSort()
    {
        Stack<Integer> stack = new Stack<>();

        boolean[] visited = new boolean[V];
        for (int i = 0; i < V; i++)
            visited[i] = false;

        for (int i = 0; i < V; i++)
            if (!visited[i])
                topologicalSortUtil(i, visited, stack);
        UUID max_elem = null;
        min_elem = convert(stack.pop());

        return max_elem;

    }

    void Add_edge(int x, int y)
    {
        adj.get(x).add(y);
    }


    int find(UUID num){
        int r = 0;
        for (int j=0; j < vert.length; j++){

            if (vert[j].equals(num))
                r = j;
        }
        return r;
    }

    UUID convert(int num){
        UUID r = null;
        for (int j=0; j < vert.length; j++){

            if (j == num)
                r = vert[j];
        }
        return r;
    }


    void get_adj(Map<UUID, Vertex> g, Integer Vertex_count, List<Edge> edges) {

        adj = new ArrayList<>(Vertex_count);

        V = Vertex_count;

        for (int i = 0; i < Vertex_count; i++)
            adj.add(new ArrayList<>());

        vert = new UUID[Vertex_count];


        int i = -1;
        for (Map.Entry<UUID, Vertex> f : g.entrySet()) {
            vert[++i] = f.getKey();
        }


        for (Edge tmp : edges) {
            int from = find(tmp.getFromV());
            int to = find(tmp.getToV());
            Add_edge(from, to);
        }
    }



    @Override
    public boolean execute(Graph graph) {
        get_adj(graph.getVertices(), graph.getVertexCount(), graph.getEdges());
        Color red_color = Color.valueOf("red");

        int flag = 0;

        for (Map.Entry<UUID, Vertex> f : graph.getVertices().entrySet()) {
            if (f.getValue().getColor() == red_color) {
                ++flag;
                if (flag > 1) {
                    break;
                }
            }
        }

        return (flag == 1) & (graph.getVertices().get(topologicalSort()).getColor() == red_color);

    }
}