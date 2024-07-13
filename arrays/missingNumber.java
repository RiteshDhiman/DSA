public class missingNumber {
    public static void main(String[] args) {
        int index = 0;
        int arr[] = {0,1};
        int arr1[] = new int[arr.length+1];

        for(int i = 0 ; i<arr1.length ; i++){
            arr1[i] = -1;
        }

        for(int j = 0; j<arr.length ;j++){
            arr1[arr[j]] = arr[j];
        }

        for(int k = 0; k<arr1.length ; k++){
            if(arr1[k] == -1){
                index = k;
            }
        }

        System.out.println(index);

        //Also check the second solution i did on leetcode 

    }
}
