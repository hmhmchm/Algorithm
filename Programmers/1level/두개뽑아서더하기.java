import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class 두개뽑아서더하기 {
    public int[] solution(int[] numbers) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                list.add(numbers[i] + numbers[j]);
            }
        }
        Set<Integer> set = new HashSet<Integer>(list);
        ArrayList<Integer> list2 = new ArrayList<>(set);
        int[] sum = new int[list2.size()];
        for (int i = 0; i < list2.size(); i++) {
            sum[i] = list2.get(i);
        }

        Arrays.sort(sum);
        return sum;
    }
}
