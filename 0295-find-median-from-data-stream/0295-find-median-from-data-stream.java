class MedianFinder {
    private PriorityQueue<Integer> rightmax;
    private PriorityQueue<Integer> leftmin;
    public MedianFinder() {
        rightmax=new PriorityQueue<>();
        leftmin=new PriorityQueue<>(Collections.reverseOrder());
    }
    
    public void addNum(int num) {
        leftmin.offer(num);
        if(!rightmax.isEmpty() && rightmax.peek()<leftmin.peek()){
            int temp=leftmin.poll();
            leftmin.offer(rightmax.poll());
            rightmax.offer(temp);
        }
        if(leftmin.size()>rightmax.size()+1){
            rightmax.offer(leftmin.poll());
        }
        
    }
    
    public double findMedian() {
        if(leftmin.size()>rightmax.size()){
            return (double)leftmin.peek();
        }
        return ((double)leftmin.peek()+rightmax.peek())/2.0;
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */