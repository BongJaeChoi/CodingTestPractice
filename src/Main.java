import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(T.solution(input) ? "YES" : "NO");
    }

    public boolean solution(String str) {
        String temp = "";

        for (int i = 0; i < str.toCharArray().length; i++) {
            char c = str.charAt(i);

            if (Character.isAlphabetic(c)) {
                temp += c;
            }
        }

        //뒤집어도 원본이랑 똑같냐
        String reverse = new StringBuilder(temp).reverse().toString();

        return temp.equalsIgnoreCase(reverse.toString());
    }
}
