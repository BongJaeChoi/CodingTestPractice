import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        String input2 = scanner.next();
        System.out.print(T.solution(count, input2));
    }

    public String solution(int count, String str) {
        String answer = "";
        StringBuilder temp = new StringBuilder();
        int c = 0;
        for (int i = 0; i < str.length(); i++) {
            temp.append(String.valueOf(str.charAt(i))
                    .replace('#', '1')
                    .replace('*', '0')
            );

            c++;

            if (c == 7) {
                int codePoint = Integer.parseInt(temp.toString(), 2);
                String 해독한문자 = Character.toString((char) codePoint);
                answer += 해독한문자;
                temp = new StringBuilder();
                c = 0;
            }
        }

        return answer;
    }
}
