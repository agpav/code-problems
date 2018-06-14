package org.hr.ds.trees;

public class PostorderTraversal extends AbstractTree {
	void postOrder(Node root) {
		if (root == null) {
			return;
		}

		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data + " ");
	}

	public static void main(String[] args) {
		PostorderTraversal tree = new PostorderTraversal();
		Node root = tree.main();
		tree.postOrder(root);
	}
}
