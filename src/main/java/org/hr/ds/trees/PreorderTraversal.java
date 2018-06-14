package org.hr.ds.trees;

public class PreorderTraversal extends AbstractTree {

	void preOrder(Node root) {
		if (root == null) {
			return;
		}

		System.out.print(root.data + " ");
		preOrder(root.left);
		preOrder(root.right);
	}

	public static void main(String[] args) {
		PreorderTraversal tree = new PreorderTraversal();
		Node root = tree.main();
		tree.preOrder(root);
	}
}
