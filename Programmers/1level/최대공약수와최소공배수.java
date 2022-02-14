public class 최대공약수와최소공배수 {
    public int[] solution(int n, int m) {
        // n, m 최대공약수와 최소공배수 를 구해라.
        int[] answer = new int[2];
        int a = Math.max(n,m); // 둘 중에 더 큰 수
        int b = Math.min(n,m); // 둘 중에 더 작은 수

        while(b!=0){
            int r = a%b;
            a = b;
            b = r;
        }
        answer[0] = a;
        answer[1] = n * m / a; // 두 수를 곱하고 최대 공약수로 나눠주면 최소공배수

        return answer;
    }
}
