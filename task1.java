public class task1 {
    public static void main(String[] args) {
        int[] arr = new int[] { 3, 2, 2, 3, 3, 6 };
        System.out.println(duplicateZeros(arr));
    }

    public static void duplicateZeros(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                count++;
            }
        }
        int last = arr.length - count;
        int end = arr.length - 1;
        while (last >= 0) {
            if (arr[last] == 0) {
                arr[end] = 0;
                arr[end - 1] = 0;
                end -= 2;
                last--;
            } else {
                arr[end] = arr[last];
                last--;
                end--;
            }
        }
    }
}
