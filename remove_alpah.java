import java.util.Stack;

public class remove_alpah {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="baabaa";
		int answer = 1;
		Stack<Character> st = new Stack<Character>();
		
		for(int i=0;i<s.length();i++) {
			if(st.isEmpty()) {
				st.add(s.charAt(i));
			}else if(st.peek()==s.charAt(i)) {
				st.pop();
			}else {
				st.add(s.charAt(i));
			}
			
		}
		
	}

}
