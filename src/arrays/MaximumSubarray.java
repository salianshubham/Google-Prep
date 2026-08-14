package arrays;

public class MaximumSubarray {

    // Brute Force
    public int bruteForce(int[] nums) {
        if(nums.length==0){
            return -999999999;
        }
        int total = nums[0];
        for(int i=0;i<nums.length;i++){
            int currentTotal = nums[i];
            int finalInnerLoopMaxTotal = nums[i];
            for(int j =i+1;j<nums.length;j++ ){
                currentTotal = currentTotal + nums[j];
                if(finalInnerLoopMaxTotal<currentTotal){
                    finalInnerLoopMaxTotal = currentTotal;
                }
            }
            if(total < finalInnerLoopMaxTotal){
                total = finalInnerLoopMaxTotal;
            }
        }
        return total;
    }

    // Optimized
    public int optimized(int[] nums) {
        if(nums.length==0){
            return -999999999;
        }

        int currentSum = nums[0];
        int maxSum = nums[0];

        for (int i = 1; i < nums.length; i++) {

            int startNew = nums[i];
            int continueOld = currentSum + nums[i];

            currentSum = Math.max(startNew, continueOld);

            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {

        MaximumSubarray obj = new MaximumSubarray();

        // Test 1
        int[] nums1 = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println("Test Case Of Brute Force: "+obj.bruteForce(nums1));
        System.out.println("Test Case Of optimized: "+obj.optimized(nums1));

        // Test 2
        int[] nums2 = {1};
        System.out.println("Test Case Of Brute Force: "+obj.bruteForce(nums2));
        System.out.println("Test Case Of optimized: "+obj.optimized(nums2));

        // Test 3
        int[] nums3 = {-1,-2,-3};
        System.out.println("Test Case Of Brute Force: "+obj.bruteForce(nums3));
        System.out.println("Test Case Of optimized: "+obj.optimized(nums3));

        // Test 4
        int[] nums4 = {5,4,-1,7,8};
        System.out.println("Test Case Of Brute Force: "+obj.bruteForce(nums4));
        System.out.println("Test Case Of optimized: "+obj.optimized(nums4));

        // Test 5
        int[] nums5 = {};
        System.out.println("Test Case Of Brute Force: "+obj.bruteForce(nums5));
        System.out.println("Test Case Of optimized: "+obj.optimized(nums5));

        // Test 6
        int[] nums6 = {5, 2, -4, 6, 3, -20, 4, 10};
        System.out.println("Test Case Of Brute Force: "+obj.bruteForce(nums6));
        System.out.println("Test Case Of optimized: "+obj.optimized(nums6));
    }
}
