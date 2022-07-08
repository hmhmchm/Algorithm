package 구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 하얀칸 {
    //  2 4 6 8..  1 3 5 7
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = 0;

        for (int i = 0; i < 8; i++){
            String[] str = br.readLine().split("");
            for (int j = 0; j < 8; j++){
                if (str[j].equals("F") && i % 2 ==0 && j % 2 == 0) {
                    cnt++;
                }else if(str[j].equals("F") && i % 2 ==1 && j % 2 == 1){
                    cnt++;
                }
            }
        }

        System.out.println(cnt);
    }
}
