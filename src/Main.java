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

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        for (Integer integer : T.solution(i, k, arr1, arr2)) {
            System.out.print(integer + " ");
        }

    }

    /**
     * 교집합 구하기
     */
    private ArrayList<Integer> solution(int n, int m, int[] a, int[] b) {
        ArrayList<Integer> result = new ArrayList<>();

        int p1 = 0, p2 = 0;

        while (p1 < n && p2 < m)
            if (a[p1] < b[p2]) {//sortedArr1[p1] 은 이제 공통원소가 아니기때문에
                p1++;
            } else if (a[p1] == b[p2]) {
                result.add(a[p1]);
                p1++;
                p2++;
            } else {
                p2++;
            }

        return result;
    }
}
