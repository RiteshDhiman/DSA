public class arraySortedCheck {
    public static void main(String[] args) {
        int arr[] = {1,1,2,3,1};

        boolean sorted = true;

        int first = arr[0];

        for(int i = 0; i<arr.length; i++){
            if(first <= arr[i]){
                sorted = true;
                first = arr[i];
            }

            else if(first > arr[i]){
                sorted = false;
                break;
            }
        }

        System.out.println(sorted);

    }
}
