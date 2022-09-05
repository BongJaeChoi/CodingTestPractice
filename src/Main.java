import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);


        System.out.println(T.solution(new int[]{1, 1, 3, 3, 0, 1, 1}));
        System.out.println(Arrays.toString(Arrays.stream(T.solution(new int[]{1, 1, 3, 3, 0, 1, 1})).toArray()));
    }

    public int[] solution(int[] arr) {

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            if (stack.empty() || (stack.peek() != arr[i])) {
                stack.push(arr[i]);
            }
        }

        int[] result = new int[stack.size()];

        for (int i = 0; i < stack.size(); i++) {
            result[i] = stack.get(i);
        }

        return result;
    }

//    int solution(int[] A) {
//        /**
//         * 코드 오류찾기문제
//         * 제일 작은 숫자 구하기 -1000 ~ 1000 배열주면
//         * 그런데 왜 1번째 인덱스 부터 시작하는거임???? 이것 수정하는문제
//         */
//]
//        int ans = A[0];
//        for (int i = 1; i < A.length; i++) {
//            if (ans > A[i]) {
//                ans = A[i];
//            }
//        }
//        return ans;
//    }

}
