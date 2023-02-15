public class Main {
    public static void main(String[] args) {
        for(int i=1; i<=100; i++)
        {
            if(i%3==0 && i%5==0)
            {
                System.out.println("git hub");
            }
            else if(i%3==0)
            {
                System.out.println("git");
            }
            else if(i%5==0)
            {
                System.out.println("hub");
            }
            else{
                System.out.println(i);
            }
        }

        String wordOne = "abc";
        String wordTwo = "dafc";
        System.out.println(SameStrings(wordOne, wordTwo));

        int[] nums = {1, 3, 1, 2, 5, 2, 1, 3};
        SortingArray(nums);
        for(int i=0; i<nums.length; i++)
        {
            System.out.println(nums[i]);
        }
    }

    public static String SameStrings(String wordOne, String wordTwo){
        String sameSt = "";

        for(int i=0; i<wordOne.length(); i++)
        {
            for(int j=0; j<wordTwo.length(); j++)
            {
                if(wordOne.charAt(i) == wordTwo.charAt(j))
                {
                    sameSt += wordOne.charAt(i);
                }
            }
        }
        return  sameSt;
    }

    public static void SortingArray(int[] arr){
        for(int i=0; i<arr.length; i++)
        {
            for (int j=i+1; j<arr.length; j++)
            {
                if(arr[i] > arr[j])
                {
                    int a = arr[i];
                    arr[i] = arr[j];
                    arr[j] = a;
                }
            }
        }
    }
}