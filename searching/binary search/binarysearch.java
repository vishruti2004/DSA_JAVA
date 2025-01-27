public class binarysearch {
    public static void main(String[] args) {

        int arr[] = {10,20,30,40,50,60,70};
        int first=0;
        int last=arr.length-1;
        int target=50;

        while(first<=last)
        {
            int mid = first+(last-first)/2;


            if(arr[mid]==target)
            {
                System.out.println(arr[mid]);
                break;
            }

            else if(target<arr[mid])
            {
                last = mid-1;
            
            }

            else if(target>arr[mid])
            {
                first=mid+1;
            }
           
        }

    }
}
