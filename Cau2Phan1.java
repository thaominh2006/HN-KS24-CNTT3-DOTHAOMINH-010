import java.util.*;
public class Cau2Phan1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so phan tu n: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Nhap cac phan tu: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int maxLength = 1;
        int curentLength = 1;
        for(int i = 1; i < n; i++){
            if(arr[i] > arr[i - 1]){
                curentLength++;
                maxLength = Math.max(maxLength, curentLength);
            }else{
                curentLength = 1;
            }
        }
        // Phan 1
        System.out.println("Do dai day tang lien tiep dai nhat: " + maxLength);
    }

}
