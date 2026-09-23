class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
     HashMap<String, List<String>> hs = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {

            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);

            String key = new String(chars);

            hs.computeIfAbsent(key, k -> new ArrayList<>())
              .add(strs[i]);
        }

        return new ArrayList<>(hs.values());
    }
        }

