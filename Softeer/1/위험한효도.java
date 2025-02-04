import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] abd = br.readLine().split(" ");

        int a = Integer.parseInt(abd[0]);
        int b = Integer.parseInt(abd[1]);
        int d = Integer.parseInt(abd[2]);

        int answer = moveDistance(a,b,d); // 전체 걸린 시간

        System.out.println(answer);
    }

    public static int moveDistance(int a, int b, int d){

        int totalDistance = 2 * d;

        int stopGoing = (d%a==0) ? 0 : (d/a);
        int stopMoveGoing = stopGoing * b;

        int stopReturn = (d%b==0) ? 0 : (d/b);
        int stopMoveReturn = stopReturn * a;
        
        return totalDistance + stopMoveGoing + stopMoveReturn;
    }
}
