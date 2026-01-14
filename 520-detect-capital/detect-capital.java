class Solution {
    public boolean detectCapitalUse(String word) {
        String lo=word.toLowerCase();
        String up=word.toUpperCase();


        if(word.equals(lo) || word.equals(up)){
            return true;
        }
        String first = word.substring(0, 1).toUpperCase();
        String rest = word.substring(1).toLowerCase();

        return word.equals(first + rest);
    }
}