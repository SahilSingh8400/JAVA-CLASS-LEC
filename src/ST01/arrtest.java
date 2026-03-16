package ST01;
import java.util.Arrays;

// public class arrtest {
//     public static void main(String[] args) {
//         int arr[]={2,3,1,4};
//         for (int i=0; i<arr.length-1; i++){
//             for (int j=i+1; j<arr.length; j++){
//                 if(arr[i]<arr[j]){
//                     int temp=arr[i];
//                     arr[i]=arr[j];
//                     arr[j]=temp;
//                 }
//             }
//         }
//         for(int i=0; i<arr.length; i++){
//             System.out.println(arr[i]);
//         }
//         System.out.println(arr[1]);
//     }
// }

public class arrtest {

    public static void main(String[] args) {
        int arr[]={2,3,1,4};
        Arrays.sort(arr);
        System.out.println(arr[arr.length-2]);
    }
}