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
        for (String input : inputs) {
            System.out.println(T.solution(input));
        }
    }

    public String solution(String str) {
        StringBuilder answer = new StringBuilder();
        answer.append(str);
        answer.reverse();
        return answer.toString();
    }
}
