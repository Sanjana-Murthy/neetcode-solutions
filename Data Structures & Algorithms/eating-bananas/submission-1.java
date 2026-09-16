class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        //binary search approach
        int l = 1, r = Arrays.stream(piles).max().getAsInt();
        int res = r;
        while(l <= r){
            int totalTime = 0;
            int k = (l + r) / 2;

            for(int p : piles){
                totalTime += Math.ceil((double) p / k);
            }
            if(totalTime <= h){
                res = k;
                r = k - 1;
            }
            else{
                l = k + 1;
            }
        }
        return res;
    }
}
