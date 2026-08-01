class SecondLargest{
    public static void main(String args[]){
        int[] arr={10,20,50,40,80};
        int largest=arr[0];
        int Secondlargest=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        for(int i=1;i<arr.length;i++){
            if(arr[i]>Secondlargest && arr[i]<largest){
                Secondlargest=arr[i];
            }
        }
        System.out.println(largest);
        System.out.println(Secondlargest);
    }
}