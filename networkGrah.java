import java.util.LinkedList;
import java.util.Stack;

public class networkGrah {

	public static void main(String[] args) {

		int n = 3;
		int computers[][]= {{1, 1, 0}, {1, 1, 1}, {0, 1, 1}};
		networkGrah_ linking= new networkGrah_(n);
		for(int i=0;i<computers.length;i++) {
			linking.addedge(i, computers[i]);
		}
		
		System.out.println(linking.searchlinked());
	}

}

class networkGrah_ {
	
	class networkNode {
		int data;
		LinkedList<networkNode> aj;		
		boolean marked;
		public networkNode(int data) {
			this.data= data;
			this.aj = new LinkedList<networkNode>();
			this.marked= false;
		}
	}	
	networkNode[] nodes;
	public networkGrah_(int size) {
		nodes=new networkNode[size];
		for(int i =0;i<size;i++) {
			nodes[i]= new networkNode(i);
		}
	}
	
	public void addedge(int n1,int linked[]) {
		networkNode n= nodes[n1];
		
		for(int i=0;i<linked.length;i++) {
			if(i== n1)continue;
			networkNode target=  nodes[i];
			if(!n.aj.contains(target) && linked[i] == 1) {
				n.aj.add(target);
			}
		}
		
	}
	
	public int searchlinked() {
		int answer=0;
		Stack<networkNode> st = new Stack<networkNode>();
		for(int i=0;i< nodes.length;i++) {
			if(nodes[i].marked) continue;
			else {
				networkNode n= nodes[i];
				st.add(n);
				n.marked=true;
				while(!st.isEmpty()) {
					networkNode p= st.pop();
					for(networkNode ary:p.aj) {
						if(!ary.marked) {
							ary.marked= true;
							st.add(ary);							
						}
					}
				}
				answer++;
			}
		}
		
		
		return answer;
		
	}
	
}
