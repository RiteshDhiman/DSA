public class removeDuplicatesFromSortedArr {
    public static void main(String[] args) {
        int arr[] = {1,1,2,2,2,3,3,4,5,5};

        int a = 0;
        for(int i = 1; i<arr.length;i++){
            if(arr[i]>arr[a]){
                arr[a+1] = arr[i];
                a++;
            }
        }

        for(int k = 0; k<arr.length; k++){
            System.out.println(arr[k]);
        }
    }
}
