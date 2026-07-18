package ai_pract;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BFS {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of Vertices:");
		int V = sc.nextInt();
		
		System.out.println("Enter the number of Edges:");
		int E = sc.nextInt();
		
		//Create Adjacency List
		ArrayList<ArrayList<Integer>>adj = new ArrayList<>();
		for(int i=0;i<V;i++) {
			adj.add(new ArrayList<>());
		}
		
		//Input Edges
		System.out.println("Enter Edges(u,v): ");
		for(int i=0;i<E;i++) {
			int u = sc.nextInt();
			int v = sc.nextInt();
			
			adj.get(u).add(v);
			adj.get(v).add(u);
		}
		
		System.out.println("Enter starting node: ");
		int start = sc.nextInt();
		
		bfs(V, adj, start);
		
	}
	
	public static void bfs(int v, ArrayList<ArrayList<Integer>> adj, int start) {
		
		boolean[] visited = new boolean[v];
		Queue<Integer> q = new LinkedList<>();
		
		q.add(start);
		visited[start] = true;
		
		System.out.println("BFS traversal");
		
		while(!q.isEmpty()) {
			int node = q.poll();
			System.out.println(node + " ");
			for(int neighbour : adj.get(node)) {
				if(!visited[neighbour]) {
					visited[neighbour] = true;
					q.add(neighbour);
				}
			}
		}
	}
	
}
