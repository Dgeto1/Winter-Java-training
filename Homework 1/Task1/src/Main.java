public class Main {
    public static void main(String[] args) {
        for(int i=1; i<=100; i++)
        {
            if(i%3==0 && i%5==0)
            {
                System.out.println("git hub");
                continue;
            }
            else if(i%3==0)
            {
                System.out.println("git");
                continue;
            }
            else if(i%5==0)
            {
                System.out.println("hub");
                continue;
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
            System.out.print(nums[i] + " ");
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
        /*int countOne = 0, countTwo = 0, countThree = 0, countFour = 0, countFive = 0;

        for(int i=0; i<arr.length; i++)
        {
            switch (arr[i]){
                case 1 -> countOne++;
                case 2 -> countTwo++;
                case 3 -> countThree++;
                case 4 -> countFour++;
                case 5 -> countFive++;
            }
        }
        int[] arr1 = new int[countOne];
        int[] arr2 = new int[countTwo];
        int[] arr3 = new int[countThree];
        int[] arr4 = new int[countFour];
        int[] arr5 = new int[countFive];

        for(int i=0; i<arr1.length; i++)
        {
            arr1[i] = 1;
        }
        for(int i=0; i<arr2.length; i++)
        {
            arr2[i] = 2;
        }
        for(int i=0; i<arr3.length; i++)
        {
            arr3[i] = 3;
        }
        for(int i=0; i<arr4.length; i++)
        {
            arr4[i] = 4;
        }
        for(int i=0; i<arr5.length; i++)
        {
            arr5[i] = 5;
        }*/

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