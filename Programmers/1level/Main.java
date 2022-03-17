package com.company;

public class Main {
    public String solution(String phone) {
        String answer = "";
        String str = "";
        str += "0"+phone; // 010으로 만들어주고
        String[] strArr = str.split("");
        for (int i = 0; i < 3; i++){
            answer += strArr[i];
        }
        answer += "-";
        for (int i = 3; i< 7; i++){
            answer += strArr[i];
        }
        answer += "-";
        for (int i = 7; i < 11; i++){
            answer += strArr[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        Main method = new Main();
        System.out.println(method.solution("1062509911"));
    }
}
