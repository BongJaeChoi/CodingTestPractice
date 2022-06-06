import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(T.solution(input));
    }

    public int solution(String str) {
        String answer = "";

        answer = str.replaceAll("[a-z]|[A-Z]", "");

        return Integer.parseInt(answer);
    }
}
