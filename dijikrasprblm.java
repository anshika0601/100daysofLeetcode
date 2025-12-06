import java.util.ArrayList;

public class dijikrasprblm {
    static class Edge {
        int src,dest, weight;
        Edge(int src,int dest, int weight) {
            this.src = src;
            this.dest=dest;
            this.weight = weight;
        }
        public void createGraph(ArrayList<Edge> graph[]) {
            for(int i=0;i< graph.length;i++) {
                graph[i]=new ArrayList<Edge>();

            }
            graph[0].add(new Edge(0,1,2));
            graph[0].add(new Edge(0,2,4));


            graph[1].add(new Edge(1,3,7));
            graph[1].add(new Edge(1,2,1));

            graph[2].add(new Edge(2,4,3));
            graph[3].add(new Edge(3,5,1));
            graph[4].add(new Edge(4,3,2));
            graph[4].add(new Edge(4,5,5));
        }
        
    }
    public void shortestpath(int v,ArrayList<Edge> graph[],int src) {
        int[] dis=new int[v];
        for(int i=0;i<v;i++) {
            if(i!=src) {
                dist[i]=Integer.MAX_VALUE;
            }
        }
        dis[src]=0;
        

        boolean[] visit=new boolean[v];
        Arrays.fill(visit,false);
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.offer(new Pair(src, 0));

        while (!pq.isEmpty()) {
            Pair current = pq.poll();//shortest
            if(!visit[current.node])
            visit[current.node]=true;
            int u = current.node;
            int d = current.weight;

            for (int i=0;i<graph[current.node].size();i++) {
                Edge e=graph[current.node].get(i);
                int u = e.src;
                int v = e.dest;
                if (dist[u] + e.wt < dist[v]) {
                    dist[v] = dist[u] + e.wt;
                    pq.offer(new Pair(v, dist[v]));
                }
            }
        }

        for(int i=0;i<v;i++) {
            System.out.println(dist[i]+" ");
        }
        System.out.println();
    }

    public static class Pair implements Comparable<Pair> {
        int node;
        int dist;
        Pair(int n,int d) {
            this.node=n;
            this.dist=d;
        }
        @Override
        public int compareTo(Pair p2) {
            return this.dist-p2.dist;
            //for desc return p2.dist-this.dist;
        }
    }

    }

    

public class Main {
    public static void main() {
        int v=6;
        ArrayList<Edge> graph[]=new ArrayList<>(v);
        createGraph(graph);
        dijkstra(v, graph, 0);

    }
}