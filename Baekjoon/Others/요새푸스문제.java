import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 요새푸스문제 {
    static int[] arr; // 1부터 N까지의 들어있는 배열

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

        while (list.isEmpty()){

        }

    }
}
