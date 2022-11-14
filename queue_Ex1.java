import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class queue_Ex1 {

	public static void main(String[] args) {
		// https://school.programmers.co.kr/learn/courses/30/lessons/42586
		int progresses[]= {95, 90, 99, 99, 80, 99};
		int speeds[] =  {1, 1, 1, 1, 1, 1};
		
		Queue<Integer> qu= new LinkedList<Integer>();
		
		for(int i=0;i<progresses.length;i++) {
			int add=(100-progresses[i])/speeds[i]+((100-progresses[i])%speeds[i]==0 ? 0 : 1);
			qu.add(add);
		}
		int cur= qu.peek();
		ArrayList<Integer> list = new ArrayList<Integer>();
		int count=0;
		while(!qu.isEmpty()) {
			if(cur>=qu.peek()) {
				qu.poll();
				count++;
			}else if(cur<qu.peek()) {
				cur=qu.poll();
				list.add(count);
				count=1;
			}
		}
		if(count!=0) list.add(count);
		
		int answer[]=list.stream().mapToInt(Integer::intValue).toArray();
		
		System.out.println(Arrays.toString(answer));
		
		/////////////////////////////////////////////////////////////////////
		
		  int[] dayOfend = new int[100];
	        int day = -1;
	        for(int i=0; i<progresses.length; i++) {
	            while(progresses[i] + (day*speeds[i]) < 100) {
	                day++;
	            }
	            dayOfend[day]++;
	        }
	        Arrays.stream(dayOfend).filter(i -> i!=0).toArray();
		System.out.println();
		
	}

}
