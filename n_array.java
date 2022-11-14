
public class n_array {

	public static void main(String[] args) {
		// https://school.programmers.co.kr/learn/courses/30/lessons/87390
		int n=4;
		long left=7;
		long right=14;
		
		int answer[]=new int[(int)(right-left+1)];
		
		long cur =left;
		int loc=0;
		while(cur<=right) {
			int xloc=(int)(cur/n)+1;
			int yloc=(int)(cur%n)+1;
			int val= xloc>=yloc ? xloc :yloc;
			answer[loc]=val;
			loc++;
			cur++;
		}
	
		
	}

}
