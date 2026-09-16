class Solution {
    public boolean isPalindrome(String s) {
        
        StringBuilder sCleaned = new StringBuilder();

        for(int i = 0; i < s.length(); i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                sCleaned.append(Character.toLowerCase(s.charAt(i)));
            }
        }
        int l = 0;
        int r = sCleaned.length() - 1;

        while(l < r){
            if(sCleaned.charAt(l) == sCleaned.charAt(r)){
                l += 1;
                r -= 1;
            }
            else{
                return false;
            }
        }
        return true;
    }
}
