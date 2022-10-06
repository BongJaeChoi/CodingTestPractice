import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] arr = new int[n+1][6];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 5; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        System.out.println(T.solution(n, arr));
    }

    private int solution(int n, int[][] arr) {
        int answer = 0; //최대값 찾아야해서 작은값으로 초기화
        int min = Integer.MIN_VALUE;

        //1번학생의 카운트 변수 만들기
        //(모두 검사)
        //1번학생이  1학년일때 같은반 있는사람이 있으면 +
        //1번학생이  2학년일때 같은반 있는사람이 있으면 +
        //1번학생이  3학년일때 같은반 있는사람이 있으면 +
        //1번학생이  4학년일때 같은반 있는사람이 있으면 +
        //1번학생이  5학년일때 같은반 있는사람이 있으면 +

        //n번학생이 1,2,3,4,5 같은 반있는지 검사


        //카운트를 담을 수 있는 리스트선언

        //i[0]
        //i(행) 이 증가할때마다


        for (int i = 1; i <= n; i++) {
            int cnt = 0;
            //i번 학생 카운트
            for (int j = 1; j <= n; j++) {
                //1학년 부터 5학년까지라서 5까지
                for (int k = 1; k <= 5; k++) {
                    if (arr[i][k] == arr[j][k]) { // i반 학생의 반(k)과 j학생의 반(k)
                        cnt++;
                        break;//???????? 중복카운팅하면 안되서 그럼 한 학생당 학년별 하나의 카운팅 이거 막혔는데 이해잘안됨..
                        //막 숫자 11나오고 그럼. 6나오고... 5까지인데.. 이거땜에
                    }
                }
            }
            if(cnt>min){ // 같지않고 작을때만 하니까 가장 앞에 학생인게 검증됨
                min = cnt;
                answer = i;
            }
        }


        return answer;
    }
}
