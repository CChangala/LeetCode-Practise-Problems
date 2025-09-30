class Solution {
    public String reverseWords(String s) {
        String[] parts = s.trim().split("\\s+");
        List<String> list = Arrays.asList(parts);
        Collections.reverse(list);
        return String.join(" ", list);     
    }
}