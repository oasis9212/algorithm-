
import java.util.*;

public class skillTree {
	public static void main(String[] args) {
		// https://school.programmers.co.kr/learn/courses/30/lessons/49993
		String skill="CBD";
		String skill_trees[]= {"BACDE", "CBADF", "AECB", "BDA"};
		LinkedHashMap<Character, Integer> map= new LinkedHashMap();
		int answer=0;

		for(int i=0;i<skill.length();i++) {
			map.put(skill.charAt(i), i);
		}
		for(int i=0;i<skill_trees.length;i++) {
			int tech=0; // 0 번부터 시작
			boolean right=false;
			for(int k=0;k<skill_trees[i].length();k++) {
				if(map.containsKey(skill_trees[i].charAt(k)) && map.get(skill_trees[i].charAt(k))==tech) {
					tech++;
				}else if(map.containsKey(skill_trees[i].charAt(k)) && map.get(skill_trees[i].charAt(k))!=tech) {
					right=true;
					continue;
				}

			}
			if(!right) {
				answer++;
			}

		}
		System.out.println(answer);

	}
}
