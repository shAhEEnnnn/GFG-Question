class Solution {
    public static boolean areAnagrams(String s1, String s2) {
        //Hashmap
        if(s1.length()!=s2.length()) return false;
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s1.length();i++){
            char ch=s1.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<s2.length();i++){
            char ch=s2.charAt(i);
            if(!map.containsKey(ch)) return false;
            int freq = map.get(ch);
            if(freq==0) return false;
            map.put(ch,freq-1);
        }
        return true;
        
        
        
        
        
        //  if (s1.length() != s2.length()) return false;
        //  char[] arr1=s1.toCharArray();
        //  char[] arr2=s2.toCharArray();
        //  Arrays.sort(arr1);
        //  Arrays.sort(arr2);
        //  for(int i=0;i<arr1.length;i++){
        //      if(arr1[i]!=arr2[i]) return false;
        //  }
        //  return true;
         
    }
}