import java.util.*;

public class Priority_Queue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String operations[]= {"I 16", "I -5643", "D -1", "D 1", "D 1", "I 123", "D -1"};
		
		PriorityQueue<Integer> qumin= new PriorityQueue<Integer>();
		PriorityQueue<Integer> qumax= new PriorityQueue<Integer>(Collections.reverseOrder());
		int answer[]= {0,0};
		for(int i=0;i<operations.length;i++) {
			String ary[]=operations[i].split(" ");
			if(ary[0].equals("I")) {
				qumin.add(Integer.parseInt(ary[1]));
				qumax.add(Integer.parseInt(ary[1]));
			}else if(!qumax.isEmpty()){
				if(ary[1].equals("-1")) {
					int min=qumin.poll();
					qumax.remove(min);
				}else if(ary[1].equals("1")) {
					int max=qumax.poll();
					qumin.remove(max);
				}
			}
		}
		answer[1]=qumin.size()==0 ? 0:qumin.poll();
		answer[0]=qumax.size()==0 ? 0:qumax.poll();
		
		System.out.println(Arrays.toString(answer));
	}
}