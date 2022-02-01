class Solution {
    public int solution(int left, int right) {
        int answer = 0; // 약수의 개수가 짝수인 수는 더하고 홀수이면 뺀 answer 값
        int count = 0; // 약수 개수
        for (int i = left; i <= right; i+=1){
            for(int j = 1; j <=i ; j++){
                if(i%j==0){ // 약수가 됨.
                    count++; // 약수 개수 하나 증가 시켜
                }
            }
            if(count%2==0) answer+=i; // 약수 개수가 짝수이면 더하고
            else answer-=i; // 홀수면 빼.

            count = 0;
        }
        return answer;
    }
}
