package arrays;


public class MoveZeroes {
    public int[] moveZeroes(int[] nums) {
        // your solution
        int position = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                int temp = nums[i];
                nums[i] = nums[position];
                nums[position] = temp;
                position++;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        MoveZeroes obj = new MoveZeroes();
        // tests
        int[] moveZeroes = {0,1,0,3,12};
        int [] result = obj.moveZeroes(moveZeroes);
        System.out.print("[");
        for (int j : result) {
            System.out.print(j + " ");
        }
        System.out.println("]");

        // Test 2
        int[] moveZeroes2 = {0};
        int [] result2 = obj.moveZeroes(moveZeroes2);
        System.out.print("[");
        for (int j : result2) {
            System.out.print(j + " ");
        }
        System.out.println("]");

        // Test 3
        int[] moveZeroes3 = {1,2,3};
        int [] result3 = obj.moveZeroes(moveZeroes3);
        System.out.print("[");
        for (int j : result3) {
            System.out.print(j + " ");
        }
        System.out.println("]");

        // Test 4
        int[] moveZeroes4 = {0,5,0,2,8};
        int [] result4 = obj.moveZeroes(moveZeroes4);
        System.out.print("[");
        for (int j : result4) {
            System.out.print(j + " ");
        }
        System.out.println("]");
    }
}
