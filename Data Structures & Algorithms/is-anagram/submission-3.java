class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()){
            return false;
        }

        HashMap<Character, Integer> S = new HashMap<>();

        for(int i=0; i<s.length(); i++){
            S.put(s.charAt(i)  , S.getOrDefault(s.charAt(i), 0)+1 );
            S.put(t.charAt(i)  , S.getOrDefault(t.charAt(i), 0)-1 );
        }

        for(char i: S.keySet()){
            if(S.get(i)!=0){
                return false;
            }
        }
        return true;
    }
}
