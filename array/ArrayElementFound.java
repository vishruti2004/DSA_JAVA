public class ArrayElementFound {
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50};
        int temp=30;

        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]==temp)
            {
                System.out.println("found");
            }
        }
        

    }
}
