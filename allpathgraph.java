import javax.sql.rowset.spi.SyncResolver;

public class allpathgraph {
    public class Edge {
        int s;
        int d;
        Edge(int src,int dest) {
            this.s=src;
            this.d=dest;
        }
    }
    public void printpath(ArrayList<Edge> graph,boolean visit[],int cur,String path,int des) {
        if(cur=tar) {}
            System.out.println(path);
            return;
    }
    for(int i=0;i<graph[cur].size();i++) {
        Edge e=graph[cur].get(i);
        if(!visit[e.dest]) {
            vis[cur]=true;
            printpath(graph, visit, e.dest, path+e.dest,tar);
            vis[cur]=false;
        }
    }

    }

    
}
