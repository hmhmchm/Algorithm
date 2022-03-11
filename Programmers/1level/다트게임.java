public class 다트게임 {
    public int solution(String dartResult) {
        int answer = 0;
        int index = 0, tmp = 0; // index , 저장할 변수
        int[] tryNum = new int[3]; // 시도별로 담아놓은 정수
        String str = "";

        for (int i = 0; i < dartResult.length(); i++){
            char c = dartResult.charAt(i);
            if(c >= '0' && c <= '9'){
                str += String.valueOf(c);
            }else if(c == 'S' || c == 'D' || c == 'T'){
                tmp = Integer.parseInt(str);
                switch (c){
                    case 'S':
                        tmp = (int)Math.pow(tmp , 1);
                        break;
                    case 'D':
                        tmp = (int)Math.pow(tmp , 2);
                        break;
                    case 'T':
                        tmp = (int)Math.pow(tmp,3);
                        break;
                }
                tryNum[index++] = tmp;
                str = "";
            }else{
                if(c == '#'){
                    tryNum[index-1] *= -1;
                }else {
                    tryNum[index-1] *= 2;
                    if(index-2>=0){
                        tryNum[index-2] *=2;
                    }
                }
            }
        }

        answer = tryNum[0] + tryNum[1] + tryNum[2];
        return answer;
    }
}
