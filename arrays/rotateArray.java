public class rotateArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int temp[] = new int[arr.length];
        int k = 3;

        for(int i = 0; i<arr.length; i++){
            temp[(i+k)%arr.length] = arr[i];
        }

        for(int j = 0; j<arr.length; j++){
            arr[j] = temp[j];
        }

        for(int l = 0; l<arr.length;l++){
            System.out.print(arr[l] + " ");
        }
    }
}
