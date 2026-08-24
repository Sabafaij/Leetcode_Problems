class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->{
            int e1r=a[0],e1c=a[1], e2r=b[0], e2c=b[1];
            int v1=matrix[e1r][e1c];
            int v2=matrix[e2r][e2c];
            return v1-v2;
        });
        for(int i=0;i<matrix.length;i++){
            pq.add(new int[]{i,0});
        }
        while(k-->1){
            int[] currEleIdx=pq.remove();
            int cer=currEleIdx[0];
            int cec=currEleIdx[1];
            cec++;
            if(cec<matrix[0].length){
                pq.add(new int[]{cer,cec});
            }
        }
        int[] ans=pq.remove();
        int ansR=ans[0];
        int ansC=ans[1];
        return matrix[ansR][ansC];
        // PriorityQueue<Integer> pq=new PriorityQueue<>();
        // int n=matrix.length;
        // if(n*n<k){
        //     return 0;
        // }
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<n;j++){
        //         pq.offer(matrix[i][j]);
        //     }
        // }
        // while(k>1){
        //     pq.poll();
        //     k--;
        // }
        // return pq.peek();
    }
}