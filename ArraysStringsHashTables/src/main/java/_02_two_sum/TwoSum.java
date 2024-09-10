package _02_two_sum;

import java.util.Map;
import java.util.HashMap;


// Dado un array de números enteros y un target, retorna los índices de dos
// números para los que la suma de ambos sea igual al target.

// Puedes asumir que hay solamente una solución.

// Ejemplo 1:
// Input: nums = [9,2,5,6], target = 7
// Output: [1,2]
// Explicación: nums[1] + nums[2] == 7, devolvemos [1, 2].

// Ejemplo 2:
// Input: nums = [9,2,5,6], target = 100
// Output: null


public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        if(nums == null || nums.length < 2) return null;

        Map<Integer, Integer> comMap = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            if(comMap.containsKey(nums[i])) return new int[]{i, comMap.get(nums[i])};

            int complement = target - nums[i];
            comMap.put(complement, i);
        }
        return null;
    }
}
