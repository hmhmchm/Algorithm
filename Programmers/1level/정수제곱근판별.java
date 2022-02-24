public class 정수제곱근판별 {
    public long solution(long n) {
        long a = (long) Math.sqrt(n);
        long b = a * a;
        if(b != n) return -1;
        else return (a+1) * (a+1);
    }
}
