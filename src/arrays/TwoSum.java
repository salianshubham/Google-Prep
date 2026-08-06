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

        int nums[] = {2,7,11,15};

            int target = 13;

        int[] result = obj.bruteForce(nums,target);
        int[] resultOptimized = obj.optimized(nums,target);
        System.out.println("result :"+result[0]+" "+result[1]);
        System.out.println("resultOptimized :"+resultOptimized[0]+" "+resultOptimized[1]);
    }
}
