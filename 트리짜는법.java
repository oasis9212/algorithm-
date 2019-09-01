package 트리구조;

import java.util.Arrays;
import java.util.Scanner;


public class 트리짜는법 {
	
	static int[] ary=new int[1];

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		int a=sc.nextInt();
		for(int i=0;i<a;i++) {
			String str=sc.next();
			if(i==0) {
				ary[0]=str.charAt(0)-64;
			}else {
				add(str);
			}
		}	
		Arrays.sort(ary);
		System.out.println(ary[0]+"\n"+ary[ary.length-1]);

	}


	private static void add( String str) {
		int[] beforeary=Arrays.copyOf(ary, ary.length);
		ary=new int[str.length()];
		for(int i=0;i<ary.length;i++) {
			ary[i]=beforeary[i/2]+str.charAt(i)-64;
		}
	}


}
// http://edu.goorm.io/learn/lecture/11220/%ED%94%84%EB%A6%AC%EB%AF%B8%EC%97%84-%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98-%EC%9C%84%ED%81%B4%EB%A6%AC-%EB%B9%84%ED%83%80%EC%95%8C%EA%B3%A0-%EC%8B%9C%EC%A6%8C1/lesson/488077/03%EC%9B%94-2%EC%A3%BC%EC%B0%A8-%EC%95%8C%ED%8C%8C%EB%B2%B3-%ED%8A%B8%EB%A6%AC-%EC%9E%A5%EB%82%9C%EA%B0%90-2
// 굳이 트리구조로 생각안하고 다이내믹 프로그래밍으로 구상했다. 