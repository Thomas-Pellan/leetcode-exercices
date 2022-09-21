package fr.pellan.leetcoode;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSums {

    public static void main (String[] args){

        int[] result = twoSum(new int[]{3,2,4}, 6);
        System.out.println(Arrays.toString(result));
        result = twoSumv2(new int[]{3,2,4}, 6);
        System.out.println(Arrays.toString(result));
    }

    public static int[] twoSumv2(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(map.get(nums[i]) != null){
                return new int[]{map.get(nums[i]), i};
            }
            if(map.get(target - nums[i]) == null){
                map.put(target - nums[i], i);
            }
        }

        return null;
    }

    public static int[] twoSum(int[] nums, int target) {

        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    return new int[] {i, j};
                }
            }
        }
        return null;
    }
}


