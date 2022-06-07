import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        System.out.print(T.solution(input));
    }

    public String solution(String str) {
        String answer = "";
        int count = 1;
        String[] x = new String[str.length()];

        for (int i = 0; i < str.length() - 1; i++) {
            System.out.println("i :" + str.charAt(i) + " / i+1 : " + str.charAt(i + 1));
            x[i] = String.valueOf(str.charAt(i));

            if (str.charAt(i) == str.charAt(i + 1)) {
                count++;
                x[i] = String.valueOf(str.charAt(i)) + count;
            } else {
                count = 1;
            }
        }
        return answer;
    }
}
