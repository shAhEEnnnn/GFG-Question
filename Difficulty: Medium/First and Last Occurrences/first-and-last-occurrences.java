// User function Template for Java

class GFG {
    ArrayList<Integer> find(int arr[], int x) {
       ArrayList<Integer> ans = new ArrayList<Integer>();
       int lo = 0, hi = arr.length - 1, idx = -1;
       while(lo<=hi){
           int mid = (lo+hi)/2;
           if(arr[mid] < x) lo = mid + 1;
           else if(arr[mid]>x) hi = mid - 1;
           else{
               idx = mid;
               hi = mid - 1;
           }
       }
       ans.add(idx);
       lo = 0;
       hi = arr.length - 1;
       idx = -1;
       while(lo<=hi){
           int mid = (lo+hi)/2;
           if(arr[mid]<x) lo = mid + 1;
           else if(arr[mid]>x) hi = mid - 1;
           else{
               idx = mid;
               lo = mid + 1;
           }
       }
       ans.add(idx);
       return ans;
    }
}
