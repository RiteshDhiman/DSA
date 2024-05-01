public class secondLargestElement {
    public static void main(String[] args) {
        int arr[] = {5,6,2,8,9};
        int largest = arr[0];
        int secondLargest = Integer.MIN_VALUE;
        // for(int i = 0; i < arr.length-1; i++ ){
        //     if(largest <  arr[i]){
        //         largest = arr[i];
        //     }
        // }

        // for(int j = 0; j < arr.length - 1 ; j++){
        //     if((arr[j]>secondLargest) && (arr[j]<largest)){
        //         secondLargest = arr[j];
        //     }
        // }

            for(int k = 1 ; k<arr.length; k++){
                if(largest < arr[k]){
                    secondLargest = largest;
                    largest = arr[k];
                }

                else if((arr[k] < largest) && (arr[k]>secondLargest)){
                    secondLargest = arr[k];
                }
            }

        System.out.println("Second largest element is "+secondLargest);
    }
}
