import java.util.*;
public class Cau2Phan2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so phan tu n: ");
        int n = sc.nextInt();
        int[] arr = new int[n + 1];
        System.out.println("Nhap cac phan tu: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Nhap gia tri x: ");
        int x = sc.nextInt();
        System.out.println("Nhap index(0 <= index <= n): ");
        int index = sc.nextInt();
        if (index < 0 || index > n) {
            System.out.println("Index khong hop le!");
            return;
        }
        for (int i = n; i > index; i--) {
            arr[i] = arr[i - 1];
        }
        arr[index] = x;
        n++;
        System.out.println("Mang sau khi chen la: ");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
        }
    }
}
