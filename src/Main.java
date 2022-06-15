import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        int x = Integer.parseInt(scanner.nextLine());
        String numArr = scanner.nextLine();
        for (int s : T.solution(numArr, x)) {
            if (s == 0 || s == 1) {
                continue;
            }

            System.out.print(s + " ");
        }
    }

    public int[] solution(String arr, int x) {

        String[] strings = arr.split(" ");
        int[] numArr = new int[x];

        //자연수 뒤집기
        for (int i = 0; i < numArr.length; i++) {
            //첫자리부터 연속된 0은 무시
            StringBuilder sb = new StringBuilder(strings[i].replaceAll("^00+", ""));

            String s1 = sb.reverse().toString();
            int i1 = Integer.parseInt(s1);
            numArr[i] = i1;
        }

        //뒤집은 수 중에 소수만 남기기
        int n = 2;
        for (int i = 0; i < numArr.length; i++) {
            for (int j = n; j < 100000; j++) {
                int element = numArr[i];

                if (element / j == 1) {
                    break;
                }

                if (element % j == 0) {
                    numArr[i] = 0;
                    break;
                }
            }
        }
        return numArr;
    }
}
