// User function Template for Java
class Solution {
    static int distinct(int arr[]) {
        HashSet<Integer> set = new HashSet<>();
       for(int ele:arr) set.add(ele);
       return set.size();
        
        
    }
}