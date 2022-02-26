public class 최소직사각형 {
    public int solution(int[][] sizes) {
        int w = 0, h = 0; //가로 세로
        int max_w = 0 , max_h = 0;
        // 가로에다가 가장 큰수, 세로에다가 작은 수를 넣어
        for (int i = 0; i < sizes.length; i++){
            w = Math.max(sizes[i][0], sizes[i][1]);
            h = Math.min(sizes[i][0], sizes[i][1]);

            max_w = Math.max(max_w, w);
            max_h = Math.max(max_h, h);
        }

        return max_w * max_h;
    }
}
