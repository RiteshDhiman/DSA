public class TwoSum {
    public static void main(String[] args) {
        int arr[] = {3,3};
        int target = 6;
        int nums[] = new int[2];

        for(int i = 0; i<arr.length;i++){
            for(int j = i+1;j<arr.length;j++){
                if(arr[i]+arr[j] == target){
                    nums[0] = i;
                    nums[1] = j;
                }
            }
        }

        for(int z = 0; z<nums.length;z++){
            System.out.print(nums[z]+" ");
        }
    }
}
