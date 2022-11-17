import java.util.*;

public class DFS_word {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String begin="hit";
		String target="hot";
		String words[]= {"hit", "hot", "lot"};
		boolean exist=false;

		for(String w: words) {
			if(w.equals(target)) {
				exist=true;
			}

		}
		if(!exist) {
			return ;
		}

		ArrayList<String> list =new ArrayList<String>(Arrays.asList(words));
		list.remove(begin);
		list.add(begin);

		Graph_word g= new Graph_word();
		g.createNodes(words, begin);

		for(int i=0;i<list.size()-1;i++) {
			for(int k=i+1; k<list.size();k++) {
				int len=list.get(i).length();
				String com1=list.get(i);
				String com2=list.get(k);
				int diffcount=0;
				int loc=0;
				while(loc<len) {
					if(com1.charAt(loc)!=com2.charAt(loc)) {
						diffcount++;
						if(diffcount>=2) {
							break;
						}
					}
					loc++;
				}
				if(diffcount==1) {
					g.connectNode(com1, com2);
				}
			}
		}

		System.out.println(g.godfs(target));
	}
}
class Graph_word{
	Node[] nodes;
	int answer=0;
	HashMap<String, Integer> map;
	class Node{
		String data;
		LinkedList<Node> aj;
		boolean marked;
		int count;

		public Node(String data) {
			this.data= data;
			this.aj=new LinkedList<Node>();
			this.marked=false;
			this.count=0;
		}

	}
	public void createNodes(String[] words,String begin) {
		map= new HashMap<String, Integer>();
		nodes=new Node[words.length+1];
		map.put(begin, 0);
		nodes[0]=new Node(begin);
		for(int i=1;i<=words.length;i++) {
			if(words[i-1].equals(begin)) {
				continue;
			}
			nodes[i]=new Node(words[i-1]);
			map.put(words[i-1], i);
		}
		
	}
	public void connectNode(String n1,String n2) {
		Node n1val=nodes[map.get(n1)];
		Node n2val=nodes[map.get(n2)];
		if(!n1val.aj.contains(n2val)) {
			n1val.aj.add(n2val);
			n2val.aj.add(n1val);
		}
		
	}

	public int godfs(String target) {
		Node root=nodes[0];

		Stack<Node> st= new Stack<Node>();
		st.add(root);
		root.marked=true;
		while(!st.isEmpty()) {
			Node r=st.pop();
			for(Node n:r.aj) {
				if(n.marked== false) {
					n.marked =true;
					st.push(n);
					n.count=r.count+1;
					if(n.data.equals(target)) {
						return n.count;
					}
				}
			}
		}
	
			return 0;
		
	}
}



class Solution {

    static class Node {
        String next;
        int edge;

        public Node(String next, int edge) {
            this.next = next;
            this.edge = edge;
        }
    }

    public int solution(String begin, String target, String[] words) {
        int n = words.length, ans = 0;

        // for (int i=0; i<n; i++)
        //  if (words[i] != target && i == n-1) return 0;

        Queue<Node> q = new LinkedList<>();


        boolean[] visit = new boolean[n];
        q.add(new Node(begin, 0));

        while(!q.isEmpty()) {
            Node cur = q.poll();
            if (cur.next.equals(target)) {
                ans = cur.edge;
                break;
            }

            for (int i=0; i<n; i++) {
                if (!visit[i] && isNext(cur.next, words[i])) {
                    visit[i] = true;
                    q.add(new Node(words[i], cur.edge + 1));
                }
            }
        }

        return ans;
    }

    static boolean isNext(String cur, String n) {
        int cnt = 0;
        for (int i=0; i<n.length(); i++) {
            if (cur.charAt(i) != n.charAt(i)) {
                if (++ cnt > 1) return false;
            }
        }

        return true;
    }    
}