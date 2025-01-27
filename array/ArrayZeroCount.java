public class ArrayZeroCount {
    public static void main(String[] args) {
        int arr[] = {0,1,1,1,0,0,0,1,1,0};

        int zerocount=0;
        int onecount=0;

        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]==0)
            {
                zerocount++;
            }
            if(arr[i]==1)
            {
                onecount++;
            }
        }
        System.out.println("in array zero is " + zerocount + " " +  "times");
        System.out.println("in array one is"+onecount+" " + "times");

    }
}
