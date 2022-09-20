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
    int[] dx = {-1, 0, 1, 0};
    int[] dy = {0, 1, 0, -1};

    private int solution(int n, int[][] arr) {
        int answer = 0; //최대값 찾아야해서 작은값으로 초기화

        //3중포문 돌면서 비교 좌표값이니까 (i+dx,j+dy)
        //if 4개쓰지말고 걍 포문 돌림
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                //상하좌우 값이랑 비교 상 ([i-1][j]) ([i][j+1]) ([i+1][j]) ([i][j-1])
                int base = arr[i][j];
                boolean flag = true;
                for (int k = 0; k < 4; k++) {
                    int nx = i + dx[k];
                    int ny = j + dy[k];

                    // 4방향의 값 nx,ny 의 값이 나 자신 arr[i][j] 보다 크거나 같으면 break;
                    if (nx >= 0 && nx < n && ny >= 0 && ny < n && arr[nx][ny] >= arr[i][j]) {
                        flag = false;
                        break;
                    }

                }
                //주변에 큰값이 없으면 봉우리 개수 증가
                if (flag) answer++;
            }
        }

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
