import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println(T.solution(arr));
    }

    public int solution(int[] arr) {
        int count = 0;
        int t = 0;

        for (int element : arr) {
            if (element > t) {
                count++;
                t = element;
            }
        }


        return count;
    }
}
