public class rotateArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int temp[] = new int[arr.length];

        //Number of positions by which the array is to be rotated
        int k = 3;

        for(int i = 0; i<arr.length; i++){
            temp[(i+k)%arr.length] = arr[i];   // % or modulus returns integers ranging from 0 to (n-1) only
        }

        for(int j = 0; j<arr.length; j++){
            arr[j] = temp[j];
        }

        for(int l = 0; l<arr.length;l++){
            System.out.print(arr[l] + " ");
        }
        // int start = 0;
        // int end = arr.length-1;
        // while(start < end){
        //     int t = arr[start];
        //     arr[start] = arr[end];
        //     arr[end] = t;
        //     start++;
        //     end--;
        // }

        // int start0 = 0;
        // int end0 = k;
        // while(start0 < end0){
        //     int t = arr[start];
        //     arr[start] = arr[end];
        //     arr[end] = t;
        //     start++;
        //     end--;
        // }

        // int start1 = k+1;
        // int end1 = arr.length-1;
        // while(start1 < end1){
        //     int t = arr[start];
        //     arr[start] = arr[end];
        //     arr[end] = t;
        //     start++;
        //     end--;
        // }

        // for(int l = 0; l<arr.length;l++){
        //     System.out.print(arr[l] + " ");
        // }
    }
}
