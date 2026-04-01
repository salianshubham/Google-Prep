import java.util.HashMap;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Two Sum Problem!");

        int nums[] = {2,7,9,3};
        int target = 10;

        Map<Integer,Integer>map = new HashMap<>();

        for(int i=0;i< nums.length;i++){
            int component = target-nums[i];
            if(map.containsKey(component)){
                map.put(nums[i],i);
                System.out.println("Two Sum Numbers are "+component+" : "+nums[i]);
                break;
            }else {
                map.put(nums[i],i);
            }

        }
    }
}