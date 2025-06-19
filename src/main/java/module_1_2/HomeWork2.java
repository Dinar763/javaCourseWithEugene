package module_1_2;

public class HomeWork2 {

    public static void main(String[] args) {
        int[] intArr = {-1, 2, 3, 4, 1, 5};
        System.out.println(containsDublicates(intArr));
    }

    static Boolean containsDublicates(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}
