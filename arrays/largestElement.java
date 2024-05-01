public class largestElement {
    public static void main(String[] args) {
        int arr[] = {3,2,1,5,2};
        int largest = 0;
        for(int i = 0; i < arr.length-1; i++ ){
            if(largest <  arr[i]){
                largest = arr[i];
            }
        }

        System.out.println("Largest element is "+largest);
    }
}
