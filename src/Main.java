import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        System.out.println(T.solution(new String[]{"leo", "kiki", "eden"}, new String[]{"kiki", "eden"}));
    }

    public String solution(String[] participant, String[] completion) {

        HashSet<String> set = new HashSet<>(Arrays.asList(completion));

        for (String s : participant) {
            if (!set.contains(s)) {
                return s;
            }
        }

        return "";
    }
}
