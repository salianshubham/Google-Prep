package arrays;

public class BestTimeToBuyStockII {

    // Optimized
    public int optimized(int[] prices) {
        if(prices.length ==0){
            return 0;
        }
        int lastPrice = prices[0];
        int totalProfit = 0;
        for(int i=1;i<prices.length;i++){
            if(lastPrice < prices[i]){
                totalProfit = totalProfit + (prices[i] - lastPrice);
            }
            lastPrice = prices[i];
        }
        return totalProfit;
    }

    public static void main(String[] args) {
        BestTimeToBuyStockII obj = new BestTimeToBuyStockII();
        int[] nums1 = {7,1,5,3,6,4};
        System.out.println("Test Case Of optimized: "+obj.optimized(nums1));
        int[] nums2 = {1,2,3,4,5};
        System.out.println("Test Case Of optimized: "+obj.optimized(nums2));
        int[] nums3 = {7,6,4,3,1};
        System.out.println("Test Case Of optimized: "+obj.optimized(nums3));
        int[] nums4 = {1};
        System.out.println("Test Case Of optimized: "+obj.optimized(nums4));
        int[] nums5 = {1,2};
        System.out.println("Test Case Of optimized: "+obj.optimized(nums5));
        int[] nums6 = {2,1};
        System.out.println("Test Case Of optimized: "+obj.optimized(nums6));
        int[] nums7 = {2,4,1,7};
        System.out.println("Test Case Of optimized: "+obj.optimized(nums7));
        int[] nums8 = {3,2,6,5,0,3};
        System.out.println("Test Case Of optimized: "+obj.optimized(nums8));
        int[] nums9 = {1,3,2,8,4,9};
        System.out.println("Test Case Of optimized: "+obj.optimized(nums9));
        int[] nums10 = {5,5,5,5};
        System.out.println("Test Case Of optimized: "+obj.optimized(nums10));
        int[] nums11 = {1,2,1,2,1,2};
        System.out.println("Test Case Of optimized: "+obj.optimized(nums11));
        int[] nums12 = {};
        System.out.println("Test Case Of optimized: "+obj.optimized(nums12));

    }
}
