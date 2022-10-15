import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        int[] arr1 = new int[]{3, 24, 50, 79, 88, 150, 345};
        System.out.println(Arrays.toString(T.twoSumSorted(arr1, 200)));

    }

    public int[] twoSumSorted(int[] numbers, int target) {
        int[] result = new int[2];

        int p1 = 0;
        int p2 = numbers.length - 1;
        while (p1 < p2) {
            if (target == numbers[p1] + numbers[p2]) {
                result[0] = p1;
                result[1] = p2;
                return solution(result);
            } else if (target < numbers[p1] + numbers[p2]) {
                // target 보다 큰값이 나오면 1번째 포인터를 이동시켜서 값을 줄인다.
                p2--;
            } else {
                // target 보다 작은값이 나오면 2번째 포인터를 이동시켜서 값을 늘린다.
                p1++;
            }
        }
        return result;
    }

    public int[] solution(int[] arr) {
        //result index 에 +1 씩 해줘야함
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + 1;
        }
        return arr;
    }

    private ArrayList<Integer> solution(int n, int m, int[] a, int[] b) {
        ArrayList<Integer> result = new ArrayList<>();

        int p1 = 0, p2 = 0; // two pointers 알고리즘

        while (p1 < n && p2 < m){
            if (a[p1] < b[p2]) {
                result.add(a[p1++]);
            } else {
                result.add(b[p2++]);
            }
        }

        while (p1 < n) { // a 배열 나머지가 있는경우
            result.add(a[p1++]);
        }
        while (p2 < m) { // b 배열 나머지가 있는경우
            result.add(b[p2++]);
        }

        return result;
    }
}
