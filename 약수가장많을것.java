package ����;

import java.util.Scanner;

public class ������帹���� {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();



		if(a!=b ||  b%2==0) {
			System.out.println(2);
		}else {
			boolean checing=false;
			for(int i=2;i<=b/2;i++) {
				if(b%i==0) {
					System.out.println(i);
					checing=true;
					break;
				}
			}
			if(!checing) {
				System.out.println(b);
			}
		}


	}

}
//349533413 349533413

