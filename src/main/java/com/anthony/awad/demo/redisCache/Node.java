package com.anthony.awad.demo.redisCache;

public class Node {
	String key;
	ICacheable value; 
	Node prev;
	Node next;
	public Node(String key, ICacheable value){
		this.key = key;
		this.value = value;
	}
}
