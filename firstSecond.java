import java.util.Scanner;

public class firstSecond {
// �ʹ� ����. 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		boolean cehing=false;  // 
		if(a.indexOf("12")!=-1) { // ���� ������.
			System.out.println(a.indexOf("12"));
			a=a.substring(0,a.indexOf("12"))+a.substring(a.indexOf("12")+2, a.length());
			if(a.indexOf("21")!=-1) {
				cehing=true;
			}
			
		}
		if(cehing) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		

	}

}
