import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class 요새푸스문제 {
    static int[] arr; // 1부터 N까지의 들어있는 배열
    static int tmp; // 임시 변수
    static int cnt; // arr 배열에 넣을 인덱스 카운터.. 하나씩 증가한다.
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        StringTokenizer st = new StringTokenizer(str);

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        arr = new int[N];

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i <= N; i++){
            list.add(i);
        }

        int index = K - 1; // list 도 인덱스 0부터 시작하니까 처음 인덱스만 빼서 시작하자.
        cnt = 0;
        tmp = N;
        int r = 0; // 나머지
        while (list.isEmpty()){
            arr[cnt] = list.get(index); // tmp 에다가 index의 해당하는 인덱스 값을 꺼내서 넣어준다.
            cnt++; // arr 배열 인덱스를 하나씩 증가시켜준다.
            list.remove(index); // 배열에 넣어준 값을 다시 없애준다.
            tmp = tmp - 1;
            r = tmp%K; // ??
            // 인덱스보다 K가 클 때
            if(index > tmp){

            }
            index+=K;
        }

    }
}
