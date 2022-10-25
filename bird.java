import java.io.*;

public class bird {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a = Integer.parseInt(br.readLine());
		String ary[]=new String[a];
		
	
		for (int i = 0; i < ary.length; i++) {
			ary[i] = br.readLine();
		}

		for (int i = 0; i < ary.length; i++) {
			String str = "";
			for (int k = 0; k < ary[i].length(); k++) {
				if (checking(ary[i].charAt(k))) {
					str += ary[i].charAt(k);
				}
			}
			if (str.equals("")) {
				System.out.println("???");
			} else {
				System.out.println(str);
			}
		}

	}


	private static boolean checking(char ch) {

		if(ch==65||ch==69||ch==73||ch==79||ch==85||ch==65+32||ch==69+32||ch==73+32||ch==79+32||ch==85+32){
			return true; 
		}

		return false; 
	}

}
