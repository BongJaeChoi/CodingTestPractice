import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();


        int[] arr = new int[n];
        for (int j = 0; j < arr.length; j++) {
            arr[j] = scanner.nextInt();
        }

        System.out.println(T.solution(arr, n, m));

    }


    private int solution(int[] arr, int n, int m) {
        //구간합은 투포인터...
        //10만까지면 O(n2) 는 안됨
        int lt = 0, sum = 0, answer = 0;
        for (int rt = 0; rt < n; rt++) {
            sum += arr[rt];
            if (sum == m) { //여태까지 합이 같으면
                answer++;
            }
            while (sum >= m) { //계속 m이 커서 lt 가 증가할 수 있는 경우. ex 11115 , 6
                sum -= arr[lt++];
                if (sum == m) {
                    answer++;
                }
            }
        }


        return answer;
    }
}
