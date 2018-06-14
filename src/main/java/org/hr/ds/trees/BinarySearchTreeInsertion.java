package org.hr.ds.trees;

public class BinarySearchTreeInsertion extends AbstractTree {

	Node insert1(Node root, int value) {
		if (root == null) {
			Node node = new Node(value);
			root = node;
		} else if (root.data > value) {
			root.left = insert1(root.left, value);
		} else if (root.data < value) {
			root.right = insert1(root.right, value);
		}
		return root;
	}

	public static void main(String[] args) {
		BinarySearchTreeInsertion tree = new BinarySearchTreeInsertion();
		Node root = tree.main();
		tree.insert1(root, 6);
	}
}
