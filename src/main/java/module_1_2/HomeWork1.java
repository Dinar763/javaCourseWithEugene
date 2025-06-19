package module_1_2;

import java.util.ArrayList;
import java.util.List;

public class HomeWork1 {

    public static void main(String[] args) {
        int[] intArr = {1, 2, 3, 4, 5};
        int sum = 7;
        System.out.println(findIndexesWhenResultIsSum(intArr, sum));
    }

    static List<Integer> findIndexesWhenResultIsSum(int[] arr, int sum) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == sum) {
                    return List.of(i, j);
                }
            }
        }
        return new ArrayList<>();
    }
}
