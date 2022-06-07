import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        System.out.print(T.solution(input));
    }

    public String solution(String str) {
        str = str + " "; // 마지막 element 까지 비교하고 싶으니까 임의로 하나 추가
        String answer = "";
        int count = 1;


        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                if (count > 1) { // 1보다 클때만 넣어야하니까 조건식 추가됨

                    // count 를 초기화시킬때 String 을 입력해야 T2,T3,T4 처럼 여러개 안들어감
                    answer += String.valueOf(str.charAt(i)) + count;
                    count = 1;
                }
            }
        }
        return answer;
    }
}
