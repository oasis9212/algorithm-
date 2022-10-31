import java.util.Arrays;

public class Dynamic_Programming {
	public static void main(String[] args) {
		int triangle[][]= {{7}, {3, 8}, {8, 1, 0}, {2, 7, 4, 4}, {4, 5, 2, 6, 5}};
	//	int triangle[][]= {{7}, {3, 8}, {8, 1, 0}};
		int ary[][]=triangle;
		int ary2[]= {triangle[0][0]};
		for(int i=1;i<ary.length;i++) {
			int changeary[]=new int[i+1]; // ary2= changeary  3
			for(int k=0;k<ary2.length;k++) {
				if(triangle[i][k]+ary2[k]>changeary[k]) { // 제일큰것만 가져와서 거른다
					changeary[k]=triangle[i][k]+ary2[k];					
				}
				if(triangle[i][k+1]+ary2[k]>changeary[k+1]) { // 제일큰것만 가져와서 거른다
					changeary[k+1]=triangle[i][k+1]+ary2[k];					
				}
			}
			ary2=changeary;
		}
		System.out.println(Arrays.toString(ary2));
		int answer=0;
		for(int i=0;i<ary2.length;i++) {
			if(answer<ary2[i]) {
				answer=ary2[i];
			}
		}
		System.out.println(answer);




	}
}
