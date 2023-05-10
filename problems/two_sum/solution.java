class Solution {
    public int[] twoSum(int[] nums, int target) {

    Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int SecComp = target - nums[i];

            if (map.containsKey(SecComp)) {
                return new int[]{i, map.get(SecComp)};
            } 
            
            map.put(nums[i], i);
            
        }

        return null;
        
    }
}