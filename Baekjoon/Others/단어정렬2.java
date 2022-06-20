import java.util.*;

public class 단어정렬 {
    static int N; // 단어개수

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();

        Set<String> set = new HashSet<>();

        for (int i = 0; i < N; i++) {
            set.add(sc.next());
        }
        ArrayList<String> list = new ArrayList<String>(set);

        Collections.sort(list, new Comparator<String>() {
            public int compare(String o1, String o2) {
                if(o1.length() > o2.length())
                    return 1;
                else if(o1.length() < o2.length())
                    return -1;
                else
                    return o1.compareTo(o2);
            }
        });

        for(String data : list){
            System.out.println(data);
        }
    }
}
