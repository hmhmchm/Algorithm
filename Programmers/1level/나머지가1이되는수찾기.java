public class 나머지가1이되는수찾기 {
    public int solution(int n) {
        int tmp = 0;
        int x = 0;
        while(tmp != 1){
            x++;
            tmp = n % x;
        }
        return x;
    }
}
