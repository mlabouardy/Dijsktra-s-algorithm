package com.labouardy.model;

public class Edge {
	
	private String id;
	private Vertex src;
	private Vertex dest;
	private int weight;
	
	
	
	public Edge(String id, Vertex src, Vertex dest, int weight) {
		super();
		this.id = id;
		this.src = src;
		this.dest = dest;
		this.weight = weight;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Vertex getSrc() {
		return src;
	}
	public void setSrc(Vertex src) {
		this.src = src;
	}
	public Vertex getDest() {
		return dest;
	}
	public void setDest(Vertex dest) {
		this.dest = dest;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	

}
