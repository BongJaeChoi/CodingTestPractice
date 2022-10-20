import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();


        int[] arr2 = new int[n];
        for (int j = 0; j < arr2.length; j++) {
            arr2[j] = scanner.nextInt();
        }

        System.out.println(T.solution(arr2, n, k));

    }


    private int solution(int[] arr, int n, int k) {
        int answer = 0, sum = 0;

        for (int i = 0; i < k; i++) {
            sum += arr[i];
            answer = sum;
        }

        for (int i = k; i < n; i++) {
            //윈도우 하나를 만들어서 맨 끝 값 값을 더하고 시작 값을 뺀다
            sum += (arr[i] - arr[i - k]); //a[i] = 윈도우의 마지막 값, a[i-k] = 윈도우의 첫번째값
            answer = Math.max(answer, sum);
        }

        return answer;
    }
}
