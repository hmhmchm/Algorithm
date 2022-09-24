import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws ParseException {
        String today = "2022.5.19";
        String[] terms = {"A 6", "B 12", "C 3"};
        String[] privacies = {"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"};
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < privacies.length; i++) {
            int yearNum = 0; // 초기화
            int fix_month = 0;
            String result = "";

            String[] pr = privacies[i].split(" ");

            for (int j = 0; j < terms.length; j++) {
                String[] te = terms[j].split(" ");
                if (pr[1].equals(te[0])) {
                    // pr 0번째에 te 1번째만큼의 달 수를 더한다.
                    String[] pr2 = pr[0].split("[.]");
                    int t_month = Integer.parseInt(pr2[1]);
                    int sum = t_month + Integer.parseInt(te[1]);

                    if (sum > 12) {
                        yearNum = sum / 12; // 년도에 더해줄 숫자
                        fix_month = sum % 12; // 약관기한 달

                        if (pr2[2].equals("01")) {
                            pr2[0] = (Integer.parseInt(pr2[0]) + yearNum) + ".";
                            pr2[1] = (Integer.parseInt(pr2[1]) + fix_month - 1) + ".";
                            pr2[2] = 28 + "";

                        } else {
                            pr2[0] = (Integer.parseInt(pr2[0]) + yearNum) + ".";
                            pr2[1] = (Integer.parseInt(pr2[1]) + fix_month) + ".";
                            pr2[2] = (Integer.parseInt(pr2[2]) - 1) + "";

                        }
                        result = pr2[0] + pr2[1] + pr2[2];
                    } else {
                        pr2[1] = "." + sum + ".";
                        pr2[2] = (Integer.parseInt(pr2[2]) - 1) + "";

                        result = pr2[0] + pr2[1] + pr2[2];
                    }

                }
            }
            SimpleDateFormat format = new SimpleDateFormat("yyyy.mm.dd");
            Date tempDate = format.parse(today);
            Date tempDate1 = format.parse(result);
            // 약관 파기
            if (tempDate.compareTo(tempDate1) > 0) {
                list.add(i + 1);
            }

        }

        System.out.println(list);
    }
}
