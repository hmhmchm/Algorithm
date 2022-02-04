import java.util.StringTokenizer;

public class 핸드폰번호가리기 {
    public String solution(String phone_number) {
        //개인정보 보호를 위해 고지서를 보낼때 전화번호 일부를 가린다.
        // 전화번호 뒷 4자리를 제외한 나머지 숫자를 전부 * 으로 가린 문자열을 리턴하는 함수를 완성하라
        StringBuilder answer = new StringBuilder(phone_number);

        for(int i = 0; i < phone_number.length()-4; i++) {
            answer.setCharAt(i, '*'); // replace , setCharAt 같은 의미로 쓰이나 setCharAt이 속도측면에서 빠름.
        }
        return answer.toString();
    }

}
