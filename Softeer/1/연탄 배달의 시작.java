import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");

        int minDistance = 999999;
        int count = 0;
        
        for (int i = 1; i < n; i++){
            int distance = Integer.parseInt(str[i]) - Integer.parseInt(str[i-1]);

            if(distance < minDistance){
                minDistance = distance;
                count = 1;
            }else if(distance == minDistance){
                count++;
            }   
        }
        System.out.println(count);
    }
}
