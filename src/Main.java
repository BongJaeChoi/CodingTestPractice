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

        for (int i1 : T.solution(i, k, arr1, arr2)) {
            System.out.print(i1 + " ");
        }

    }

    private ArrayList<Integer> solution(int n, int m, int[] a, int[] b) {
        ArrayList<Integer> result = new ArrayList<>();

        int p1 = 0, p2 = 0; // two pointers 알고리즘

        while (p1 < n && p2 < m) {
            if(a[p1] < b[p2]){
                result.add(a[p1++]);
            }else {
                result.add(b[p2++]);
            }
        }

        while (p1<n){ // a 배열 나머지가 있는경우
            result.add(a[p1++]);
        }
        while (p2<m){ // b 배열 나머지가 있는경우
            result.add(b[p2++]);
        }

        return result;
    }
}
