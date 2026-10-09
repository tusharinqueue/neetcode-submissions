class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

         if(strs.length==0){
            return new ArrayList();
         }
        HashMap <String , List<String>> map = new HashMap <>();

        for(String i:strs){
            int[] freq = new int[26];

            for(char c: i.toCharArray())
            freq[c-'a']++;

            StringBuilder sb = new StringBuilder("");
            for(int s=0; s<26; s++){
                sb.append("#");
                sb.append(freq[s]);
            }

            String key = sb.toString();

            if(!map.containsKey(key)){
                map.put(key , new ArrayList<>());
            }

            map.get(key).add(i);
        }

        return new ArrayList(map.values());

    }
}
