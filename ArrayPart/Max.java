package ArrayPart;

public class Max {
    public static void main(String[] args) {
        int[] arr = { 12, 15, 13, 54, 587, 78, 54, 142 };
        int maxValue = maximum(arr);
        System.out.println("Maximum value: " + maxValue);
    };

    static int maximum(int[] arr) {
        if (arr == null) {
            return -1;
        }

        if (arr.length == 0) {
            return -1;
        }

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
