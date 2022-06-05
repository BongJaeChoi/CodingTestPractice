import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.print(T.solution(str));
    }

    public String solution(String str) {
        String answer = "";
        String[] arr = str.split(" ");

        int m = Integer.MIN_VALUE;

        for (String s : arr) {
            int length = s.length();
            if (length > m) {
                m = length;
                answer = s;
            }
        }

        return answer;
    }
}
