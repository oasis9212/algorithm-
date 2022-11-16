import java.util.*;
public class LZW_hashmap_ex {
	public static void main(String[] args) {
		//https://school.programmers.co.kr/learn/courses/30/lessons/17684
		String msg="ABABABABABABABAB";
		LinkedHashMap<String, Integer> map =new LinkedHashMap<String, Integer>();
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=1;i<=26;i++) {
			char a=(char) (64+i);
			map.put(String.valueOf(a), i);
		} // 알파벳 넣기
		int msglen=msg.length();
		int cur =0;
		int inc=1;
		int insert=0;
//		System.out.println(msg.substring(4,5));
		while(cur<msglen) {
			if(cur+inc>msglen) {
				String f=msg.substring(cur,msglen);
				insert=map.get(f);
				list.add(insert);
				break;
			}
			String s= msg.substring(cur, cur+inc>msglen ? msglen : cur+inc);
			if(map.containsKey(s)) {
				inc++;
				insert=map.get(s);
			}else {
				map.put(s, map.size()+1);
				list.add(insert);
				insert=0;
				cur=cur+inc-1;
				inc=1;
			}
		}
		
  		int answer[]= list.stream().mapToInt(Integer::intValue).toArray();
		
		
	}
}
