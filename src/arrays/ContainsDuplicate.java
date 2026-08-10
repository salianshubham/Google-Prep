package arrays;

import java.util.HashMap;

public class ContainsDuplicate {

    public boolean bruteForce(int[] nums) {
        // your solution
        for(int i=0;i<nums.length;i++){
            for (int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    return true;
                }
            }
        }
        return false;
    }

    public boolean optimized(int[] nums) {
        // HashMap solution
        HashMap<Integer,Integer>map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],i);
            }else {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ContainsDuplicate obj = new ContainsDuplicate();
        // tests
        int[] checkDuplicate = {1,2,3,1};
        System.out.println("bruteForce check duplicate : "+obj.bruteForce(checkDuplicate));
        System.out.println("optimized check duplicate : "+obj.optimized(checkDuplicate));

        int[] checkDuplicate1 = {1,2,3,4};
        System.out.println("bruteForce check duplicate : "+obj.bruteForce(checkDuplicate1));
        System.out.println("optimized check duplicate : "+obj.optimized(checkDuplicate1));

        int[] checkDuplicate2 = {1,1};
        System.out.println("bruteForce check duplicate : "+obj.bruteForce(checkDuplicate2));
        System.out.println("optimized check duplicate : "+obj.optimized(checkDuplicate2));

        int[] checkDuplicate3 = {1,2,3,4,5,6,7,8,9,10,5};
        System.out.println("bruteForce check duplicate : "+obj.bruteForce(checkDuplicate3));
        System.out.println("optimized check duplicate : "+obj.optimized(checkDuplicate3));

        int[] checkDuplicate4 = {};
        System.out.println("bruteForce check duplicate : "+obj.bruteForce(checkDuplicate4));
        System.out.println("optimized check duplicate : "+obj.optimized(checkDuplicate4));
    }
}

//bruteForce
//time complexity O(n2)// n sqauare
//space complexity O(1)
//
//optimized
//time complexity O(n)
//space complexity O(n)