import java.util.ArrayList;
import java.util.Arrays;

public class 문자열내마음대로정렬하기 {
    public String[] solution(String[] strings, int n) {
        Arrays.sort(strings); // strings 오름차순 정렬
        String[] arr = new String[strings.length]; // strings와 길이가 같은 arr 배열 생성
        for (int i = 0; i < strings.length; i++) {
            arr[i] = strings[i].split("")[n]; // arr 배열에 strings 인덱스값들의 n 번째 문자만 넣는다.
        }
        Arrays.sort(arr); // arr 오름차순 정렬
        ArrayList<String> list = new ArrayList<>(Arrays.asList(strings)); // arraylist 생성

        // 이차원 배열
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < list.size(); j++) {
                if (list.get(j).substring(n, n + 1).equals(arr[i])) { // list n번째 값과 arr이 같을 때
                    arr[i] = list.get(j);
                    list.remove(list.get(j)); // 한번 집어 넣은것들은 삭제
                    break;
                }

            }

        }
        return arr;
    }
}
