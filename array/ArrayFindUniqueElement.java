public class ArrayFindUniqueElement {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,4,3,2,1};
        int ans=0;

        for(int i=0; i<arr.length; i++)
        {
            ans=ans^arr[i];
        }
        System.out.println(ans);
    }
}
