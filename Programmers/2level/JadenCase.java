import java.util.Collections;

public class JadenCase {
    public static void main(String[] args) {
        String s = "    u";
        StringBuilder sb = new StringBuilder();
        String[] str = s.toLowerCase().split(" ");

        for (int i = 0; i < str.length; i++) {
            String[] str2 = str[i].split("");
            str2[0] = str2[0].toUpperCase();
            for (int j = 0; j < str2.length; j++) {
                if(j>0 && str2[j-1].equals(" ")){
                    str2[j]=str2[0].toUpperCase();
                }else
                sb.append(str2[j]);
            }
            sb.append(" ");
        }
        sb.deleteCharAt(sb.lastIndexOf(" "));
        System.out.println(sb.toString());
    }
}
