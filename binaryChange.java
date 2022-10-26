import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class binaryChange {
	// 결과값
	static int[] ary= {0,0}; 
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String a = br.readLine();
		StringBuffer an= new StringBuffer();
		an.append(a);
		sol(an);
		System.out.println(ary[0]+"??"+ary[1]);
		
	}

	public static void sol(StringBuffer an) {
		
		if(an.toString().equals("1")) {
			return;
		}else {
			StringBuffer NewAn=new StringBuffer();
			int zeroDel =0;
			double birMax = 1; 
			for(int i=0;i<an.length();i++) {
				if(an.charAt(i)=='0') {
					ary[1]++; // 0 인것을 배열 +1
				}else {
					zeroDel++; // 아닌건 인트값 +1
				}
			}
			// 이진법 생성
			while(true) {
				if(birMax*2<=zeroDel) {
					birMax=birMax*2;
				}else {
					break;						
				}
			}
			// 이진법화
			while(birMax>=1) {
				if(zeroDel-birMax>=0) {
					zeroDel=(int) (zeroDel-birMax);
					birMax=birMax/2;
					NewAn.append("1");
				}else {
					birMax=birMax/2;
					NewAn.append("0");
				}
			}
			// 남은 숫자 전부 0 처리
			ary[0]++;
			sol(NewAn);
		}
	}
}
