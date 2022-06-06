import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        System.out.println(T.solution(input));
    }

    public String solution(String str) {
        String answer = "";
        char[] s = str.toCharArray();

        int lt = 0, rt = str.length() - 1;
        while (lt < rt) {
            char tmp = s[lt];
            if (!Character.isAlphabetic(s[lt])) {
                lt++;
            } else if (!Character.isAlphabetic(s[rt])) {
                rt--;
            } else {
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }

        }
        answer = String.valueOf(s);
        return answer;
    }
}
