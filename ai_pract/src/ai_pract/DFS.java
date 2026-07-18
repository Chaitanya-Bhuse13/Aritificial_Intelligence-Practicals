package ai_pract;

import java.util.ArrayList;
import java.util.Scanner;

public class DFS {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of Vertices: ");
		int V = sc.nextInt();
		
		System.out.println("Enter the number of Edges: ");
		int E = sc.nextInt();
		
		ArrayList<ArrayList<Integer>>adj = new ArrayList<>();
		for(int i=0;i<V;i++) {
			adj.add(new ArrayList<>());
		}
		
		System.out.println("Enter Edges(u,v):");
		for(int i=0;i<E;i++) {
			int u = sc.nextInt();
			int v = sc.nextInt();
			
			adj.get(u).add(v);
			adj.get(v).add(u);
		}
		
		System.out.println("Enter starting node: ");
		int start = sc.nextInt();
		
		boolean[] visited = new boolean[V];
		
		System.out.println("DFS traversal");
		
		dfs(visited,adj,start);

	}

	public static void dfs(boolean[] visited, ArrayList<ArrayList<Integer>> adj, int start) {
		
		visited[start] = true;
		System.out.println(start + " ");
		
		for(int neighbour : adj.get(start)) {
			if(!visited[neighbour]) {
				dfs(visited, adj, neighbour);
			}
		}
			
		
	}

}
