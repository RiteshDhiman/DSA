public class arraySortedandReversed {
    public static void main(String[] args) {
        int arr[] = {3,4,5,1,2};
        int k = Integer.MAX_VALUE;
        int index = 0;
        //Min element

        for(int i = 0; i<arr.length; i++){
            if(arr[i]<k){
                k = arr[i];
                index = i;
            }
        }   

        for(int j = index%arr.length; j<arr.length - 1+index; j++){
            if(arr[j]<arr[j+1]){
                System.out.println("Sorted and rotated");
            }
            else{
                System.out.println("Unsorted");
            }

        }

        // System.out.println(small);
    }
}
