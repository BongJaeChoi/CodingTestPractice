import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(T.solution(str));
    }

    public String solution(String s) {
        String answer = "";

        Stack<Character> stack = new Stack<>();


        //소문자 사이 문자제거

        //뒷 문자열이 괄호가 아니면 answer 에 추가

        char[] chars = s.toCharArray();

        for (char aChar : chars) {
            if (aChar == ')') {
                while (stack.pop() != '(');
            }else {
                stack.push(aChar);
            }
        }
        System.out.println(stack.toString());
        return answer;
    }
}
