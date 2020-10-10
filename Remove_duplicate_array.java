import java.util.*;
public class Remove_duplicate_array{
    public static int removeDuplicate(int arr[],int n){
        if (n==0 || n==1){
            return n;
        }
        int[] temp = new int[n];
        int j = 0;
        for (int i=0; i<n-1; i++){
            if (arr[i] != arr[i+1]){
                temp[j++] = arr[i];
            }
        }
        temp[j++] = arr[n-1];

        for (int i=0; i<j; i++){
            arr[i] = temp[i];
        }
        return j;
    }
    public static void main(String[] args){
    Scanner s=new Scanner(System.in);
    int num=s.nextInt();
     int arr[]=new int[num];
    for(int i=0;i<arr.length;i++){
    arr[i]=s.nextInt();
        }
       int n1= removeDuplicate(arr,num);

        for (int i=0; i<n1; i++)
        System.out.print(arr[i]+" ");
}
}