package ����;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Stack;
import java.util.StringTokenizer;


public class schedule {


	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a=Integer.parseInt(br.readLine());

		int SCH[][]=new int[a][2];
		for(int i=0;i<a;i++) {
			String input = br.readLine();
			StringTokenizer st = new StringTokenizer(input," /");
			int count=0;
			while(st.hasMoreTokens()){
				if(count%2==0) {
					SCH[i][count/2]+=Integer.parseInt(st.nextToken())*100;					
				}else {
					SCH[i][count/2]+=Integer.parseInt(st.nextToken());
				}
				count++;
			}
			if(SCH[i][0]>SCH[i][1]) {
				SCH[i][1]+=1231;  // �̰� �����̶���. 
			}
		}
		Arrays.sort(SCH,new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				// TODO Auto-generated method stub
				int O1 =o1[0];
				int O2 =o2[0];
				return Integer.compare(O1, O2);
			}
		});
		for(int i=0;i<SCH.length;i++) {
			System.out.println(SCH[i][0]+" "+SCH[i][1]);
		}
		int aryST[][]=new int[a][2];
		int aryEN[][]=new int[a][2];
		int ary[]=new int[a*2];
		for(int i=0;i<SCH.length;i++) {
			aryST[i][0]=SCH[i][0];
			aryST[i][1]=i+1;
			aryEN[i][0]=SCH[i][1];
			aryEN[i][1]=(i+1)*-1;
		}
		for(int i=0;i<ary.length;i++) {
			ary[i]=
		}
		
		
		
		
		Stack<Integer> st= new Stack<Integer>();
		
		
	}
}



//int startdy=SCH[0][0]; // ���� ����
//int enddy=SCH[0][1];// ������ ������ �ϴ� �ھ� ��. 
//
//boolean checking=true;
//
//for(int i=1;i<SCH.length;i++) {
//	// �켱 �����ϰ�  enddate endstart �� ���� ���� �ľ��ϸ�ȴ�.
//	// startdy �� �켱 for ���κп��� ������ �ҿ����̴�. (���� ��¥�� �񱳸� ���ؼ�)
//	if(enddy < SCH[i][1]) {
//		if(startdy==SCH[i][0]) {
//			enddy=SCH[i][1];  // ���� ��¥�� ���� ������ ���� ��¥�� ��ũ�� ���� ���� �� ũ�� ������ �ȴ�. 
//		}else if(SCH[i][1]<=SCH[i][0]) {  // ���� ���� ���� ��¥��  �̹� �ٲ� ���۳�¥���� ũ�ٸ� �̹� ������ �����Ŵ�. 
//			enddy=SCH[i][1];
//		}else {
//			checking=false;
//			break;
//		}
//	}
//	startdy=SCH[i][0];
//}
//if(checking) {
//	System.out.println("Yes");
//
//}else {
//	System.out.println("No");
//}