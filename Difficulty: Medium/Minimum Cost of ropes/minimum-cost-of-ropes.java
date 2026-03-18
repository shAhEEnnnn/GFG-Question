class Solution {
    public static int minCost(int[] arr) {
        // code here
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int ele : arr){
            pq.add(ele);
            
        }
        int cost =0;
        while(pq.size()>1){
            int a = pq.remove();
            int b = pq.remove();
            
            int sum = a+b;
            cost +=sum;
            pq.add(sum);
        }
        return cost;
    }
}