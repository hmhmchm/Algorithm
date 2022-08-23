package test.com;

// 프로그래머스 2레벨 최대값 최소
public class Practice1 {
	static int min = 999999; // 최소값 
	static int max = -999999; // 최대값 
	
	
	public static void main(String[] args) {
		String answer = "";
		String s = "-1 -2 -3 -4";
		String[] str = s.split(" ");
		
		for (int i = 0; i < str.length; i++) {
			min = Math.min(min, Integer.parseInt(str[i]));
			max = Math.max(max, Integer.parseInt(str[i]));
		}
		
		System.out.println(min + " " + max);
	}

}
