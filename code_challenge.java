import java.util.Arrays;

public class code_challenge {

	public static void main(String[] args) {
		
		long number[]={2,3};
		long dd[]=number.clone();
		
		for(int i=0;i<dd.length;i++) {
			dd[i]++;
			System.out.println((dd[i]^number[i]));
		}
		
//
//		long answer[]= new long[number.length];
//		for(int i=0;i<number.length;i++) {
//			long d= number[i];
//			if(number[i]%2==0) {
//				answer[i]=d+1;
//				continue;
//			}
//			String f=Long.toString(d,2);
//			if(f.indexOf("0")<=-1) {
//				f="10"+f.substring(1, f.length()); // 전부다 1이면.
//				answer[i]=Long.parseLong(f, 2);
//			}else {
//				int x=f.lastIndexOf("0"); // 가장 마지막인 0 찾기.
//				
//					f=f.substring(0,x)+"10"+f.substring(x+2,f.length());
//					answer[i]=Long.parseLong(f, 2);
//
//			}
//		}
		// 10
		// 11

	}

}
