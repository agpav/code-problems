package org.hr.ds.trees;

public class InorderTraversal extends AbstractTree {
	void inOrder(Node root) {
		if (root == null) {
			return;
		}

		inOrder(root.left);
		System.out.print(root.data + " ");
		inOrder(root.right);
	}

	public static void main(String[] args) {
		InorderTraversal tree = new InorderTraversal();
		Node root = tree.main();
		tree.inOrder(root);
	}

}
