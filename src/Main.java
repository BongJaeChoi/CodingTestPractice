import java.util.Arrays;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        System.out.println(T.solution(new int[]{1000, 1, 4, -1, -99, 1, -2, 2, -3, 1000}));
    }

    public String solution(String[] participant, String[] completion) {

        HashSet<String> set = new HashSet<>(Arrays.asList(completion));
        Hashtable<String, String> hashtable = new Hashtable<>();

        System.out.println(set);
        for (String s : participant) {
            if (!set.contains(s)) {
                return s;
            }
        }

        return "";
    }

    int solution(int[] A) {
        /**
         * 코드 오류찾기문제
         * 제일 작은 숫자 구하기 -1000 ~ 1000 배열주면
         * 그런데 왜 1번째 인덱스 부터 시작하는거임???? 이것 수정하는문제
         */

        int ans = 0;
        for (int i = 0; i < A.length; i++) {
            if (ans > A[i]) {
                ans = A[i];
            }
        }
        return ans;
    }
}
