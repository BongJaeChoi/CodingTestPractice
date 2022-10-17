import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
//        int[] arr1 = new int[]{3, 24, 50, 79, 88, 150, 345};
        int[] arr1 = new int[]{-1, -2, -3, -4, -5};
        System.out.println(Arrays.toString(T.twoSum(arr1, -8)));

    }

    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }


        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            Integer k = map.get(target - num);
            if (k != null && k != i) {
                return new int[]{i, k};
            }
        }
        throw new IllegalArgumentException("No two sum solution");
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

        while (p1 < n && p2 < m) {
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
