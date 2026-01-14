class Solution {
    public boolean isPalindrome(String s) {
        String l = s.toLowerCase();
        String result = l.replaceAll("[^a-zA-Z0-9]", "");
        String s1=result;
        String reversed = new StringBuilder(result).reverse().toString();
        if(reversed.equals(result)){
            return true;
        }
        else{
            return false;
        }

    }
}