class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        int n=matrix.length;
        if(n*n<k){
            return 0;
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                pq.offer(matrix[i][j]);
            }
        }
        while(k>1){
            pq.poll();
            k--;
        }
        return pq.peek();
    }
}