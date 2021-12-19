// [나의 코드] -> 지워진 로또 번호의 최고등수와 최저등수 구하기 커밋하기
class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
    int[] answer = {};
        int zeroNum = 0;
        int checkNum = 0;
        int maxRank = 0;
        int minRank = 0;
        
        for(int num:lottos){
            if(num == 0){zeroNum++;}
            for(int win:win_nums){
                if(num == win){checkNum++;}
            }
        }
        
        answer = new int[2];
        answer[0] = zeroNum + checkNum;
        answer[1] = checkNum;
        
        for(int i=0; i<answer.length; i++) {
        	switch(answer[i]) {
        		case 6: answer[i] = 1; break;
        		case 5: answer[i] = 2; break;
        		case 4: answer[i] = 3; break;
        		case 3: answer[i] = 4; break;
        		case 2: answer[i] = 5; break;
        		default: answer[i] = 6; break;
        	}
        }
        
        System.out.println("최고등수 =>" + answer[0]);
        System.out.println("최저등수 =>" + answer[1]);

        return answer;
    }
}

public class A_Lottos {

	public static void main(String[] args) {
		Solution solution = new Solution();
		int [] lottos = {23, 0, 1, 0, 7, 3};
		int [] win_nums = {12, 4, 7, 1, 32, 3};
		solution.solution(lottos, win_nums);
	}

}
