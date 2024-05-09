import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int N;
        int[] arr = new int[6];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the array : ");
        for(int i=0; i< arr.length; i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter the position of the smallest element : ");
        N= sc.nextInt();

        Arrays.sort(arr);

        for(int i=0;i<arr.length;i++){
            if(i==N){
                System.out.println("the " +N+" smallest element is "+ arr[i-1]);
            }
        }
    }
}