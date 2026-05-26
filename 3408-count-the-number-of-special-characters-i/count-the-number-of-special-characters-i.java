class Solution {
    public int numberOfSpecialChars(String word) {

        int ans = 0;

        for(char ch = 'a'; ch <= 'z'; ch++) {

            boolean small = false;
            boolean capital = false;

            for(int i = 0; i < word.length(); i++) {

                if(word.charAt(i) == ch) {
                    small = true;
                }

                if(word.charAt(i) == (char)(ch - 32)) {
                    capital = true;
                }
            }

            if(small && capital) {
                ans++;
            }
        }

        return ans;
    }
}