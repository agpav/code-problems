package org.hr.ds.trees;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal extends AbstractTree {

	void levelOrder(Node root) {
		Queue<Node> queue = new LinkedList<>();
		queue.add(root);

		while (!queue.isEmpty()) {
			Node node = queue.poll();
			if (node == null) {
				continue;
			}
			System.out.print(node.data + " ");
			queue.add(node.left);
			queue.add(node.right);
		}
	}

	public static void main(String[] args) {
		LevelOrderTraversal tree = new LevelOrderTraversal();
		Node root = tree.main();
		tree.levelOrder(root);
	}
}
