import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        System.out.println(T.solution(n, arr));
    }

    private int solution(int n, int[][] arr) {
        int answer = Integer.MIN_VALUE; //최대값 찾아야해서 작은값으로 초기화
        int sum1,sum2;

        for (int i = 0; i < n; i++) {
            sum2 = sum1 = 0; // 0행 0열부터
            for (int j = 0; j < n; j++) {
                sum1+=arr[i][j]; // 행 고정, 열변화
                sum2+=arr[j][i]; // 열 고정, 행변화
            }
            answer = Math.max(answer, sum1);//최대값 찾기위해 행 값들 검사
            answer = Math.max(answer, sum2);//최대값 찾기위해 열 값들 검사
        }

        sum1=sum2=0;

        for (int i = 0; i < n; i++) {
            sum1+=arr[i][i] ;// (0,0), (1,1), (2,2) , (3,3)...(n-1,n-1)
            sum2+=arr[n-1][n-i-1];// (0,5), (1,4), (2,3) , (3,2)...(n-1,n-1)
        }
        answer = Math.max(answer, sum1);//최대값 찾기위해 행 값들 검사
        answer = Math.max(answer, sum2);//최대값 찾기위해 열 값들 검사

        return answer;
    }

    public String solution(String s) {
        String answer = "";

        Stack<Character> stack = new Stack<>();


        //소문자 사이 문자제거

        //뒷 문자열이 괄호가 아니면 answer 에 추가

        char[] chars = s.toCharArray();

        for (char aChar : chars) {
            if (aChar == ')') {
                while (stack.pop() != '(') ;
            } else {
                stack.push(aChar);
            }
        }
        System.out.println(stack.toString());
        return answer;
    }
}
