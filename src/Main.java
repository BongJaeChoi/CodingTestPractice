import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(T.solution(str));
    }

    public String solution(String s) {
        String answer;
        char[] chars = s.toCharArray();

        Stack<Character> stack = new Stack<>();

        for (char aChar : chars) {
            if (aChar == '(') {
                stack.push(aChar);
            } else {
                if(stack.isEmpty()){
                    return "NO";
                }
                stack.pop();
            }
        }

        answer = stack.isEmpty() ? "YES" : "NO";

        return answer;
    }
}
