class Solution {
    public boolean isPalindrome(String s) {

        StringBuilder res = new StringBuilder();
        
        for(int i = 0; i < s.length(); i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                res.append(Character.toLowerCase(s.charAt(i)));
            }
        }
        return res.toString().equals(res.reverse().toString());
    }
}
