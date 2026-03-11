class Solution {
    boolean twoSum(int arr[], int target) {
    //Solve by hashset
    HashSet<Integer> set = new HashSet<>();
    for(int ele : arr){
        int rem = target - ele;
        if(set.contains(rem)) return true;
        set.add(ele);
    }
    return false;
    
        
        
    //   Arrays.sort(arr);
    //   int i=0,j=arr.length-1;
    //   while(i<j){
    //       if(arr[i]+arr[j]==target) return true;
    //       else if(arr[i]+arr[j]>target) j--;
    //       else if(arr[i]+arr[j]<target) i++;
    //   }
    //   return false;
        
    }
}