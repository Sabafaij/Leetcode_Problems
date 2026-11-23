class ProductOfNumbers {
    List<Integer> list;
    public ProductOfNumbers() {
        list=new ArrayList<>();
    }
    
    public void add(int num) {
        int n=list.size();
        if(n==0 || num==1){
            list.add(num);
        }
        else{
            for(int i=n-1;i>=0;i--){
                list.set(i,list.get(i)*num);
            }
            list.add(num);
        }
    }
    
    public int getProduct(int k) {
        
        return list.get(list.size()-k);
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */