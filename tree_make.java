//
//public class tree_make {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Tree t = new Tree();
//		Node n4 = t.makeNode(null, 4, null);
//		Node n5 = t.makeNode(null, 5, null);
//		Node n2 = t.makeNode(n4, 2, n5);
//		Node n3 = t.makeNode(null, 3, null);
//		Node n1 = t.makeNode(n2, 1, n3);
//		t.setRoot(n1);
//		t.preorder(t.getRoot());
//	}
//
//
//}
//
//class Node{
//	int data;
//	Node Left;
//	Node Right;
//}
//class Tree{
//	public Node root;
//
//	public Node getRoot() {
//		return root;
//	}
//
//	public void setRoot(Node root) {
//		this.root = root;
//	}
//	public Node makeNode(Node left,int data,Node Right) {
//		Node node= new Node();
//		node.Left = left;
//		node.Right = Right;
//		node.data = data;
//		return node;
//	}
//	
//	public void inorder(Node node) {
//		if(node !=null) {
//			inorder(node.Left);
//			System.out.println(node.data);
//			inorder(node.Right);
//		}
//	}
//	public void preorder(Node node) {
//		if(node !=null) {
//			System.out.println(node.data);
//			preorder(node.Left);
//			preorder(node.Right);
//		}
//	}
//	public void postorder(Node node) {
//		if(node !=null) {
//			postorder(node.Left);
//			postorder(node.Right);
//			System.out.println(node.data);
//		}
//	}
//}