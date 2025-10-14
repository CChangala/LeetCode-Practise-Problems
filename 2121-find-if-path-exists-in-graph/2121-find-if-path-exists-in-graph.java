class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }

        for(int[] e:edges){
            adj.get(e[0]).add(e[1]);
            adj.get(e[1]).add(e[0]);
        }

        boolean[] visited = new boolean[adj.size()];

        Stack<Integer> stack = new Stack<>();
        stack.push(source);
        visited[source] = true;


        while(!stack.isEmpty()){
            int current = stack.pop();
            if(current == destination){
                return true;
            }
            for(int neighbor:adj.get(current)){
                if(!visited[neighbor]){
                    stack.push(neighbor);
                    visited[neighbor] = true;
                }
            }
        }
        return false;
    }
}