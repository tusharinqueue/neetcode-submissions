class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        
        HashMap <String , List<String>> map = new HashMap <>();

        for(String i:strs){
            int[] freq = new int[26];

            for(char c: i.toCharArray())
            freq[c-'a']++;

            String key = Arrays.toString(freq);
            map.putIfAbsent(key , new ArrayList<>());

            map.get(key).add(i);
        }

        return new ArrayList(map.values());

    }
}
