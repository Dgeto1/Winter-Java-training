public class Main {
    public static void main(String[] args) {
        int[] nums = {1, 3, 1, 2, 5, 2, 1, 3};
        SortingArray(nums);
        for(int i=0; i<nums.length; i++)
        {
            System.out.println(nums[i]);
        }
    }

    public static void SortingArray(int[] arr){
        for(int i=0; i<arr.length; i++)
        {
            for (int j=i+1; j<arr.length; j++)
            {
                if(arr[i]>arr[j])
                {
                    int a = arr[i];
                    arr[i] = arr[j];
                    arr[j] = a;
                }
            }
        }
    }
}