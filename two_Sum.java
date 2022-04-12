import java.util.HashMap;

public class two_Sum{
/* Given an array of integers nums and an integer target, 
return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, 
and you may not use the same element twice.
You can return the answer in any order.

Follow-up: Can you come up with an algorithm that is less than O(n2) time complexity? */
public static void main(String[] args){

}
public static int[] twoSum(int[] nums, int target){
    HashMap<Integer,Integer> valueHolder = new HashMap<>(); // Create HM in order to hold values and index
    for(int i = 0; i < nums.length;i++){
        int comp = target-nums[i]; // calculates the complement of the current value
        if(valueHolder.containsKey(comp)) // if we have the complement in the HM then we have solved the equation
        return new int[] {valueHolder.get(comp), i};

        valueHolder.put(comp, i); // Add value to HM
    }
    return new int[] {}; // if we never find value we return empty array
}

    



}