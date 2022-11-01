import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;

public class tuple {

	public static void main(String[] args) {
		//https://school.programmers.co.kr/learn/courses/30/lessons/64065
		Scanner sc=new Scanner(System.in);
		String s= sc.next();
		System.out.println(s.replaceAll("[{]", " ").replaceAll("[}]", " ").trim());
		
		s=s.substring(2, s.length()-2);
		String d[]=s.split("\\},\\{");
		int ary[][] = new int[d.length][];
		
		for(int i=0;i<ary.length;i++) {
			ary[i]=Arrays.stream(d[i].split(",")).mapToInt(Integer::parseInt).toArray();
		}
		
		Arrays.sort(ary,new Comparator<int[]>() {
			
			@Override
			public int compare(int[] o1, int[] o2) {
				return o1.length-o2.length;
			}
			
		});
		
		HashSet<Integer> set= new HashSet<Integer>();
		int answer[] = new int[ary[ary.length-1].length];
		int idx=0;
		for(int i=0;i<ary.length;i++) {
			for(int k=0;k<ary[i].length ;k++) {
				if(!set.contains(ary[i][k])) {
					set.add(ary[i][k]);
					answer[idx]=ary[i][k];
					idx++;
				}
			}
		}
		
		System.out.println(Arrays.toString(answer));
		
	}

}
