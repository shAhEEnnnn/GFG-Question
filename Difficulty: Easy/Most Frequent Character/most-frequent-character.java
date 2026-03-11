class Solution {
    public char getMaxOccuringChar(String s) {
        // Now we are using hashmap method 
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(map.containsKey(ch)){
                int freq = map.get(ch);
                map.put(ch,freq+1); //overwrite
            }
            else map.put(ch,1);
        }
        int maxFreq = 0;
        for(char ch: map.keySet()){
            int freq = map.get(ch);
            if(freq>maxFreq) maxFreq = freq;
        }
        char ans = 'z';
        for(char ch: map.keySet()){
            int freq = map.get(ch);
            if(freq==maxFreq && ch<=ans){
                ans = ch;
            }
        
        }
            return ans;
        
        
        
        //Freq Array method
        // int n=s.length();
        // int[] freq=new int[26];
        // for(int i=0;i<n;i++){
        //     char ch=s.charAt(i);
        //     int idx = ch-'a';
        //     freq[idx]++;
        // }
        // int maxFreq = 0;
        // char ans = s.charAt(0);
        // for(int i=0;i<26;i++){
        //     if(freq[i]>maxFreq){
        //         maxFreq=freq[i];
        //         ans=(char)(i+97);
        //     }
        // }
        // return ans;
        
        //convert string  to char then sorting
    //   int n = s.length();
    //   int maxFreq =-1;
    //   char ans=s.charAt(0);
    //   char[] arr=s.toCharArray();
    //   Arrays.sort(arr);
    //   int i=0, j=0;
    //   while(j<n){
    //       if(arr[i]==arr[j]) j++;
    //       else{
    //           int freq=j - i;
    //           if(freq>maxFreq){
    //               maxFreq=freq;
    //               ans=arr[i];
    //           }
    //           i=j;
    //       }
    //   }
    //     int freq=j-i;
    //           if(freq>maxFreq){
    //               maxFreq=freq;
    //               ans=arr[i];
    //           }
    //           return ans;
    }
}