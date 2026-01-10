class Solution {
    int missingNum(int arr[]) {
       int n=arr.length+1;  //aise array ki size n-1 tak hoti but ek ele missing h issliye size n tak hogi
      long sum=(long)n*(n+1)/2;
      long arraySum= 0;
       for(int ele : arr){
          arraySum +=ele;
       }
       return (int)(sum - arraySum);
       
    
    }
}