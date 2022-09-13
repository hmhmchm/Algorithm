package test.com;

// JadenCase 문자열 만들
public class JadenCase {

	public static void main(String[] args) {
		String s = "3people unFollowed me";
		boolean check = true;
		String answer = "";

		char[] chs = s.toCharArray();

		for (int i = 0; i < chs.length; i++) {
			// 첫글자만
			if (check && 97 <= chs[i] && chs[i] <= 122) {
				chs[i] = (char) (chs[i] - 32);
				check = false;
			} else if (65 <= chs[i] && chs[i] <= 90) {
				chs[i] = (char) (chs[i] + 32);

			} else if (chs[i] == 32) { // 공백이
				check = true;
			} else {
				check = false;
			}

		}

		for (int i = 0; i < chs.length; i++) {
			answer += chs[i];
		}

		System.out.println(answer);
	}

}
