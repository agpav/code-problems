package org.hr.ds.trees;

public class HeightofaBinaryTree extends AbstractTree {
	
	int height(Node root) {
		if (root == null) {
			return 0;
		}

		int leftHeight = 0;
		int rightHeight = 0;

		if (root.left != null) {
			leftHeight = 1 + height(root.left);
		}

		if (root.right != null) {
			rightHeight = 1 + height(root.right);
		}

		return Math.max(leftHeight, rightHeight);
	}

	public static void main(String[] args) {
		HeightofaBinaryTree tree = new HeightofaBinaryTree();
		Node root = tree.main();
		int height = tree.height(root);
		System.out.println(height);
	}
}
