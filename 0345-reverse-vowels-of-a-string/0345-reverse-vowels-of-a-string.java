class Solution {
    public String reverseVowels(String s) {
        int i = 0;
        int j = s.length()-1;
        HashSet<Character> set = new HashSet<>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));
        StringBuilder str = new StringBuilder(s);
        while(i<=j){
            if(set.contains(s.charAt(i)) && set.contains(s.charAt(j))){
                char c = s.charAt(i);
                str.setCharAt(i,s.charAt(j));
                str.setCharAt(j,c);
                i++;
                j--;
            }
            else if(set.contains(s.charAt(i))){
                j--;
            }
            else{
                i++;
            }


        }
        return str.toString();
    }
}