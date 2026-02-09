// User function Template for Java

class Solution {
    String modify(String s) {
        char firstChar = s.charAt(0);
        if(Character.isLowerCase(firstChar)){
            return s.toLowerCase();
        }
        else{
            return s.toUpperCase();
        }
    }
}