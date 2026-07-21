class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] maxElements = new int[k];
        List<Integer> sorted = new ArrayList<>();

      
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        sorted.addAll(map.values());
        Collections.sort(sorted);

       
        List<Integer> topKValues = sorted.subList(sorted.size() - k, sorted.size());

        int index = 0;
        for (int key : map.keySet()) {
            int freq = map.get(key);
            if (topKValues.contains(freq)) {
                maxElements[index] = key;
                index++;
                if (index == k) break;
            }
        }

        return maxElements;
    }
}