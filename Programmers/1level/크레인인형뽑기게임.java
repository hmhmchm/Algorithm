import java.util.Stack;

public class 크레인인형뽑기게임 {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> bucket = new Stack<Integer>(); // 인형 담을스택

        for (int move: moves
             ) {
            for (int i = 0; i < board.length; i++){
                // 훑었을 때 인형이 없다면
                if(board[i][move-1] == 0){
                    continue;
                }else { // 훑었을 때 인형이 있다면
                    // 바구니에 같은 모양의 인형이 있다면 사라져한다.
                    if(!bucket.isEmpty() && board[i][move-1] == bucket.peek()){
                        answer+=2; // 2개가 사라졌으니까
                        bucket.pop(); // 스택 제일 위에 제거
                    }else {
                        bucket.add(board[i][move-1]);
                    }
                    board[i][move-1] = 0; // 뽑은 인형은 이제 빈 공간
                    break; // break 필수 break를 해야 딱 한번의 인형뽑기가 성립된다. 더 돌면 한 move 에 두번 도는거다.
                }
            }
        }
        return answer;
    }
}
