import java.util.*;
public class hash_Camouflage {
	public static void main(String[] args) {
		//https://school.programmers.co.kr/learn/courses/30/lessons/42578/solution_groups?language=java
		//  만일 선택할 수 있는 옷가지수   [(a,1),(b,2),(c,3)] 0번째는는 옷종류  1번째는 갯수   
		// 옷갯수  (1+1)*(2+1)*(3+1)  -1  총갯수가 나옩다.
		
		String clothes[][]= {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
		
		int answer =0;
		LinkedHashMap<String, Integer> map= new  LinkedHashMap<String, Integer>();
		
		for(int i=0;i<clothes.length;i++) {
			
			if(!map.containsKey(clothes[i][1])) {
				map.put(clothes[i][1],1);
			}else {
				map.put(clothes[i][1],map.get(clothes[i][1])+1);
			}
			
		}
		Iterator<Integer> it= map.values().iterator();
		answer= map.size()>=1 ? 1: 0;
		while(it.hasNext()) {
			
			answer=answer*(it.next()+1);
		}
		answer--;
		System.out.println(answer);
	}
}
