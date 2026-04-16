import java.util.Arrays;

public class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;

        int closestSum = nums[0] + nums[1] + nums[2];

        for (int i = 0; i < n - 2; i++) {
            int left = i + 1;
            int right = n - 1;

            while (left < right) {
                int currentSum = nums[i] + nums[left] + nums[right];

                
                if (Math.abs(target - currentSum) < Math.abs(target - closestSum)) {
                    closestSum = currentSum;
                }

                
                if (currentSum < target) {
                    left++;
                } else if (currentSum > target) {
                    right--;
                } else {
                    return currentSum; 
                }
            }
        }

        return closestSum;
    }

    // Optional: for testing
    public static void main(String[] args) {
        Solution obj = new Solution();
        int[] nums = {-1, 2, 1, -4};
        int target = 1;
        System.out.println(obj.threeSumClosest(nums, target)); // Output: 2
    }
}