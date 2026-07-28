class Min{
    public static void main(String args[]){
        int[] a={2,5,7,9,10};
        int min=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]<min){
                min=a[i];
            }
        }
        System.out.println("Minimum Value:"+min);
    }
}