class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        generateParenthesis("",n,0,0,res);
        return res;
    }

    static void generateParenthesis(String p, int n , int open,int close, List<String> res){
        
        if(p.length() == 2 * n){
            res.add(p);
            return;
        }

        if(open<n){
            generateParenthesis(p + '(', n ,  open+1, close, res);
        }

        if(close<open){
            generateParenthesis(p + ')', n ,  open,close + 1, res);
        }
         
    }
    
}