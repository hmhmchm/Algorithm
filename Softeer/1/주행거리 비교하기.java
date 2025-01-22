import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str = br.readLine().split(" ");

        int A = Integer.parseInt(str[0]);
        int B = Integer.parseInt(str[1]);

        if(A > B){
            System.out.println("A");
        }else if(B > A){
            System.out.println("B");
        }else{
            System.out.println("same");
        }
    }
}
