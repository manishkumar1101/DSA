import java.util.Scanner;

public class bubblesort {
    public static void bubblesort(int n,int[] arr){
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        // return arr;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        bubblesort(n, arr);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
