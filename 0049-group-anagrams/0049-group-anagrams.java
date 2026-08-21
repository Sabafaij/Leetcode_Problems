class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>>map=new HashMap<>();
        for(String str: strs){
            char[] chars=str.toCharArray();
            Arrays.sort(chars);
            String s=new String(chars);
            if(map.containsKey(s)){
                map.get(s).add(str);
            }
            else{
                List<String> temp = new ArrayList<>();
                temp.add(str);
                map.put(s, temp);
            }
        }
        return new ArrayList<>(map.values());
    }
}