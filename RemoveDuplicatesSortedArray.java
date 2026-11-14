import java.util.Arrays;

public class RemoveDuplicatesSortedArray {
    static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int unique = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[unique - 1])
                nums[unique++] = nums[i];
        }
        return unique;
    }

    public static void main(String[] args) {
        int[] a = {1, 1, 2, 2, 2, 3, 4, 4, 5};
        int count = removeDuplicates(a);
        System.out.println("length = " + count);
        System.out.println("nums[0.." + (count - 1) + "] = " +
                           Arrays.toString(Arrays.copyOf(a, count)));

        int[] b = {2, 2, 2, 3, 3, 5}; // Own test
        int n = removeDuplicates(b);
        System.out.println("length = " + n + ", values = " +
                           Arrays.toString(Arrays.copyOf(b, n)));
    }
}
// Time: O(n); additional space: O(1), because elements are overwritten in the input.
