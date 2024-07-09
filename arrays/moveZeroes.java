public class moveZeroes {
    public static void main(String[] args) {
        int arr[]  = {0,1,0,3,12};

        int index = 0;

        for(int i = 0 ; i<arr.length ;i++){
            if(arr[i] == 0){
                index = i;
                break;
            }
        }

        int k = index;

        for(int j = k ; j<arr.length ; j++){
            if(arr[j] != 0){
                int temp = arr[j];
                arr[j] = arr[k];
                arr[k] = temp;
                k++;
            }

            for(int z = 0; z<arr.length ;z++){
                System.out.print(arr[z] + " ");
            }
        }

        
    }
}
