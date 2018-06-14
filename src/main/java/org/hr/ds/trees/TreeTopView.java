package org.hr.ds.trees;

public class TreeTopView extends AbstractTree {

	void topView(Node root) {
		printLeft(root.left);
		System.out.print(root.data + " ");
		printRight(root.right);
	}

	void printLeft(Node root) {
		if (root == null) {
			return;
		}
		printLeft(root.left);
		System.out.print(root.data + " ");
	}

	void printRight(Node root) {
		if (root == null) {
			return;
		}
		System.out.print(root.data + " ");
		printRight(root.right);
	}

	public static void main(String[] args) {
		TreeTopView tree = new TreeTopView();
		Node root = tree.main();
		tree.topView(root);
	}

}
