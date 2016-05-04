public class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
        List<Integer>[] buckets = new ArrayList[nums.length + 1];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        for (int key : map.keySet()) {
            int frequency = map.get(key);
            if (buckets[frequency] == null) {
                buckets[frequency] = new ArrayList<Integer>();
            }
            buckets[frequency].add(key);
        }
        List<Integer> result = new ArrayList<Integer>();
        for (int index = nums.length; index >= 0 && result.size() < k; index--) {
            if (buckets[index] != null) {
                result.addAll(buckets[index]);
            }
        }
        return result;
    }
}