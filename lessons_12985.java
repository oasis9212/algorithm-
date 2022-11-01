import java.util.Scanner;

public class lessons_12985 {

	public static void main(String[] args) {
		// https://school.programmers.co.kr/learn/courses/30/lessons/12985
		Scanner sc=new Scanner(System.in);
	
		int n=sc.nextInt();
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		int answer=1;
		while(true) {
			if(Math.ceil(((double)a)/2)==Math.ceil(((double)b)/2)) {
				break;
			}
			
			a=(int) Math.ceil(((double)a)/2);
			b=(int) Math.ceil(((double)b)/2);
			answer++;
			
		}
		
		System.out.println(answer);
		
		
		
	}

}
