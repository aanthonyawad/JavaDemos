package com.anthony.awad.demo.utils;

import com.anthony.awad.demo.utils.CircularLinkedList.ListNodeItem;

public class test {


	public static void main(String[] args) {
		CircularLinkedList c = new CircularLinkedList();
		B b = new B(1);
		B b1 = new B(1);
		B b2 = new B(1);
		B b3 = new B(1);
		B b4 = new B(1);
		
		c.addListNode(b);
		c.addListNode(b1);
		c.addListNode(b2);
		c.addListNode(b3);
		c.addListNode(b4);
		
		System.out.println(c.containsListNode(b1));
	}
	
	

	

}
