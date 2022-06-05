import java.util.Scanner;

public class Main {
    public int solution(String str, char c) {
        int answer = 0;

        char[] arr = str.toCharArray();
        for (char c1 : arr) {
            if(c1 == c){
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next().toUpperCase();
        char c = scanner.next().toUpperCase().charAt(0);
        System.out.print(T.solution(str, c));
    }
}
