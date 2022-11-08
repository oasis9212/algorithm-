import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class dungeon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k= 80;
		int dungeons[][] = {{80,20},{50,40},{30,10}};
		int answer = -1;
	
		
		HashSet<String> per= new HashSet<String>();
		
		for(int i=1;i<=dungeons.length;i++) {
			permuation(per,i+"",dungeons);
		}
		Iterator<String> it = per.iterator();
		
		while(it.hasNext()) {
			int hp=k;
			int count=0;
			String move= it.next();
			for(int i=0;i<move.length();i++) {
				int d=move.charAt(i)-48;
				if(hp-dungeons[d-1][0]>=0) {
					hp-=dungeons[d-1][1];
					count++;
				}
			}
			if(count==dungeons.length) {
				answer = count;
				break;
			}else if(count>answer) {
				answer= count;
			}
			
		}

		
		

		
	}

	 static void permuation(HashSet<String> per,String d,int dungeons[][]) {
		if(d.length()==dungeons.length) {
			per.add(d);
		}else {
			for(int f=1 ;f<= dungeons.length;f++) {
				if(d.indexOf(f+"")>-1) {
					continue;
				}else {
					permuation(per,d+f,dungeons);
				}
			}
			
		}
		
		
	}
	
	

}
