class Solution {
    int missingNum(int arr[]) {
        //usng cyclic sort
        int n = 1+arr.length;
        int i = 0;
        while(i<arr.length){
            if(arr[i] == i+1 || arr[i] == n) i++;
            else{
                int idx = arr[i]-1;
                swap(arr,i,idx);
            }
        }
        for(i=0;i<arr.length;i++){
            if(arr[i] != i+1) return i+1;
        }
        return n;
    }
        void swap(int[] arr, int i, int idx){
            int temp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = temp;
      
        
        
    //   int n=arr.length+1;  //aise array ki size n-1 tak hoti but ek ele missing h issliye size n tak hogi
    //   long sum=(long)n*(n+1)/2;
    //   long arraySum= 0;
    //   for(int ele : arr){
    //       arraySum +=ele;
    //   }
    //   return (int)(sum - arraySum);
       
    
    }
}