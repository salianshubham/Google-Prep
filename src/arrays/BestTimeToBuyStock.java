package arrays;


public class BestTimeToBuyStock {

    // Brute Force
    public int bruteForce(int[] nums) {
       int maxProfit = 0;

        for(int i=0;i<nums.length;i++){
            for(int j =i+1;j<nums.length;j++ ){
                int profit = nums[j] - nums[i];
                if(profit >maxProfit){
                    maxProfit = profit;
                }
            }
        }
        return maxProfit;
    }

    // Optimized
    public int optimized(int[] prices) {
        int minPrice = prices[0];
        int maxProfit = 0;
        for(int i=1;i<prices.length;i++){
            if(prices[i] < minPrice){
                minPrice = prices[i];
            }

            if(maxProfit <  prices[i] - minPrice ){
                maxProfit = prices[i] - minPrice;
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        BestTimeToBuyStock obj = new BestTimeToBuyStock();
        int[] nums1 = {7,1,5,3,6,4};
        System.out.println("Test Case Of Brute Force: "+obj.bruteForce(nums1));
        System.out.println("Test Case Of optimized: "+obj.optimized(nums1));
        int[] nums2 = {7,6,4,3,1};
        System.out.println("Test Case Of Brute Force: "+obj.bruteForce(nums2));
        System.out.println("Test Case Of optimized: "+obj.optimized(nums2));
        int[] nums3 = {1,2,3,4,5};
        System.out.println("Test Case Of Brute Force: "+obj.bruteForce(nums3));
        System.out.println("Test Case Of optimized: "+obj.optimized(nums3));

    }
}
