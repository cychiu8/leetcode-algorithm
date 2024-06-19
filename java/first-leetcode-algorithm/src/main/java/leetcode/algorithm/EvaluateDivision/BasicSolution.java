package leetcode.algorithm.EvaluateDivision;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class BasicSolution extends Solution {



    @Override
    public double[] evaluateDivision(List<List<String>> equations, double[] values,
            List<List<String>> queries) {

        double[] results = new double[queries.size()];

        // convert the relations to graph
        Map<String, Map<String, Double>> graph = convertToGraph(equations, values);

        // search the queries
        for (int i = 0; i < queries.size(); i++) {
            results[i] = dfs(queries.get(i).get(0), queries.get(i).get(1), graph, new HashSet<>());
        }

        return results;
    }

    private double dfs(String from, String to, Map<String, Map<String, Double>> graph,
            Set<String> visited) {

        // if no key return -1
        if (!graph.containsKey(from))
            return -1.0;

        // if the relation is directly: return
        if (graph.get(from).containsKey(to)) {
            return graph.get(from).get(to);
        }

        // else : search the possible relation and times this
        visited.add(from);
        for (String neighbor : graph.get(from).keySet()) {
            if (visited.contains(neighbor))
                continue;
            double possibleWeight = dfs(neighbor, to, graph, visited);
            if (possibleWeight != -1.0) {
                return possibleWeight * graph.get(from).get(neighbor);
            }
        }

        return -1.0;
    }

    private Map<String, Map<String, Double>> convertToGraph(List<List<String>> equations,
            double[] values) {

        Map<String, Map<String, Double>> graph = new HashMap<>();
        int n = values.length;

        for (int i = 0; i < n; i++) {
            List<String> equation = equations.get(i);
            double value = values[i];

            String from = equation.get(0);
            String to = equation.get(1);

            if (!graph.containsKey(from)) {
                graph.put(from, new HashMap<>());
            }
            if (!graph.containsKey(to)) {
                graph.put(to, new HashMap<>());
            }

            graph.get(from).put(to, value);
            graph.get(to).put(from, 1 / value);
        }

        return graph;
    }



}
