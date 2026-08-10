package arrays;

public class RemoveDuplicates {

    public int removeDuplicates(int[] nums) {
        // your solution
        if(nums.length==0){
            return 0;
        }
        int k = 1;
        for (int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        RemoveDuplicates obj = new RemoveDuplicates();
        // test 1
        int[] removeDuplicates = {1,1,2};
        System.out.println("Total Unique Number : "+obj.removeDuplicates(removeDuplicates));

        // test 2
        int[] removeDuplicates2 = {0,0,1,1,1,2,2,3,3,4};
        System.out.println("Total Unique Number : "+obj.removeDuplicates(removeDuplicates2));

        // test 3
        int[] removeDuplicates3 = {1,1,1,1};
        System.out.println("Total Unique Number : "+obj.removeDuplicates(removeDuplicates3));

        // test 4
        int[] removeDuplicates4 = {1,2,3,4};
        System.out.println("Total Unique Number : "+obj.removeDuplicates(removeDuplicates4));

        // test 5
        int[] removeDuplicates5 = {1};
        System.out.println("Total Unique Number : "+obj.removeDuplicates(removeDuplicates5));

        // test 6
        int[] removeDuplicates6 = {};
        System.out.println("Total Unique Number : "+obj.removeDuplicates(removeDuplicates6));
    }
}
