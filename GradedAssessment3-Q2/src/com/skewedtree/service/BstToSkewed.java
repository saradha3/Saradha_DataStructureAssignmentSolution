package com.skewedtree.service;

import com.skewedtree.model.Node;

public class BstToSkewed {
	
	public static Node node;
	public static Node prevNode = null;
	public static Node headNode = null;
	
	 public void convertBstToSkewed(Node root) {
		if(root == null) {
			return;
		}
		
		convertBstToSkewed(root.left);
		
		Node rightNode = root.right;
		Node leftNode = root.left;
		
		if(headNode == null) {
			headNode = root;
			root.left = null;
			prevNode = root;
		}
		else {
			prevNode.right = root;
			root.left = null;
			prevNode = root;
		}
		
		convertBstToSkewed(rightNode);
	}
	
	public void traverseRightSkewed(Node root) {
		if(root == null) {
			return;
		}
		System.out.println(root.val + " ");
		traverseRightSkewed(root.right);
	}

}
