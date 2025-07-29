class Solution {
    public boolean isPalindrome(int x) {
        // quick base case check for negatives, ending in 0 , or simply not 0
        if (x != 0 && x % 10 == 0 || x < 0 ) 
            return false;
        // creating the second half for comparing
        int pal_num = 0;
        while (x > pal_num) {
            int d = x % 10;
            pal_num = pal_num * 10 + d;
            x/=10;
        }
        // comparing the two halves
        return (x == pal_num) || (x== pal_num/10);
    }
}
