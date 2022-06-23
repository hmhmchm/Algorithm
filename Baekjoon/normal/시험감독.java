package samsung;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 시험감독 {
    static int N; // 시험장 수
    static int[] arr; // 응시자 수
    static int B, C; // 총감독관이 감독할 수 있는 응시자 수 ,부감독관 감독 응시자 수
    static long cnt; // 총감독관 수, 부감독관 수
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        arr = new int[N];

        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str);

        for (int i = 0; i < arr.length; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        String str2 = br.readLine();
        StringTokenizer st1 = new StringTokenizer(str2);

        B = Integer.parseInt(st1.nextToken());
        C = Integer.parseInt(st1.nextToken());

        int n = 0; // 부감독관 수를 구할 변수
        for (int i = 0; i < N; i++){
            if(arr[i]<=B) {
                cnt++;
                continue;
            }else {
                cnt++; // 총감독관 하나 플러스
                n = arr[i]-B;
                if(n%C == 0) cnt+=n/C;
                else cnt+=n/C+1;
            }
        }

        System.out.println(cnt);
    }
}
