package arrays;

public class ProductOfArrayExceptSelf {

    public int[] optimized(int[] nums) {
        // your solution
        int product = 1;
        int[] answer = new int[nums.length];
        answer[0] = product;
        for(int i=1;i<nums.length;i++){
            product = nums[i-1] * product;
            answer[i] = product;
        }

        product = 1;
        answer[nums.length-1] = product * answer[nums.length-1];
        for(int i=nums.length-1;i>0;i--){
            product = nums[i] * product;
            answer[i-1] = product * answer[i-1];
        }
        return answer;
    }

    public static void main(String[] args) {
        ProductOfArrayExceptSelf obj = new ProductOfArrayExceptSelf();
        // tests
        int[] nums = {2, 3, 4};
        int [] result = obj.optimized(nums);
        System.out.print("[");
        for (int j : result) {
            System.out.print(j + " ");
        }
        System.out.println("]");

        // Test 2
        int[] nums2 = {1, 2, 3, 4};
        int [] result2 = obj.optimized(nums2);
        System.out.print("[");
        for (int j : result2) {
            System.out.print(j + " ");
        }
        System.out.println("]");
//
//        // Test 3
        int[] nums3 = {2, 5, 3};
        int [] result3 = obj.optimized(nums3);
        System.out.print("[");
        for (int j : result3) {
            System.out.print(j + " ");
        }
        System.out.println("]");
//
//        // Test 4
        int[] nums4 = {1, 2, 0, 4};
        int [] result4 = obj.optimized(nums4);
        System.out.print("[");
        for (int j : result4) {
            System.out.print(j + " ");
        }
        System.out.println("]");

        // Test 5
        int[] nums5 = {-1, 2, -3, 4};
        int [] result5 = obj.optimized(nums5);
        System.out.print("[");
        for (int j : result5) {
            System.out.print(j + " ");
        }
        System.out.println("]");
    }
}
