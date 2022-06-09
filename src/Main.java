import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String line = scanner.nextLine();
        System.out.println(T.solution(n, line));
    }

    public String solution(int n, String str) {
        String answer = "";
        int value = -1;

        String[] s = str.split(" ");
        for (int i = 0; i < s.length; i++) {
            String element = s[i];
            int x = Integer.parseInt(String.valueOf(element));

            if (x == n) {
                value = Integer.parseInt(String.valueOf(s[i - 1]));
            }
        }

        answer += str.charAt(0);

        for (int i = 1; i < s.length; i++) {
            String temp = s[i];
            if (value < Integer.parseInt(temp)) {
                answer += " " + temp;
            }
        }

        return answer;
    }
}
