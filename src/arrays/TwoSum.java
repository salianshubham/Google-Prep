package arrays;

import java.util.HashMap;

public class TwoSum {

    // Brute Force
    public int[] bruteForce(int[] nums, int target) {

        for(int i=0;i<nums.length;i++){
            for(int j =i+1;j<nums.length;j++ ){
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }

    // Optimized
    public int[] optimized(int[] nums, int target) {
        HashMap<Integer,Integer>map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int complement = target - nums[i];
            if(map.containsKey(complement)){
                return new int[]{map.get(complement),i};
            }else {
                map.put(nums[i],i);
            }
        }
        return new int[]{-1,-1};
    }


    public static void main(String[] args) {

        TwoSum obj = new TwoSum();

        // Test 1
        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;

        int[] result1 = obj.optimized(nums1, target1);
        System.out.println("Test 1: " + result1[0] + ", " + result1[1]);

        // Test 2 - Duplicate values
        int[] nums2 = {3, 3};
        int target2 = 6;

        int[] result2 = obj.optimized(nums2, target2);
        System.out.println("Test 2: " + result2[0] + ", " + result2[1]);


        // Test 3 - Negative numbers
        int[] nums3 = {-3, 4, 3, 90};
        int target3 = 0;

        int[] result3 = obj.optimized(nums3, target3);
        System.out.println("Test 3: " + result3[0] + ", " + result3[1]);

        // Test 4 - Solution at the end
        int[] nums4 = {1, 5, 8, 12};
        int target4 = 20;

        int[] result4 = obj.optimized(nums4, target4);
        System.out.println("Test 4: " + result4[0] + ", " + result4[1]);


        // Test 5 - No solution
        int[] nums5 = {1, 2, 3};
        int target5 = 100;

        int[] result5 = obj.optimized(nums5, target5);
        System.out.println("Test 5: " + result5[0] + ", " + result5[1]);
    }
}
