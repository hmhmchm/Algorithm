package 구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ROT13 {
    static String s;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        s = br.readLine();
        char[] c = s.toCharArray();
        int n = 0;
        for (int i = 0; i < c.length; i++){
            // 대문자라면
            if(c[i] >=65 && c[i] <= 90){
                c[i]+=13;
                if(c[i] > 90){
                    n = c[i] - 90;
                    c[i] = (char)(65 + n - 1);
                }
            // 소문자일때
            }else if(c[i] >= 97 && c[i] <= 122){
                c[i]+=13;
                if(c[i] > 122){
                    n = c[i] - 122;
                    c[i] = (char)(97 + n - 1);
                }
            }
        }
        for (char data: c
             ) {
            System.out.print(data);
        }
    }
}
