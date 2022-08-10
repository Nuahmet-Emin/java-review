import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {
        int[] myArray = {2,7,8,5};
        System.out.println(Arrays.toString(twoSum1(myArray,9)));
        System.out.println("Optimal Solution.....");
        System.out.println(Arrays.toString(twoSum2(myArray,9)));

    }

    public static int[] twoSum1(int[] array, int target){
        for (int i=0; i< array.length-1;i++){
            for (int j= i+1; j<array.length;j++){
                if(array[i]+array[j] == target) return new int[]{i,j};

            }
        }
        return new int[]{};
    }

    //more optimal solution?
    public static int[] twoSum2(int[] array, int target){
        //Create Hashmap
        Map<Integer,Integer> map = new HashMap<>();
        //Iterate over the array. If potential match exist return that indices else put the array value and index to map
        for(int i=0; i< array.length;i++){
            int potentialMatch = target-array[i];
            if(map.containsKey(potentialMatch)) return new int[]{i,map.get(potentialMatch)};
            else map.put(array[i],i);
            //System.out.println(map);
        }
        return new int[]{};
    }
}
