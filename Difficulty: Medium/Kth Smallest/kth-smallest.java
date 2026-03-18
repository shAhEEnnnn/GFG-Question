class Solution {
    public int kthSmallest(int[] arr, int k) {
    //Heap method using max heap
    PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
    for(int ele : arr){
        pq.add(ele);
        if(pq.size()>k) pq.remove(); 
        
    }
    return pq.peek();
    
        
        
        
        
        
        
        
        
        
        
        
        
        
    //   int n = arr.length;
    //   for(int i=0;i<k;i++){
    //       int min = Integer.MAX_VALUE, mindx = -1;
    //       for(int j=i;j<n;j++){
    //           if(arr[j] < min){
    //               min = arr[j];
    //               mindx = j;
    //           }
    //       }
    //       int temp = arr[i];
    //       arr[i] = arr[mindx];
    //       arr[mindx] = temp;
    //   }
    //   return arr[k-1];
        
    }
}
