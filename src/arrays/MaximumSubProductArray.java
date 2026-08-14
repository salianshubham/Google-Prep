package arrays;

public class MaximumSubProductArray {

    // Optimized
    public int optimized(int[] nums) {
        if(nums.length==0){
            return -999999999;
        }

        int oldMax = nums[0];
        int oldMin = nums[0];
        int product = nums[0];
        for (int i = 1; i < nums.length; i++){
            int candidate_1 =  nums[i];
            int candidate_2 = oldMax * nums[i];
            int candidate_3 = oldMin * nums[i];

            int newMax = Math.max(candidate_1, Math.max(candidate_2 , candidate_3));
            int newMin = Math.min(candidate_1, Math.min(candidate_2 , candidate_3));

            oldMax = newMax;
            oldMin = newMin;
            product = Math.max(product, oldMax);
        }
        return product;
    }

    public static void main(String[] args) {

        MaximumSubProductArray obj = new MaximumSubProductArray();

        int[] nums0 = {-2,4,-3,5};
        System.out.println("Test Case Of optimized: " + obj.optimized(nums0));

        // Test 1
        int[] nums1 = {2,3,-2,4};
        System.out.println("Test Case Of optimized: " + obj.optimized(nums1));

        // Test 2
        int[] nums2 = {-2,3,-4};
        System.out.println("Test Case Of optimized: " + obj.optimized(nums2));

        // Test 3
        int[] nums3 = {-2,4,-3,5};
        System.out.println("Test Case Of optimized: " + obj.optimized(nums3));

        // Test 4
        int[] nums4 = {-2,0,-1};
        System.out.println("Test Case Of optimized: " + obj.optimized(nums4));

        // Test 5
        int[] nums5 = {-1,-2,-3};
        System.out.println("Test Case Of optimized: " + obj.optimized(nums5));
    }
}
