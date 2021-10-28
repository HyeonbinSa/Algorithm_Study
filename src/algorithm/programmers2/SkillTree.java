package algorithm.programmers2;

// clear
// 쓰킬 트리  
public class SkillTree {
	// skill = 선행 순서 
	// skill_trees = 유저가 만든 스킬 트리 
	// 스킬트리 중 몇개가 사용 가능한지 리턴
	
	public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        
        String essential;
        for(String tree : skill_trees) {
        	essential = this.getEssential(skill, tree);
        	if(this.getUsable(skill, essential)) {
        		answer++;
        	}
        }
        return answer;
    }
	
	// 필수 스킬만 저장 
	public String getEssential(String skill, String tree) {
		String result = "";
		for(String s : tree.split("")) {// 스킬 트리 중 1개씩 
			if(skill.indexOf(s) >= 0) {
				result += s;
			}
		}
		System.out.println(result);
		return result;
	}
	
	// 스킬 트리 사용 가능 여부 
	public  boolean getUsable(String skill, String userTree) {
		
		if(skill.indexOf(userTree) == 0) {
			System.out.println("스킬트리 : " + skill + ", 사용자 트리 : " + userTree);
			return true;
		}else {
			return false;
		}
	}
}
