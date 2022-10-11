import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        int[] arr1 = new int[i];

        for (int j = 0; j < arr1.length; j++) {
            arr1[j] = scanner.nextInt();
        }
        int k = scanner.nextInt();
        int[] arr2 = new int[k];
        for (int j = 0; j < arr2.length; j++) {
            arr2[j] = scanner.nextInt();
        }

        for (int i1 : T.solution(arr1, arr2)) {
            System.out.print(i1 + " ");
        }

    }

    private int[] solution(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];

        System.arraycopy(arr1, 0, result, 0, arr1.length);

        System.arraycopy(arr2, 0, result, arr1.length, arr2.length);

        Arrays.sort(result);
        return result;
    }
}
