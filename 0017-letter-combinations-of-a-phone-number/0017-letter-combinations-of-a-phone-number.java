class Solution {

    private static void pad(String p,String up,List<String> res,HashMap<Character,String> map){

        if(up.isEmpty()){
            res.add(p);
            return;
        }
        String str =  map.get(up.charAt(0));

        for(int i = 0; i<str.length();i++){
            char c = str.charAt(i);
            pad(p+c,up.substring(1),res,map);
        }

    }
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();

        if (digits == null || digits.length() == 0) {
            return res;
        }

        HashMap<Character,String> digitToLetters = new HashMap<>();
        digitToLetters.put('2', "abc");
        digitToLetters.put('3', "def");
        digitToLetters.put('4', "ghi");
        digitToLetters.put('5', "jkl");
        digitToLetters.put('6', "mno");
        digitToLetters.put('7', "pqrs");
        digitToLetters.put('8', "tuv");
        digitToLetters.put('9', "wxyz");

        pad("",digits,res,digitToLetters);
        return res;
    }
}