import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int answer = 0;
        for(int i = 0; i < 5; i++){
            String[] str = br.readLine().split(" ");

            String[] startTime = str[0].split(":"); // 출근시간
            int startTimeH = Integer.parseInt(startTime[0]);
            int startTimeM = Integer.parseInt(startTime[1]);

            String[] endTime = str[1].split(":"); // 퇴근시간
            int endTimeH = Integer.parseInt(endTime[0]);
            int endTimeM = Integer.parseInt(endTime[1]);
           

            int h = endTimeH - startTimeH; 
            int m = endTimeM;
            
            answer += (h*60) + m - startTimeM;     
        }
        System.out.println(answer);
    }
}
