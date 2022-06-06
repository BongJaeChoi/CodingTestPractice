import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        int input1 = scanner.nextInt();

        String[] inputs = new String[input1];
        for (int i = 0; i < input1; i++) {
            inputs[i] = scanner.next();
        }
        for (String input : T.solution(input1, inputs)) {
            System.out.println(input);
        }
    }

    public ArrayList<String> solution(int n, String[] str) {
        ArrayList<String> answer = new ArrayList<>();
        for (String x : str) {
            char[] s = x.toCharArray();
            int lt = 0, rt = x.length() - 1;
            while (lt < rt) {
                char tmp = s[lt];
                s[lt] = s[rt]; // 0번째 인덱스 값을 마지막 인덱스 값으로 넣기
                s[rt] = tmp; //마지막 인덱스 값을 첫번째 인덱스 값으로 넣기
                lt++; // 반복
                rt--;
            }
            answer.add(String.valueOf(s));
        }
        return answer;
    }
}
