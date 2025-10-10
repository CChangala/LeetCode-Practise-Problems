class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map= new HashMap<>();
        for(String s : strs){
            char[] current = s.toCharArray();
            Arrays.sort(current);
            String key = new String(current);
            if(!map.containsKey(key)){
                map.put(key,new ArrayList<>());
            }
            map.get(key).add(s);
        }
        return new ArrayList<>(map.values());
    }
}