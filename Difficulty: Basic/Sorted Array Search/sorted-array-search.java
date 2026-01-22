class Solution {
    static boolean searchInSorted(int arr[], int k) {
       int lo = 0, hi = arr.length - 1;
       while(lo<=hi){
           int mid = (lo+hi)/2;
           if(arr[mid]==k) return true;
           else if(arr[mid]<k)
           lo = mid + 1;
           else hi = mid -1;
       }
       return false;
        
    }
}