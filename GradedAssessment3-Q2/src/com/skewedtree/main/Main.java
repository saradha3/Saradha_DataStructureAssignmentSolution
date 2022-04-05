package com.skewedtree.main;

import com.skewedtree.model.Node;
import com.skewedtree.service.BstToSkewed;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BstToSkewed tree = new BstToSkewed();
		tree.node = new Node(50);
		tree.node.left = new Node(30);
		tree.node.right = new Node(60);
		tree.node.left.left = new Node(10);
		tree.node.right.left= new Node(55);
		
		tree.convertBstToSkewed(tree.node);
		tree.traverseRightSkewed(tree.headNode);
		
		

	}

}
