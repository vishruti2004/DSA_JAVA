public class ArrayExtreme {
    public static void main(String[] args) {
        int arr[] = {10,20,40,50,60};
        int left=0;
        int right = arr.length-1;
       
        while (left<right) {
            System.out.println(arr[left]);
            System.out.println(arr[right]);
            left++;
            right--;
        }

        if(arr[left]==arr[right])
        {
            System.out.println(arr[left]);
        }
        
    }
}
