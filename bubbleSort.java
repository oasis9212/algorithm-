import java.util.Arrays;
import java.util.Scanner;

public class bubbleSort {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		int ary[]=Arrays.stream(a.split(",")).mapToInt(Integer::parseInt).toArray();
		int ber=0;
		int aft=0;
		
		for(int i=0;i<ary.length;i++) {
			for(int k=0;k<ary.length-i-1;k++) {
				ber=ary[k];
				aft=ary[k+1];
				if(ber>aft) {
					ary[k]=aft;
					ary[k+1]=ber;
				}
			}
		}
		System.out.println(Arrays.toString(ary));
	}
}
