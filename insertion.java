public class Insertionsort {
    public static void insertionsortprint(int nums[])
    {
        for (int i=1;i<nums.length;i++)
        {
            int curr=nums[i];
            int prev=i-1;
            while (prev>=0&& nums[prev]>curr)
            {
                 nums[prev+1]=nums[prev];
                 prev--;
            }
            nums[prev+1]=curr;
        }

    }
    public static void printarr(int nums[])
    {
        for (int i=0;i<nums.length;i++)
        {
            System.out.print(nums[i]);
        }
    }
    public static void main (String args[])
    {
        int arr[]= { 5,4,1,3,2};
        insertionsortprint(arr);
        printarr(arr);

    }
}
