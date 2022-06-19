import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        int length = Integer.parseInt(scanner.nextLine());
        String arr = scanner.nextLine();
        for (int x : T.solution(length, arr)) {
            System.out.print(x + " ");
        }
    }

    public int[] solution(int length, String target) {
        int[] answer = new int[length];

        String[] arr = target.split(" ");

        int temp = 1;
        for (int i = 0; i < length; i++) {
            int a = Integer.parseInt(arr[i]);
            for (int j = 0; j < length; j++) {
                int b = Integer.parseInt(arr[j]);

                if (a < b) {
                    temp++;
                }
            }
            answer[i] = temp;
            temp = 1;

        }

        return answer;
    }
}
