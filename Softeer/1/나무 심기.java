import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String N = br.readLine();
        String[] F = br.readLine().split(" ");
        
        int max = Integer.MIN_VALUE;
        
        int MaxOne = 0;
        int MaxTwo = 0;
        
        for(int i = 0; i < F.length ; i++){
            for(int j = i+1; j < F.length ; j++){
                int product = Integer.parseInt(F[i]) * Integer.parseInt(F[j]);

                if(max < product){
                    max = product;
                }
            }
        }

        System.out.println(max);
    }
}
