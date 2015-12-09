package com.labouardy.test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.labouardy.engine.DijkstraAlgorithm;
import com.labouardy.model.Edge;
import com.labouardy.model.Graph;
import com.labouardy.model.Vertex;

public class Main {
	public static void main(String[] args) {
		String[] stations={"A","B","C","D","E"};
		List<Vertex> nodes = new ArrayList<Vertex>();
		List<Edge> edges = new ArrayList<Edge>();
		for(String station:stations)
			nodes.add(new Vertex(station, station));
		
		
	    Edge a_b=new Edge("A_B", nodes.get(0), nodes.get(1), 3);
	    Edge b_a=new Edge("B_A", nodes.get(1), nodes.get(0), 3);
	    Edge a_d=new Edge("A_D", nodes.get(0), nodes.get(3), 6);
	    Edge b_c=new Edge("B_C", nodes.get(1), nodes.get(2), 7);
	    Edge c_d=new Edge("C_D", nodes.get(2), nodes.get(3), 8);
	    Edge d_e=new Edge("D_E", nodes.get(3), nodes.get(4), 9);
	    Edge e_d=new Edge("E_D", nodes.get(4), nodes.get(3), 9);
	    Edge d_c=new Edge("D_C", nodes.get(3), nodes.get(2), 9);
	    Edge d_b=new Edge("D_B", nodes.get(3), nodes.get(1), 5);
	    Edge c_e=new Edge("C_E", nodes.get(2), nodes.get(4), 3);
	    
	    edges.add(a_b);
	    edges.add(b_a);
	    edges.add(a_d);
	    edges.add(b_c);
	    edges.add(c_d);
	    edges.add(d_e);
	    edges.add(e_d);
	    edges.add(d_c);
	    edges.add(d_b);
	    edges.add(c_e);
	    
	    Graph graph = new Graph(nodes, edges);
	    DijkstraAlgorithm dijkstra = new DijkstraAlgorithm(graph);
	    dijkstra.execute(nodes.get(0));
	    LinkedList<Vertex> path = dijkstra.getPath(nodes.get(4));
	    for(Vertex v:path)
	    	System.out.println(v);
	}
	
}
