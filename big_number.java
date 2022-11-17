

public class big_number {

	public static void main(String[] args) {
		// https://school.programmers.co.kr/learn/courses/30/lessons/42883
		// 탐욕에 스택을 사용가능하다. 
		String number="4177 /52841";
		int k=4;
		// 2
		// 775
		StringBuffer sb= new StringBuffer();
		int fillup=number.length()-k; // 채울 자리수.
		
		//int loc=0;
		int insertnum=9;
		
		while(fillup>0) {
			int loc=number.indexOf(insertnum+"");
			 
			if(loc<0) { // max 넘 못찾을때.
				insertnum--;
			}else {
				
				if(fillup>=number.length()-loc+1) { // 이건 안됨.  자리수 부족
					insertnum--;
					loc=0;
				}else {
					fillup--;
					sb.append(insertnum);
					insertnum=9;
					number=number.substring(loc+1,number.length());
				}
			}	
		}
		String answer= sb.toString();
		System.out.println(sb);
		//123 1234
		//012 3456  4자리 채운다면 여기서부턴안된다.
		
		
		
	}

}

//class Solution {
//    public String solution(String number, int k) {
//        char[] result = new char[number.length() - k];
//        Stack<Character> stack = new Stack<>();
//
//        for (int i=0; i<number.length(); i++) {
//            char c = number.charAt(i);
//            while (!stack.isEmpty() && stack.peek() < c && k-- > 0) {
//                stack.pop();
//            }
//            stack.push(c);
//        }
//        for (int i=0; i<result.length; i++) {
//            result[i] = stack.get(i);
//        }
//        return new String(result);
//    }
//}
//
