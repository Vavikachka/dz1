
public class task2 {
    public static void main(String[] args) {
        int[] arr = new int[] { 3, 2, 2, 3, 3, 6 };
        System.out.println(removeElement(arr, 3));
    }

    public static int removeElement(int[] nums, int val) {
        int copyindex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[copyindex] = nums[i];
                copyindex++;
            }
        }
        return copyindex;
    }
}