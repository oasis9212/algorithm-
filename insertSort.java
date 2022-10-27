import java.util.Arrays;
import java.util.Scanner;

public class insertSort {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		int ary[]=Arrays.stream(a.split(",")).mapToInt(Integer::parseInt).toArray();
		int ber=0;
		int loc=0;
		for(int i=1;i<ary.length;i++) {
			ber=ary[i];
			for(int k=i-1;k>=0;k--) {
				if(ber<ary[k]) {
					ary[k+1]=ary[k];
					loc=k;
					ary[loc]=ber;
				}
			}
			
		}
		System.out.println(Arrays.toString(ary));
		
	}
}
