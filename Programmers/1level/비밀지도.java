public class 비밀지도 {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String[] arr1Str = new String[arr1.length];
        String[] arr2Str = new String[arr2.length];
        // String 으로 10진수를 -> 2진수로 변환
        for (int i = 0; i < n ;i++){
            arr1Str[i] = Integer.toBinaryString(arr1[i]);
            arr2Str[i] = Integer.toBinaryString(arr2[i]);
            // 길이를 맞춰주어야 한다.
            while (arr1Str[i].length()!= n){
                arr1Str[i] = "0"+ arr1Str[i]; // 앞에 0 붙이기
            }
            while (arr2Str[i].length() != n){
                arr2Str[i] = "0"+ arr2Str[i]; // 앞에 0 붙이기
            }
        }

        String str = "";
        // 두 배열을 비교해서 둘중 하나라도 1이면 1이 나오게
        for (int i = 0; i < n; i++){
            String[] str1 = arr1Str[i].split("");
            String[] str2 = arr2Str[i].split("");
            str = ""; // 다시 초기화
            for (int j = 0; j < n; j++){
                if(str1[j].equals("1") || str2[j].equals("1")){
                    str+= "#";
                }else{
                    str+= " ";
                }
            }
            answer[i] = str;
        }

        return answer;
    }
}
