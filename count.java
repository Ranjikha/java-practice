class count{
    public static void main(String args[]){
        int even=0;
        int odd=0;
        int[]arr={2,5,8,7,9,10};
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
            even++;
        }
        else{
            odd++;
        }
        }
        System.out.println("even count="+even);
        System.out.println("odd count="+odd);
        
    }

}