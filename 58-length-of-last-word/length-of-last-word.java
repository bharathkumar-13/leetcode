import java.util.*;
class Solution {
    public int lengthOfLastWord(String s) {
        String[] words = s.split(" ");
        String l=words[words.length-1];
        int k=l.length();
        return k;

        
    }
}