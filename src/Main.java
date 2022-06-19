import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        int length = Integer.parseInt(scanner.nextLine());
        String arr = scanner.nextLine();
        System.out.println(T.solution(length, arr));
    }

    public int solution(int length, String target) {
        int answer = 0;

        String[] arr = target.split(" ");

        int temp = 0;
        for (int i = 0; i < length; i++) {
            int b = Integer.parseInt(arr[i]);

            if (b != 0) {
                temp++;
            } else {
                temp = 0;
            }
            answer += temp;
        }

        return answer;
    }
}
