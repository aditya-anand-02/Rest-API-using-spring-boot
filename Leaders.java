public class Leaders {
    
    //Function to find the leaders in the array.
    public static void find(int arr[], int n){
        int max=arr[n-1];
        System.out.println("The leader is "+max);
        for(int i=n-1;i>=0;i--)
        {
            if(arr[i]>max)
            {max=arr[i];
            System.out.println("The leader is "+max);
            }
            else if(arr[i]<=max)
            {
                System.out.print(" ");
            }
        }
    }

        public static void main(String[] args) {
            int a[]={16, 17, 4, 3, 5, 2};
            
            find(a,6);
            
        }
    

    
}
