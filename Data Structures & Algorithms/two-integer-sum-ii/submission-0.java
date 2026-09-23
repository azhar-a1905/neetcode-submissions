
class Solution {
    public int[] twoSum(int[] numbers, int target) {

        HashMap<Integer, Integer> s = new HashMap<>();

        for (int i = 0; i < numbers.length; i++) {

            int key = target - numbers[i];

            if (s.containsKey(key)) {
                return new int[] {s.get(key) + 1, i + 1};
            }

            s.put(numbers[i], i);
        }

        return new int[] {};
    }
}