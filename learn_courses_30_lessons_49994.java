import java.util.*;

public class learn_courses_30_lessons_49994 {

	public static void main(String[] args) {
		// https://school.programmers.co.kr/learn/courses/30/lessons/49994
		String dirs="ULURRDLLU";
		int answer=0;
		
		LinkedHashSet<String> set= new LinkedHashSet<String>();
		int loc[]= {0,0};  // x  y 
		String curloc="00";
		String berloc="00";
		for(int i=0;i<dirs.length();i++) {
			if(dirs.charAt(i)=='U') {
				if(loc[1]==5) {
					continue;
				}
				loc[1]+=1;
			}else if(dirs.charAt(i)=='D') {
				if(loc[1]==-5) {
					continue;
				}
				loc[1]-=1;
			}else if(dirs.charAt(i)=='R') {
				if(loc[0]==5) {
					continue;
				}
				loc[0]+=1;
			}else if(dirs.charAt(i)=='L') {
				if(loc[0]==-5) {
					continue;
				}
				loc[0]-=1;
			}
			
			berloc=curloc;
			curloc=loc[0]+""+loc[1];
			if(!set.contains(berloc+curloc)) {
				set.add(berloc+curloc);
				set.add(curloc+berloc);
				answer++;
			}
			
		}
		
		System.out.println(answer);
		
		
	}

}
